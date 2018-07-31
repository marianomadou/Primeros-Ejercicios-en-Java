/*
 Hacer un programa que calcule el cuadrado de una suma
(a+b)2=a2+b2+2ab
 */
package sumadecuadrados;

import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Sumadecuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        int num1, num2, suma, multiplicacionAB, primerTermino, segundoTermino, tercerTermino;
        
        System.out.println("SUMA DE CUADRADOS...(a+b)2");
        System.out.println("Ingrese el primer operando");
        num1=entrada.nextInt();
        System.out.println("Ingrese el segundo operando");
        num2=entrada.nextInt();
        
        multiplicacionAB=num1*num2;
        primerTermino=num1*num1;
        segundoTermino=num2*num2;
        tercerTermino=2*multiplicacionAB;
        
        suma=primerTermino+segundoTermino+tercerTermino;
        
        System.out.println("\nEl resultado es: "+suma);
        
    }
    
}
