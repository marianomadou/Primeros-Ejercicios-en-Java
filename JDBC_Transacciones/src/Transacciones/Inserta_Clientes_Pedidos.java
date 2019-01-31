
package Transacciones;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Inserta_Clientes_Pedidos {
    
    public static void main(String[] args) 
    {
        
        Connection miConexion=null;
        
        try{					
	
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_PRUEBA?useSSL=false", "root", "");				

            miConexion.setAutoCommit(false);//por default siempre está en true, hay que cambiarlo a false - desde acá actua como un bloque

            Statement miStatement =miConexion.createStatement();

            String instruccionSql_1="INSERT INTO CLIENTES (CÓDIGOCLIENTE, EMPRESA, DIRECCIÓN) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";

            miStatement.executeUpdate(instruccionSql_1);
			    
	    String instruccionSql_2="INSERT INTO PEDIDOS (NÚMERODEPEDIDO, CÓDIGOCLIENTE,FECHADEPEDIDO) VALUES('82', 'CT84', '11/03/2000')";

            miStatement.executeUpdate(instruccionSql_2);

            miConexion.commit();//trabaja a todo o nada, si alguna de las dos (o las dos instrucciones) son erroneas o no se pueden ejecutar 
            //no ejecuta todo el bloque y entra dentro del catch al rollback para que haga su tarea

            System.out.println("Datos INSERTADOS correctamente");

        }catch(SQLException e)
        {
            try {
                miConexion.rollback();//asegura la integridad de los datos y vuelve la base al mismo instante previo a la consulta
            } catch (SQLException ex) {
                Logger.getLogger(Inserta_Clientes_Pedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("ERROR EN LA INSERCIÓN DE DATOS!!");
            
            e.printStackTrace();	
        }
    }
    
}
