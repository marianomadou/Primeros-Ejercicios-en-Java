/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays3;


import java.util.Scanner;


public class Arrays3 {

 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        int array[]=new int[10];
        int numero;
        boolean creciente=true;
        
        do{
            System.out.println("Cargar el array de 10 posiciones");
            
            //cargo el array
            for(int i=0;i<10;i++)
            {
                System.out.print(i+" - ingrese un numero: ");
                array[i]=entrada.nextInt();
            }
            
            //verifica si es creciente o decreciente
            for(int i=0;i<9;i++)
            {
                if(array[i]<array[i+1])
                {
                    creciente=true;
                }
                if(array[i]>array[i+1])
                {
                    creciente=false;
                    break;
                }
                
            }
            
            if(creciente==false)
                {
                    System.out.println("Error, array desordenado. Ingrese nuevamente el array de 10 enteros");
                }
            
        }while(creciente==false);
        
        System.out.println("\nIngrese el numero a buscar en el array: ");
        
        numero=entrada.nextInt();
        
        int i=0;
        while(i<10 && array[i]<numero)
        {
            i++;
        }
        if(i==10)
        {
            System.out.println("No se encontró el numero buscado");
        }
        else
        {
            if(array[i]==numero)
            {
                System.out.println("Numero encontrado en posicion "+i);
            }
            else
            {
                System.out.println("Numero no encontrado");
            }
            
        }
        
        
        
        
    }
    
}
