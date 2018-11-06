
package serializacion.Leyendo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoArchivo {
    
    public static void main(String[]args)
    {
        leerArchivo accediendo=new leerArchivo();
        accediendo.lee();
    }
    
    
}
class leerArchivo
{
    public void lee()
    {
        try 
        {
            FileReader entrada=new FileReader("archivo.txt");
            //int c= entrada.read();
            int c=0;
            while(c!=-1)
            {
                c=entrada.read();
                char letra=(char)c;
                System.out.print (letra);
            }
            
        } 
        catch (IOException error) 
        {
            System.out.println("Atencion! No se encontró el archivo.");
        }
    }
    
    
}