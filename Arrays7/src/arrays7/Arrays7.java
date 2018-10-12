/*
Se solicitan 10 posiciones de un array y se ordenan de manera ascendente
 */
package arrays7;

import java.util.Scanner;

public class Arrays7 {

    
    public static void main(String[] args) {
    
        Scanner entrada=new Scanner(System.in);
        int array[]=new int[10];
        int ultimo;
        
        System.out.println("Cargar el array");
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Ingrese el elemento "+(i+1)+" del array: ");
            array[i]=entrada.nextInt();
        }
        
        ultimo=array[9];
        
        for (int i=8;i>=0;i--)
        {
            array[i+1]=array[i];
        }
        
        array[0]=ultimo;
        
        System.out.println("El array quedó conformado de la siguiente forma: ");
        
        for (int i=0;i<10;i++)
        {
            System.out.println(array[i]);
        }
        
    }
    
}
