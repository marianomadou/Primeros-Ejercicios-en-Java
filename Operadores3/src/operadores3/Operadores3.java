/*
 * La calificacion final de un estudiante de programacion se calcula en base a cuatro aspectos de su rendimiento academico:
1- participacion (10%)
2- primer examen parcial (25%)
3- segundo examen parcial (25%)
4- final (40 %)
Sabiendo que las calificaciones anteriores entran a la calificacion final con ponderaciones del 10%,25%,25%,40%.
Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante.
 */
package operadores3;

import java.util.Scanner;

public class Operadores3 {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        float participacion, primerParcial, segundoParcial, Final, notaGeneral;
        
        System.out.println("Digite la nota de participacion: ");
        participacion=entrada.nextFloat();
        System.out.println("Digite la nota del primer parcial: ");
        primerParcial=entrada.nextFloat();
        System.out.println("Digite la nota del segundo parcial: ");
        segundoParcial=entrada.nextFloat();
        System.out.println("Digite la nota del final: ");
        Final=entrada.nextFloat();
        
        participacion*=0.10f;
        primerParcial*=0.25f;
        segundoParcial*=0.25f;
        Final*=0.40f;
        
        notaGeneral=participacion+primerParcial+segundoParcial+Final;
        
        System.out.println("\nLa nota final es: "+notaGeneral);
        

        
    }
    
}
