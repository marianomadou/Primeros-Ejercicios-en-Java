
package arraylist;

import java.util.*;

public class eEmpleado {
    
    public static void main(String[] args)
    {
        ArrayList <Empleado> listaEmpleados =new ArrayList <Empleado>();
        
        //listaEmpleados.ensureCapacity(11); le indicamos a la api la capacidad que va a tener el arraylist para que no consuma memoria de manera innecesaria
        
        listaEmpleados.add(new Empleado("Mariano",40,25000));
        listaEmpleados.add(new Empleado("Gustavo",48,34000));
        listaEmpleados.add(new Empleado("Rocio",25,18000));
        listaEmpleados.add(new Empleado("Fernanda",28,22000));
        listaEmpleados.add(new Empleado("Mariano",40,25000));
        listaEmpleados.add(new Empleado("Gustavo",48,34000));
        listaEmpleados.add(new Empleado("Rocio",25,18000));
        listaEmpleados.add(new Empleado("Fernanda",28,22000));
        listaEmpleados.add(new Empleado("Mariano",40,25000));
        listaEmpleados.add(new Empleado("Gustavo",48,34000));
        listaEmpleados.add(new Empleado("Fernanda",28,22000));
        listaEmpleados.add(new Empleado("Rocio",25,18000));
        listaEmpleados.add(new Empleado("Bernardo",28,22000));
        
        //listaEmpleados.trimToSize();//elimina el exceso de memoria que ocupa la parte no usada del arraylist. optimiza recursos
        //listaEmpleados.set(1, new Empleado("Bernardo",28,22000));//metodo set. inserto un empleado en la posicion 1 del arraylist
        //System.out.println(listaEmpleados.get(5).DameDatos());//metodo get. devuelve un objeto en una posicion index
        
        
        System.out.println("cantidad de elementos del arraylist: "+listaEmpleados.size()+" elementos.");
       
        /*for (Empleado e : listaEmpleados) //bucle fore
        {
            System.out.println(e.DameDatos());            
        }*/

        /*for (int i = 0; i < listaEmpleados.size(); i++) //bucle fori convencional
        {
            Empleado e=listaEmpleados.get(i);
            System.out.println(e.DameDatos());
        }*/

        Iterator<Empleado> miIterador=listaEmpleados.iterator();
        
        while(miIterador.hasNext())
        {
            System.out.println(miIterador.next().DameDatos());
        }
    }
    
}

class Empleado
{
    //atributos
    private String nombre;
    private int edad;
    private double salario;
    
    //constructor
    public Empleado(String nombre, int edad, double salario)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }
    
    //metodos
    public String DameDatos()
    {
        return "El empleado se llama " +nombre+ " tiene " +edad+ " años y un salario de $" +salario;
    }
}