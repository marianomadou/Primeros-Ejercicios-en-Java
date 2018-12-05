/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


public class UsoEmpleado {
    
    public static void main(String[] args)
    {
        Jefatura jefeRRHH=new Jefatura("Gustavo", 70000, 1991, 8, 24);
        
        jefeRRHH.estableceIncentivo(2570);
        
        Empleado[] misEmpleados=new Empleado[6];
        
        misEmpleados[0]=new Empleado("Mariano", 30000, 2002, 7, 22);
        misEmpleados[1]=new Empleado("Silvia", 50000, 1995, 6, 15);
        misEmpleados[2]=new Empleado("Laura", 42300, 1998, 9, 12);
        misEmpleados[3]=new Empleado("Mecha", 55000, 1992, 1, 1);
        misEmpleados[4]=jefeRRHH;
        misEmpleados[5]=new Jefatura("Maria", 95000, 1999, 5, 26);
        //casting
        Jefatura jefaFinanzas=(Jefatura) misEmpleados[5];
        jefaFinanzas.estableceIncentivo(15000);
        
        //Jefatura jefeCompras=(Jefatura) misEmpleados[1];//un empleado no es un jefe, lanza error en tiempo de ejecucion
        //jefeCompras.estableceIncentivo(500);//un empleado no es un jefe, lanza error en tiempo de ejecucion
        
        System.out.println("Lista de empleados: \n");
        for (Empleado e : misEmpleados) 
        {
            e.SubeSueldo(5);
        }
        
        
        
        for (Empleado e : misEmpleados) 
        {
            System.out.println("Nombre: "+e.DameNombre()
            +" - Sueldo: "+e.DameSueldo() //en [4] llama a DameSueldo de la clase Jefatura - Polimorfismo al palo - la VM de java elige el metodo por enlazado dinamico
            +" - Fecha de alta: "+e.DameFechaContrato());
        }
    }
}

class Empleado
{
    //atributos
    private String _nombre;
    private double _sueldo;
    private Date _altaContrato;
    private static int _idSiguiente;
    private int _id;
    
    
    
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia)//constructores
    {
        this._nombre=nombre;
        this._sueldo=sueldo;
        GregorianCalendar calendario=new GregorianCalendar(anio, mes-1, dia);
        _altaContrato=calendario.getTime();
        ++_idSiguiente;
        _id=_idSiguiente;
    }
    
    public Empleado(String nombre)//constructores
    {
        this(nombre, 30000, 2000,01,01);
    }

    public String DameNombre()//getter
    {
        return _nombre + " - Id: " + _id;
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
class Jefatura extends Empleado
{
    //atributos
    private double _incentivo;
    
    public Jefatura(String nombre, double sueldo, int anio, int mes, int dia)
    {
        super(nombre, sueldo, anio, mes, dia);   
    }
    public void estableceIncentivo(double b) {
        this._incentivo = b;
    }
    @Override
    public double DameSueldo() {
        double sueldoJefe=super.DameSueldo();
        return sueldoJefe + _incentivo;
    }    
}
