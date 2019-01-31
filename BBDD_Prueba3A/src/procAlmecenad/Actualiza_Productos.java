package procAlmecenad;

import java.sql.*;
import javax.swing.JOptionPane;

public class Actualiza_Productos {
    
    
    public static void main (String[] args)
    {
        
        String nArticulo=JOptionPane.showInputDialog("Introduce nombre articulo a modificar");
        int nPrecio=Integer.parseInt(JOptionPane.showInputDialog("Introduce nuevo precio"));
        
        
        
        try{
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/BD_prueba?useSSL=false", "root", "");
            
            CallableStatement miSentencia=miConexion.prepareCall("{call ACTUALIZA_PROD(?,?)}");
            
            miSentencia.setInt(1, nPrecio);
            miSentencia.setString(2, nArticulo);
            
            miSentencia.execute();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
