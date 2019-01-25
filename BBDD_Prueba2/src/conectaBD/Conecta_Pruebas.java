/*
 * CONSULTAS PREPARADAS
    * Permiten pasar parametros a las sentencias SQL
    * Previenen ataques de inyeccion SQL
    * Tienen un mejor rendimiento (son sentencias precompiladas y reutilizables

consulta normal (SELECT * FROM PRODUCTOS WHERE SECCION='DEPORTE' AND PAISDEORIGEN='ESPAÑA')
consulta preparada (SELECT * FROM PRODUCTOS WHERE SECCION=? AND PAISDEORIGEN=?)
interface PreparedStatement
 */
package conectaBD;

import java.sql.*;

public class Conecta_Pruebas {
    
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
