/*
Crear archivos y directorios
 */
package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class claseFile3 {
    
    public static void main (String[] args)
    {
        File ruta=new File("C:"+File.separator+"Users"+File.separator+"mm"+File.separator+"Desktop"+File.separator+"UTN"+File.separator+"PRUEBA_JAVA"+File.separator+"Nuevo_Directorio"+File.separator+"prueba_texto.txt");
        //ruta.mkdir();//Crea el directorio en la ruta especificada anteriormente
        
        String archivo_destino=ruta.getAbsolutePath();
        
        try 
            {
                ruta.createNewFile();
            }   
            catch (IOException error) 
            {
                error.printStackTrace();
            }   
        
        Escribiendo accede_es=new Escribiendo();
        accede_es.escribir(archivo_destino);
        
        
    }
    
}
///////////////////////////
class Escribiendo{
    
    public void escribir(String ruta_archivo)
    {
        String frase="Esto es un ejemplo. Espero que salga";
        
        try{
            FileWriter escritura= new FileWriter(ruta_archivo);
            
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();
            
        }catch(IOException error)
                {
                    System.out.println("Se produjo el siguiente error " +error);
                }
        
    }
}