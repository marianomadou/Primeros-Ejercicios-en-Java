/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package default1;

/**
 *
 * @author Administrador
 */
public class Sistema {
    
    
    public static void main(String[] args) {
        
        /*
        // Utilizado para escribir 
        Contacto contacto= new Contacto("Mariano","Madou");
        Serializacion serializa= new Serializacion();
        
        serializa.escribirObjeto(contacto);*/
        
        
        // Utilizado para Leer
        Contacto contacto=null;
        Serializacion serializa= new Serializacion();
        
        contacto=(Contacto) serializa.leerObjeto("objeto.txt");
        System.out.println(contacto.getNombre());
        System.out.println(contacto.getApellido());
        
        
        
    }
    
}
