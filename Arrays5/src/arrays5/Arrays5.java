/*
 Se ingresan 10 numeros en array A, 10 numeros en Array B, se intercalan y se muestran en Array C
 */
package arrays5;

import java.util.Scanner;

public class Arrays5 {


    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        int arrayA[],arrayB[],arrayC[];
        
        arrayA=new int [10];
        arrayB=new int [10];
        arrayC=new int [20];
        
        System.out.println("Ingrese los 10 numeros del array A a continuacion: ");
        for (int i=0;i<10;i++)
        {
            System.out.println("Ingrese un numero para la posición "+(i+1)+" del array A: ");
            arrayA[i]=entrada.nextInt();
                    
        }
        
        System.out.println("Ingrese los 10 numeros del array B a continuacion: ");
        for (int i=0;i<10;i++)
        {
            System.out.println("Ingrese un numero para la posición "+(i+1)+" del array B: ");
            arrayB[i]=entrada.nextInt();
        }
        //mezclar arrays en arrayC
        
        int j=0;
        for (int i=0;i<10;i++)
        {
            arrayC[j]=arrayA[i];
            j++;
            arrayC[j]=arrayB[i];
            j++;
        }
        System.out.println("Array C mezclando posicion 1 de array A con B");
        for (int i=0;i<20;i++)
        {
            System.out.println(arrayC[i]);
        }
        
    }
    
}
