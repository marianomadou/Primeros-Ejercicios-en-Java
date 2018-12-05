/*
HACER UN PROGRAMA PARA CALCULAR EL AREA DE POLIGONOS (TRIANGULOS Y RECTANGULOS) EL PROGRAMA DEBE SER CAPAZ DE ALMACENAR EN UN ARRAY N TRIANGULOS Y RECTANGULOS,
Y AL FINAL MOSTRAR EL AREA Y LOS DATOS DE CADA UNO. PARA ELLO SE TENDRA LO SIGUIENTE:
- UNA SUPERCLASE LLAMADA POLIGONO
- UNA SUBCLASE LLAMADA RECTANGULO
- UNA SUBCLASE LLAMADA TRIANGULO

 */
package Pack1;

import java.util.ArrayList;//libreria de ArrayList
import java.util.Scanner;//libreria de ingreso por Scanner

public class Main {
    static Scanner entrada= new Scanner(System.in);
    
    // creo un array list para almacenar poligonos
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    
    
    public static void main(String[] args)
    {
        //cargar poligono
        CargarPoligono();
        
        //mostrar los datos de cada poligono
        MostrarResultados();
        
    }
    
    public static void CargarPoligono()
    {
        char respuesta;
        int opcion;
        do
        {
            do{
                
            System.out.println("Ingrese que poligono desea calcular ");
            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.print("Ingrese la opcion: ");
            opcion=entrada.nextInt();
            }while(opcion<1 || opcion>2);
            
            switch(opcion)
            {
                case 1: //llenar el triangulo
                    CargarTriangulo();
                    break;
                
                case 2: //llenar el rectangulo
                    CargarRectangulo();
                    break;
            }
            System.out.println("Desea ingresar otro poligono? s/n");
            respuesta=entrada.next().charAt(0);
            System.out.println("");
        }while(respuesta=='s'||respuesta=='S');
        
    }
    
    public static void CargarTriangulo()
    {
        double lado1, lado2, lado3;
        
        System.out.println("Ingrese el lado 1 del triangulo: ");
        lado1=entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del triangulo: ");
        lado2=entrada.nextDouble();
        System.out.println("Ingrese el lado 3 del triangulo: ");
        lado3=entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo (lado1, lado2, lado3);
        
        //guardamos un triangulo dentro del arraylist de poligono
        poligono.add(triangulo);
    }
    
    public static void CargarRectangulo()
    {
        double lado1, lado2;
        
        System.out.println("Ingrese el lado 1 del rectangulo: ");
        lado1=entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del rectangulo: ");
        lado2=entrada.nextDouble();
        
        Rectangulo rectangulo= new Rectangulo(lado1,lado2);
        
        //guardamos un rectangulo dentro del arraylist de poligono
        poligono.add(rectangulo);
    }
    
    public static void MostrarResultados()
    {
        //recorriendo el arraylist de poligono
        for(Poligono poli:poligono)
        {
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.Area());
            System.out.println("");
        }
    }
}
