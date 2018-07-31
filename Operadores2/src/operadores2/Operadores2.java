
/*
Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de:
- sus horas semanales trabajadas,
- y de su salario por hora.
*/
package operadores2;

import java.util.Scanner;

public class Operadores2 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int diasTrabajados, salarioHora=10;
        float salarioDia, salarioSemana;
        
        
        System.out.println("Ingrese cantidad de horas trabajadas por dia: ");
        salarioDia=entrada.nextFloat();
        
        System.out.println("Ingrese cantidad de dias trabajados por semana: ");
        diasTrabajados=entrada.nextInt();
        
        salarioSemana= salarioHora * salarioDia * diasTrabajados;
        
        System.out.println("El sueldo semanal del empleado es: "+salarioSemana);
        
    
        /*float nota1, nota2, nota3, suma,promedio;
        
        System.out.println("Digite las 3 notas");
        nota1=entrada.nextFloat();
        nota2=entrada.nextFloat();
        nota3=entrada.nextFloat();
        
        suma=nota1+nota2+nota3;
        promedio=suma/3;
        
        System.out.println("La suma de las tres notas es: "+suma);
        System.out.println("El promedio de las tres notas es: "+promedio);*/
        
        
        
        
        
        /*int numero=10;
        
        //numero=numero+5;// esto es como poner numero +=5;
        //numero+=5;
        //numero-=5;
        //numero%=5;
        
        System.out.println("Numero: "+numero);*/
        
    }
    
}
