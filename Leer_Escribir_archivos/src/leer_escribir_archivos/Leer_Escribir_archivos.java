
package leer_escribir_archivos;

import java.io.*;
import java.io.BufferedReader;
public class Leer_Escribir_archivos {

    
    
    public static void main(String[] args) {
    
        //Escritura
        String texto = "Mi escritura en el archivo\nSegunda linea";
        
        File archivo = new File("miarchivo.txt");// comprobar si existe el archivo para evitar sobreescritura
        archivo.exists();//devuelve true si existe y false si no existe
        
        try
        {
            PrintWriter pw = new PrintWriter("miarchivo.txt");
            pw.println(texto);
            pw.close();
        }catch(IOException err)
        {
            
        }
        
        

//lectura
        //String texto;
        try
        {
            FileReader fr = new FileReader("miarchivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());//lee la primer linea
            //System.out.println(br.readLine());//lee la segunda linea
        }catch (IOException err)
        {
            System.out.println(err.getMessage());
        }

        
                
        
        
        
        
    }
    
}
