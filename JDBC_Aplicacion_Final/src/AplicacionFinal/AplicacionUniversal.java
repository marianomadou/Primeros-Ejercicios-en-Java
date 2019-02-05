package AplicacionFinal;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class AplicacionUniversal {
    
    public static void main(String[] args) {
    		
	MarcoBBDD mimarco=new MarcoBBDD();
	
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	mimarco.setVisible(true);

    }
}

class MarcoBBDD extends JFrame{

    public MarcoBBDD(){
        setBounds(300,300,700,700);
	LaminaBBDD milamina=new LaminaBBDD();
        add(milamina);
    }	
}

class LaminaBBDD extends JPanel{

    private JComboBox comboTablas;
    private JTextArea areaInformacion;
    private Connection miConexion;
    private FileReader entrada;
    
    
    public void conectarBBDD() 
    {
        miConexion=null;
        String datos[]=new String[3];

        try{
            entrada=new FileReader("C:/Users/Administrador/Downloads/apuntes tecnicatura/2do-cuatrimestre/Programacion II/JDBC_Aplicacion_Final/datos_config.txt");
        }catch(IOException e){
            
        JOptionPane.showMessageDialog(this, "No se ha encontrado el archivo de conexion a la BBDD");
            
        JFileChooser chooser=new JFileChooser();
    
        FileNameExtensionFilter filter=new FileNameExtensionFilter("RUTA DEL ARCHIVO DE BBDD", "txt");
    
        chooser.setFileFilter(filter);
        
        int returnVal=chooser.showOpenDialog(this);
    
        if (returnVal== JFileChooser.APPROVE_OPTION)
        {
            try {
                entrada=new FileReader(chooser.getSelectedFile().getAbsolutePath());
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        
    }

        try{
            
          
            BufferedReader miBuffer=new BufferedReader(entrada);
            
            for (int i = 0; i <=2; i++) //recorre 3 posiciones, de 0 a 2 buscando las lineas de texto del archivo de conexion txt
            {
                datos[i]=miBuffer.readLine();
            }
            
            miConexion=DriverManager.getConnection(datos[0],datos[1],datos[2]);
            
            entrada.close();
           
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        }
         
    
    
    public void obtenerTablas()
    {
        ResultSet miResultSet=null;
        
        try{
            
            DatabaseMetaData datosBBDD=miConexion.getMetaData();
            miResultSet=datosBBDD.getTables(null, null, null, null);
            while(miResultSet.next())
            {
                comboTablas.addItem(miResultSet.getString("TABLE_NAME"));
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public LaminaBBDD(){
		
	setLayout(new BorderLayout());
	comboTablas=new JComboBox();
        areaInformacion=new JTextArea();
        add(areaInformacion,BorderLayout.CENTER);
        conectarBBDD();
        obtenerTablas();
        comboTablas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String nombreTabla=(String)comboTablas.getSelectedItem();
                
                mostrarInfoTabla(nombreTabla);
            }
        });
        add(comboTablas, BorderLayout.NORTH);
        
    }
    
    public void mostrarInfoTabla(String tabla){
        
        ArrayList<String> campos= new ArrayList<>();
        String consulta="SELECT * FROM " + tabla;
        
        try{
            areaInformacion.setText(" ");//borra el area de informacion antes de seleccionar una tabla
            
            Statement miStatement=miConexion.createStatement();
            ResultSet miResultSet=miStatement.executeQuery(consulta);
            ResultSetMetaData rsBBDD=miResultSet.getMetaData();
            
            for(int i=1;i<=rsBBDD.getColumnCount();i++)
            {
                campos.add(rsBBDD.getColumnLabel(i));
            }
            
            while(miResultSet.next())
            {
                for (String nombreCampo : campos) {
                    
                    areaInformacion.append(miResultSet.getString(nombreCampo)+" ");
                }
                areaInformacion.append("\n");
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}	