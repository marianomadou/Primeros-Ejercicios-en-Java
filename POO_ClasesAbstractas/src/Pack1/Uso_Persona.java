
package Pack1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
    
    public static void main (String [] args)
    {
        Persona[] lasPersonas=new Persona[2];
        
        lasPersonas[0]=new Alumno("Mariano", "Programacion");
        lasPersonas[1]=new Empleado("Silvia", 15800, 1992, 6, 14);
        
        for (Persona p: lasPersonas) {
            
            System.out.println(p.dameNombre() + ", "+ p.dameDescripcion());
            
        }
        
        
    }
    
    
    
}

abstract class Persona{
    //atributos
    private String _nombre;
    
    //constructor
    public Persona(String nombre)
    {
        _nombre=nombre;
    }
    
    //metodos
    public String dameNombre()
    {
        return _nombre;
    }
    public abstract String dameDescripcion();
}

class Empleado extends Persona
{
    //atributos
    private double _sueldo;
    private Date _altaContrato;
    private static int _idSiguiente;
    private int _id;
    
    //constructores
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia)
    {
        super(nombre);
        this._sueldo=sueldo;
        GregorianCalendar calendario=new GregorianCalendar(anio, mes-1, dia);
        _altaContrato=calendario.getTime();
        ++_idSiguiente;
        _id=_idSiguiente;
    }
    
    //metodos
    @Override
    public String dameDescripcion()
    {
        return "Este empleado tiene un Id " + _id + " con un sueldo de $"+_sueldo;
    }
  
    public double DameSueldo()//getter
    {
        return _sueldo;
    }
    public Date DameFechaContrato()//getter
    {
        return _altaContrato;
    }
    public void SubeSueldo(double porcentaje)//setter
    {
        double aumento=_sueldo*porcentaje/100;
        _sueldo+=aumento;
    }
}
class Alumno extends Persona{
    //atributos
    private String _carrera;
    
    //constructores
    public Alumno(String nombre, String carrera)
    {
        super(nombre);
        _carrera= carrera;
    }
    //metodos
    @Override
    public String dameDescripcion()
    {
        return "Este alumno está estudiando la carrera de "+_carrera;
    }
}