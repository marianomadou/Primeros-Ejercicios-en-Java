/*
Ejercicio13: pedir un numero y calcular su factorial
Ejercicio15: dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos 
mayores de 18 años y la cantidad de alumnos que miden mas de 1,75m
 */
package factorial_y_otras;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Factorial_y_otras {

    
    public static void main(String[] args) {
    
        int edad,sumaEdad=0,contadorMayorEdad=0,contadorMayorAltura=0;
        float altura,sumaAltura=0, promedioEdad, promedioAltura;
        
        for(int i=0;i<5;i++)
        {
            edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del alumno "+i));
            altura=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la altura del alumno "+i));
            
            sumaEdad += edad;
            sumaAltura += altura;
            
            if(edad>=18)
            {
                contadorMayorEdad++;
            }
            if(altura>=1.75)
            {
                contadorMayorAltura++;
            }
        }
        
        promedioEdad=(float)sumaEdad/5;
        promedioAltura=(float)sumaAltura/5;
        
                System.out.println("La edad promedio de los estudiantes es: "+promedioEdad);
                System.out.println("La altura promedio de los estudiantes es: "+promedioAltura);
                System.out.println("Los alumnos mayores de 18 años son: "+contadorMayorEdad);
                System.out.println("Los alumnos mas altos de 1,75m son: "+contadorMayorAltura);
        
        
        /*
     //Ejercicio 13
        int numero;
     long factor;
        Scanner num = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular el factorial: ");
        numero = num.nextInt();
        factor = (long)factorial(numero);
        System.out.println("El factorial de " + numero + " es " + factor);*/
    }
    /*static int factorial(int num)
    {
        int factor;
        if(num == 0){
            factor = 1;
        }
        else{
            factor = num * factorial(num - 1);
        }
        return factor;
    }*/
    
}
