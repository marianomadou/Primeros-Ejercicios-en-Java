/*
eliminar archivos
 */
package pack1;

import java.io.*;

public class claseFile4 {
    
    public static void main (String[] args)
    {
        File ruta=new File("C:"+File.separator+"Users"+File.separator+"mm"+File.separator+"Desktop"+File.separator+"UTN"+File.separator+"PRUEBA_JAVA"+File.separator+"Nuevo_Directorio"+File.separator+"prueba_texto.txt");
        ruta.delete();
        
    }
}
