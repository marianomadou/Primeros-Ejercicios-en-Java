/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transacciones;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Transaccion_Productos {
    
    
    public static void main(String[] args) 
    {
        
        Connection miConexion=null;
        
        try{					
	
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_PRUEBA?useSSL=false", "root", "");				
            miConexion.setAutoCommit(false);//por default siempre está en true, hay que cambiarlo a false - desde acá actua como un bloque
            Statement miStatement =miConexion.createStatement();

            String instruccionSql_1="DELETE FROM prueba_java WHERE PAISDEORIGEN='JAPON'";
            String instruccionSql_2="DELETE FROM prueba_java WHERE PRECIO>250";
            String instruccionSql_3="UPDATE prueba_java SET PRECIO=PRECIO*1.15";
            
            boolean ejecutar=ejecutar_transaccion();
            
            if (ejecutar=true)
            {
                miStatement.executeUpdate(instruccionSql_1);
                miStatement.executeUpdate(instruccionSql_2);
                miStatement.executeUpdate(instruccionSql_3);
                miConexion.commit();
                System.out.println("Se ejecutó la transaccion correctamente");
            }
            else{
                System.out.println("No se realizo cambios en BBDD");
            }

        }catch(SQLException e)
        {
            try {
                miConexion.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(Transaccion_Productos.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Algo salio mal en la operacion. No se realizaron cambios en BBDD");
            e.printStackTrace();	
        }
    }
    
static boolean ejecutar_transaccion()    
{
    String ejecucion=JOptionPane.showInputDialog("Ejecutamos transaccion?");
            if(ejecucion.equals("Si"))
            {
                return true;
            }
            else{
                return false;
            }
}
    
}
