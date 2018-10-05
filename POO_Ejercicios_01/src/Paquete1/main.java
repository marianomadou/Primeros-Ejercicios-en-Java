
package Paquete1;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args)
    {
        Cuadrilatero c1;
        float lado1;
        float lado2;
        
        Scanner lector=new Scanner(System.in);
        
        System.out.println("Ingrese el primer lado del cuadrilatero: ");
        lado1=lector.nextInt();
        
        System.out.println("Ingrese el segundo lado del cuadrilatero: ");
        lado2=lector.nextInt();
        
            if (lado1==lado2) //si son iguales los lados significa que es un cuadrado
            {
                c1=new Cuadrilatero(lado1);
            }
                else//si es cuadrilatero
                {
                    c1=new Cuadrilatero(lado1, lado2);
                }
            
        System.out.println("El perimetro es: "+c1.getPerimetro()+" m2");
        System.out.println("El area es: "+c1.getArea()+" m2");
    }
    
}
