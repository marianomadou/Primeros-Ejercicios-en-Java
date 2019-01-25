/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DDBB_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class conexionDDBB {
    
     public static void main(String[] args)
    {
        try{
            //1. crear objeto conexion
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_prueba?useSSL=false", "root", "");
            
            //2. Preparar consulta
            PreparedStatement miSentencia=miConexion.prepareStatement("SELECT NOMBREARTICULO, SECCION, PAISDEORIGEN FROM prueba_java WHERE SECCION=? AND PAISDEORIGEN=?");
            
            //3. Establecer parametros de consulta
            miSentencia.setString(1, "DEPORTES");
            miSentencia.setString(2, "USA");
            
            //4. Ejecutar y recorrer consulta
            ResultSet miResulset=miSentencia.executeQuery();
            
            while(miResulset.next())
            {// se puede sustituir el nombre del campo de la tabla por el numero de indice de la tabla
                System.out.println(miResulset.getString(1)+" - "+miResulset.getString(2)+" - "+miResulset.getString(3));
            }
            miResulset.close();
            
            //Reutilizacion de consulta SQL
            System.out.println("\nEJECUCION Segunda consulta");
            
            miSentencia.setString(1, "FERRETERIA");
            miSentencia.setString(2, "ESPAÑA");
            
            //4. Ejecutar y recorrer consulta
            miResulset=miSentencia.executeQuery();
            
            while(miResulset.next())
            {// se puede sustituir el nombre del campo de la tabla por el numero de indice de la tabla
                System.out.println(miResulset.getString(1)+" - "+miResulset.getString(2)+" - "+miResulset.getString(3));
            }
            miResulset.close();
            
        }catch(SQLException e)
        {
            System.out.println("NO CONECTA A LA BASE DE DATOS");
            e.printStackTrace();
        }
    }
    
}
