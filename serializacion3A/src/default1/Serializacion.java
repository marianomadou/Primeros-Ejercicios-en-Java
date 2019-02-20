
package default1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {
    
    private ObjectInputStream lectorDeObjetos;
    private ObjectOutputStream escritorDeObjetos;
    
    public void escribirObjeto (Object objeto)
    {
        try {
            escritorDeObjetos=new ObjectOutputStream(new FileOutputStream("objeto.txt"));
            escritorDeObjetos.writeObject(objeto);
        } catch (FileNotFoundException ex) 
        {
            ex.printStackTrace();
        } catch (IOException e1)
        {
            e1.printStackTrace();
        }
    }
    
    public Object leerObjeto(String nombreDeArchivo)
    {
        Object retorno=null;
        
        try {
            lectorDeObjetos= new ObjectInputStream(new FileInputStream(nombreDeArchivo));
            retorno=lectorDeObjetos.readObject();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e2)
        {
            e2.printStackTrace();
        } catch (ClassNotFoundException ex2) {
            ex2.printStackTrace();
        }        
        return retorno;        
    }
    
}
