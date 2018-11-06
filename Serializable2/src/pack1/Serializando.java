package pack1;

import java.util.*;

import java.io.*;

public class Serializando {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Administrador jefe=new Administrador("Juan", 80000, 2004,12,15);
		
		jefe.setIncentivo(5000);
		
		Empleado[] personal=new Empleado[3];//almacenamos 3 objetos . jefe + empleado + empleado
		
		personal[0]=jefe;
		personal[1]=new Empleado("Ana", 25000, 2009, 10,1);
		personal[2]=new Empleado("Luis", 18000, 2018, 9,15);
		
         
                
         
                try{
                    ObjectOutputStream escribiendo_archivo =new ObjectOutputStream(new FileOutputStream("empleados.txt"));
                    escribiendo_archivo.writeObject(personal);//Escribo los datos 
                    escribiendo_archivo.close();//cierro el archivo
                    
                    ObjectInputStream recuperar_archivo = new ObjectInputStream(new FileInputStream("empleados.txt"));
                    Empleado[] personalRecuperado = (Empleado[]) recuperar_archivo.readObject();//guardo los datos en un array de tipo empleado
                    recuperar_archivo.close();//cierro el archivo
                    
                    for (Empleado e : personalRecuperado) //leo los datos recuperados
                    {
                        System.out.println(e); 
                    }
                    
                }catch(IOException error)
                {
                    System.out.println("Se produjo un error "+error);
                }
         
		
		

	}

        
    
}

//-----------------------------------------------------------------------------------------------------------

class Empleado implements Serializable {
    
    

        public Empleado(String n, double s, int agno, int mes, int dia)
        {
            nombre=n;
            sueldo=s;
            GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);	
            fechaContrato=calendario.getTime();
	}

	public String getNombre() 
        {
		return nombre;
	}

	public double getSueldo() 
        {
		return sueldo;
	}

	public Date getFechaContrato() 
        {
		return fechaContrato;
	}

	
	public void subirSueldo(double porcentaje)
        {	
		double aumento=sueldo*porcentaje/100;	
		sueldo+=aumento;	
	}
	
	public String toString()
        {	
		return "El Nombre es: " + nombre + ", y su sueldo es: $" + sueldo + ", fecha de contrato: " + fechaContrato;	
	}

	private String nombre;
	private double sueldo;
	private Date fechaContrato;
	
}

//--------------------------------------------------------------------------------------------------------

class Administrador extends Empleado{

        public Administrador(String n, double s, int agno, int mes, int dia)
        {
            super(n,s,agno,mes,dia);		
            incentivo=0;		
	}
		
	public double getSueldo()
        {
            double sueldoBase=super.getSueldo();
            return sueldoBase + incentivo;		
	}
		
	public void setIncentivo(double b)
        {
            incentivo=b;
        }
		
	public String toString()
        {
            return super.toString() + ". Incentivo: " + incentivo;
	}
	
	private double incentivo;
	
}

