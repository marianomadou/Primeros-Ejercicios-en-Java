/*
CLASE FILE
String getAbsolutePath()
String getPath()
String getCanonicalPath()
Boolean exists()
String[]list()
Boolean isDirectory()
 */
package pack1;

import java.io.*;

public class claseFile {
   
    public static void main (String[] args)
    {
        //File archivo=new File("archivo_ejemplo");
        File archivo=new File("src");//carpeta src en el proyecto
        System.out.println(archivo.getAbsolutePath());
        System.out.println(archivo.exists());//false si no existe - true si existe
        
        
        
    }
}
