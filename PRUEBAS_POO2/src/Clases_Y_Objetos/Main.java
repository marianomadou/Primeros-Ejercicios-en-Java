/*
SOBRECARGA DE METODOS
 */
package Clases_Y_Objetos;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args)
    {
       
        Persona persona1=new Persona("Mariano",38);
        
        persona1.correr();
        persona1.correr(20);
        
        Persona persona2=new Persona("1212312");
        persona2.correr(42);
    }
}
/*
 Persona p1=new Persona("Mariano",38);
        
        p1.mostrarDatos();
*/