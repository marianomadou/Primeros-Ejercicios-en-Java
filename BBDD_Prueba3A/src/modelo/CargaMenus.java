/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import vista.*;
import controlador.*;
/**
 *
 * @author Administrador
 */
public class CargaMenus {
    
    public Conexion miConexion;
    public ResultSet rs;//para secciones
    public ResultSet rs2;//para paises
    
    public CargaMenus()
    {
        miConexion= new Conexion();
    }
    
    public String ejecutaConsultas()
    {
        Productos miProducto=null;
        
        Connection accesoBBDD=miConexion.dameConexion();
        
        try{
            Statement secciones=accesoBBDD.createStatement();
            Statement paises=accesoBBDD.createStatement();
            
            rs=secciones.executeQuery("SELECT DISTINCTROW SECCION FROM prueba_java");
            rs2=paises.executeQuery("SELECT DISTINCTROW PAISDEORIGEN FROM prueba_java");
            
                miProducto=new Productos();
                miProducto.setSeccion(rs.getString(1));
                miProducto.setpOrigen(rs2.getString(1));
            
            rs.close();
            rs2.close();
            accesoBBDD.close();
            
        }catch(SQLException e)
        {
            System.out.println("NO CONECTA A LA BASE DE DATOS\n");
            e.printStackTrace();
        }
        
        return miProducto.getSeccion();
    }
    
    
}
