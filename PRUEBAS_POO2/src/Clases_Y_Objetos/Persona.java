/*
 https://www.youtube.com/watch?v=qHyw-9CxXVs&list=PLWtYZ2ejMVJkjOuTCzIk61j7XKfpIR74K&index=66
SOBRECARGA DE METODOS
 */
package Clases_Y_Objetos;


public class Persona {
    
    //atributos
    String nombre;
    int edad;
    String dni;

    //metodos constructores
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr()
    {
        System.out.println("Soy "+nombre+" tengo "+edad+" y estoy corriendo una marathon.");
    }
    
    public void correr(int km)//diferencia por el tipo de parametros que reciben las funciones
    {
        System.out.println("He corrido "+km+" kilometros.");
    }
    
}



/*
//atributos
    String nombre;
    int edad;
    
    //Metodos
    public Persona(String nombre, int edad)//Metodos Constructor - no se pone el tipo de dato void int etc en los constructores
    {
        this.nombre=nombre; //java reconoce que this.nombre es el atributo y que nombre es el parametro del metodo persona
        this.edad=edad;
    }
    
    public void mostrarDatos()
    {
        System.out.print("El nombre es: "+nombre);
        System.out.println(" y mi edad es: "+edad);
        
    }
*/


/*
//Metodos
    public Persona(String _nombre, int _edad)//Metodos Constructor - no se pone el tipo de dato void int etc en los constructores
    {
        nombre=_nombre;
        edad=_edad;
    }
*/