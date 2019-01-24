/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectaBD;

import java.sql.*;

/**
 *
 * @author Administrador
 */
public class ModificaBD {
    
    public static void main(String[] args)
    {
        
         try{
            //1. crear objeto conexion - 3306 es el puerto por defecto de mysql
            //?autoReconnect=true&useSSL=false para evadir el error de ssl
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_prueba?useSSL=false", "root", "");
            
            //2. crear objeto statement
            Statement miStatement=miConexion.createStatement();
            
            //3. insertar registros
            /*
            String instruccionSql="INSERT INTO prueba_java (CODIGOARTICULO, NOMBREARTICULO, PRECIO) VALUES('AR77','PANTALON',151.23)";
            
            miStatement.executeUpdate(instruccionSql);
            
            System.out.println("Datos insertados correctamente");*/
             
            //4. consulta de actualizacion
            /*String instruccionSql2="UPDATE prueba_java SET PRECIO=PRECIO*2 WHERE CODIGOARTICULO='AR77'";
            
            miStatement.executeUpdate(instruccionSql2);
            
            System.out.println("Datos modificados correctamente");*/
            
            //5. Eliminar datos
            String instruccionSql3="DELETE FROM prueba_java WHERE CODIGOARTICULO='AR77'";
            
            miStatement.executeUpdate(instruccionSql3);
            
            System.out.println("Datos eliminados correctamente");
            
        }catch(SQLException e)
        {
            System.out.println("NO CONECTA A LA BASE DE DATOS");
            e.printStackTrace();
        }
        
        
    }
    
}
