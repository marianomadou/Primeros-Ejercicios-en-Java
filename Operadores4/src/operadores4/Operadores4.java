/*
 * Construir un programa que, dado un numero total de horas, devuelve un numero de semanas, dias y horas equivalentes.
por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
 */
package operadores4;


import java.util.Scanner;

public class Operadores4 {


    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        
        int horasTotales, horas, dias, semanas;
        
        System.out.println("Ingrese las horas a calcular: ");
        horasTotales=entrada.nextInt();
        
        semanas=horasTotales/168;
        dias=horasTotales%168/24;
        horas=horasTotales%24;
        
        System.out.println("\nEl Equivalente es:");
        System.out.println("Cantidad de semanas: "+semanas);        
        System.out.println("Cantidad de dias: "+dias);        
        System.out.println("Cantidad de horas: "+horas);
        
        
        
        
        
    }
    
}
