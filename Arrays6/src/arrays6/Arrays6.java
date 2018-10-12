/*
Se piden 10 numeros por consola y la aplicacion comprueba si son numeros ordenados (Ascendente o descendente) o están desordenados
 */
package arrays6;

import java.util.Scanner;


public class Arrays6 {


    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int array[]=new int[10];
        boolean creciente=false;
        boolean decreciente=false;
        
        
        System.out.println("Llenar el array a continuacion: ");
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Digite el elemento "+(i+1)+" del array: ");
            array[i]=entrada.nextInt();
        }
        
        for (int i=0;i<9;i++)
        {
            if(array[i] < array[i+1])//creciente
            {
                creciente=true;
            }
            if(array[i] > array[i+1])//decreciente
            {
                decreciente=true;
            }
        }
        
        if(creciente==true && decreciente==false)
        {
            System.out.println("El array está ordenado en forma creciente");
        }
        
        else if(creciente==false && decreciente==true)
        {
            System.out.println("El array está ordenado en forma decreciente");
        }
        else if(creciente==true && decreciente==true)
        {
            System.out.println("El array está desordenado");
        }
        else if(creciente==false && decreciente==false)
        {
            System.out.println("Todos los numeros son iguales");
        }
        
    }
    
}
