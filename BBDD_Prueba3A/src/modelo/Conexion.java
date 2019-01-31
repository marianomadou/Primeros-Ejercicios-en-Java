/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

/**
 *
 * @author Administrador
 */
public class Conexion {
    
    Connection miConexion=null;
    
    public Conexion()
    {
        
    }
    public Connection dameConexion()
    {
        try{
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_prueba?useSSL=false", "root", "");

        }catch(SQLException e)
        {System.out.println("No se pudo conectar a la base.Conexion.java");
            e.printStackTrace();}
        
        return miConexion;
    }
}
