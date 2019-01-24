/*
 SHOW VARIABLES WHERE VARIABLE_NAME IN ('hostname','port') //para ver el puerto donde está configurada la DB
 */
package conectaBD;

import java.sql.*;

public class Conecta_Pruebas {
    /*
    public static void main(String[] args)
    {
        try{
            //1. crear objeto conexion - 3306 es el puerto por defecto de mysql
            //?autoReconnect=true&useSSL=false para evadir el error de ssl
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_prueba?useSSL=false", "root", "");
            
            //2. crear objeto statement
            Statement miStatement=miConexion.createStatement();
            
            //3. Ejecutar la instruccion SQL
            ResultSet miResulset=miStatement.executeQuery("SELECT * FROM prueba_java");
            
            //4. Recorrer el resulset
            System.out.println("NOMBRE - CODIGO - PRECIO - FECHA");
            while(miResulset.next())
            {// se puede sustituir el nombre del campo de la tabla por el numero de indice de la tabla
                System.out.println(miResulset.getString("NOMBREARTICULO")+" - "+miResulset.getString("CODIGOARTICULO")+" - $ "+ miResulset.getDouble("PRECIO")+" - "+miResulset.getDate("FECHA"));
            }
            
        }catch(SQLException e)
        {
            System.out.println("NO CONECTA A LA BASE DE DATOS");
            e.printStackTrace();
        }
    }*/
}
