/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DDBB_Connect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Aplicacion_Consutal {
    
    public static void main(String[] args) 
    {
        JFrame mimarco=new Marco_Aplicacion();
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mimarco.setVisible(true);
    }
}

class Marco_Aplicacion extends JFrame
{
    public Marco_Aplicacion()
    {	
	setTitle ("Consulta BBDD");	
	setBounds(500,300,400,400);
	setLayout(new BorderLayout());
	JPanel menus=new JPanel();
	menus.setLayout(new FlowLayout());
	secciones=new JComboBox();
	secciones.setEditable(false);
	secciones.addItem("Todos");
	paises=new JComboBox();
	paises.setEditable(false);
	paises.addItem("Todos");
	resultado= new JTextArea(4,50);
	resultado.setEditable(false);
	add(resultado);
	menus.add(secciones);
	menus.add(paises);	
	add(menus, BorderLayout.NORTH);
	add(resultado, BorderLayout.CENTER);
	JButton botonConsulta=new JButton("Consulta");	
	botonConsulta.addActionListener(new ActionListener() {
            @Override//este codigo escucha al boton consulta
            public void actionPerformed(ActionEvent ae) {
                EjecutaConsulta();
            }
        });
        add(botonConsulta, BorderLayout.SOUTH);
        
        //conexion con DDBB
        try{
            //1. crear objeto conexion
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_prueba?useSSL=false", "root", "");
            //2. crear objeto statement
            Statement sentencia=miConexion.createStatement();
            //3. construir sentencia sql
            
            //CARGA JCOMBOX SENTENCIAS
            String consulta="SELECT DISTINCTROW SECCION FROM prueba_java";
            ResultSet miRs=sentencia.executeQuery(consulta);
            while(miRs.next())
            {
                secciones.addItem(miRs.getString(1));
            }
            miRs.close();
            
            //CARGA JCOMBOX PAISES reutilizando codigo anterior
            consulta="SELECT DISTINCTROW PAISDEORIGEN FROM prueba_java";//filtra los registros para que no los duplique
            miRs=sentencia.executeQuery(consulta);
            while(miRs.next())
            {
                paises.addItem(miRs.getString(1));
            }
            miRs.close();
            
        }catch(SQLException e)
        {
            System.out.println("NO CONECTA A LA BASE DE DATOS");
            e.printStackTrace();
        }
        
        
    }	
    
        private void EjecutaConsulta()
        {
            ResultSet rs=null;
            
            try{
                resultado.setText("");//resetea el cuadro resultado
                
                String seccion=(String)secciones.getSelectedItem();
                String pais=(String)paises.getSelectedItem();
                
                if(!seccion.equals("Todos") && pais.equals("Todos"))
                {
                    enviaConsultaSeccion=miConexion.prepareStatement(consultaSeccion);
                    enviaConsultaSeccion.setString(1, seccion);
                    rs=enviaConsultaSeccion.executeQuery();
                }
                    else if(seccion.equals("Todos") && !pais.equals("Todos"))
                    {
                        enviaConsultaPais=miConexion.prepareStatement(consultaPais);
                        enviaConsultaPais.setString(1, pais);
                        rs=enviaConsultaPais.executeQuery();
                    }
                        else if(!seccion.equals("Todos") && !pais.equals("Todos"))
                        {
                            enviaConsultaTodos=miConexion.prepareStatement(consultaTodos);
                            enviaConsultaTodos.setString(1, seccion);
                            enviaConsultaTodos.setString(2, pais);
                            rs=enviaConsultaTodos.executeQuery();
                        }
                
                while(rs.next())
                {
                    resultado.append(rs.getString(1));
                    resultado.append(", ");
                    resultado.append(rs.getString(2));
                    resultado.append(", ");
                    resultado.append(rs.getString(3));
                    resultado.append(", ");
                    resultado.append(rs.getString(4));
                    resultado.append("\n");
                }
                rs.close();
                
            }catch(SQLException ex)
            {
                System.out.println("ERROR de ejecucion de consulta");
            }
            
        }
        
        
        private Connection miConexion;
    
	private PreparedStatement enviaConsultaSeccion;
        private PreparedStatement enviaConsultaPais;
        private PreparedStatement enviaConsultaTodos;
        
        private final String consultaSeccion="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRUEBA_JAVA WHERE SECCION=?";
        private final String consultaPais="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRUEBA_JAVA WHERE PAISDEORIGEN=?";
        private final String consultaTodos="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRUEBA_JAVA WHERE SECCION=? AND PAISDEORIGEN=?";
        
        private JComboBox secciones;	
	private JComboBox paises;
	private JTextArea resultado;	
}
