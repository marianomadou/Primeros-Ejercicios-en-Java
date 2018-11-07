package pack1;
//leyendo archivos y directorios
import java.io.*;

public class claseFile2 {
    
    public static void main (String[] args)
    {
        //File ruta=new File("C:/Users/mm/Desktop/UTN/PRUEBA_JAVA");
        File ruta=new File("C:"+File.separator+"Users"+File.separator+"mm"+File.separator+"Desktop"+File.separator+"UTN"+File.separator+"PRUEBA_JAVA");
        System.out.println(ruta.getAbsolutePath());
        System.out.println(ruta.exists());
        String[] nombres_archivos=ruta.list();
        
        for (int i = 0; i < nombres_archivos.length; i++) {
            System.out.println(nombres_archivos[i]);           
            
            File fp=new File(ruta.getAbsolutePath(),nombres_archivos[i]);
            
            if(fp.isDirectory())
            {
                String[] subcarpetas_archivos=fp.list();
                
                for (int j = 0; j < subcarpetas_archivos.length; j++) {
                    
                    System.out.println(subcarpetas_archivos[j]);
                    
                }
            }
        }
        
        
        
    }
}
