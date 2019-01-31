/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procAlmecenad;

import java.sql.*; 

public class ConsultaPaises {
    
    public static void main (String[] args)
    {
        try{
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_prueba?useSSL=false", "root", "");
            
            CallableStatement miSentencia=miConexion.prepareCall("{call MUESTRA_PAIS}");
            
            ResultSet rs=miSentencia.executeQuery();
            
            while(rs.next())
            {
                System.out.println(rs.getString(2)+ " - " + rs.getString(3)+ " - "+ rs.getString(4)+ " - "+ rs.getString(7));
            }rs.close();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
