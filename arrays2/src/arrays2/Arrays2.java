/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;

import java.util.Scanner;


public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        Scanner entrada=new Scanner(System.in);
        
        int array[]=new int[10];
        boolean creciente=true;
        int numero, sitioNumero=0,j=0;
        
        
        System.out.println("Llenar el array");
        
        do
        {
            for(int i=0; i<5; i++)
            {
                //cargando el array con 5 elementos
                System.out.println("digite un numero: ");
                array[i]=entrada.nextInt();
            }
            //comprobar si está ordenado en forma creciente
            for(int i=0;i<4;i++)
            {
                if(array[i]<array[i+1])//creciente
                {
                    creciente=true;
                }
                if(array[i]>array[i+1])//decreciente
                {
                    creciente=false;
                    break;
                }
            }
            if(creciente==false)
            {
                System.out.println("El array no está ordenado en forma creciente. Vuelva a cargarlo");
            }
        }while(creciente==false);
        
        System.out.println("Ingrese un elemento a insertar: ");
        numero=entrada.nextInt();
        
        while(array[j]<numero && j<5)//en que posicion va el numero a introducir
        {
            sitioNumero++;
            j++;
        }
        
        for(int i=4;i>=sitioNumero;i--)//corremos una posicion en el array a todos los elementos que van despues de numero
        {
            array[i+1]=array[i];
        }
        
        array[sitioNumero]=numero;//insertamos el numero en la posicion que corresponde
    
        System.out.println("El array final es: ");
        
        for(int i=0;i<6;i++)
        {
            System.out.print(array[i]+" - ");
        }
                
    
        /*
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
        */
        
        
        /*
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
        }*/
        
        
        
        
        
        
        /*
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
        
        for (int i=0;i<20;i++)
        {
            System.out.println(arrayC[i]);
        }
        */
        
        
        
        
        
      /*  
        Scanner entrada= new Scanner(System.in);
        float numeros[] = new float[5];
        
        float sumaPositivos=0, sumaNegativos=0, mediaPositivos, mediaNegativos;
        int conteoPositivos=0, conteoNegativos=0, conteoCero=0;
        
        System.out.println("Guardando numeros en Array: ");
        for (int i=0;i<5;i++)
        {
            System.out.print((i+1)+" - Ingrese un numero: ");
            numeros[i]=entrada.nextFloat();
            
            if(numeros[i]==0)
            {
                conteoCero++;
            }
            else if(numeros[i]>0)
            {
                sumaPositivos += numeros[i];
                conteoPositivos++;
            }
            else
            {
                sumaNegativos += numeros[i];
                conteoNegativos++;
            }          
            
        }
        
        if(conteoPositivos==0)
        {
            System.out.println("No se pudo sacar el promedio de los numeros positivos");
        }
            else
            {
                mediaPositivos=sumaPositivos/conteoPositivos;
                System.out.println("El promedio de los numeros positivos es: "+mediaPositivos);
            }
        
        if(conteoNegativos==0)
        {
            System.out.println("No se pudo sacar el promedio de los numeros negativos");
        }
            else
            {
                mediaNegativos=sumaNegativos/conteoNegativos;
                System.out.println("El promedio de los numeros negativos es: "+mediaNegativos);
            }
            
        
            
        System.out.println("La cantidad de ceros es: "+conteoCero);*/
        
        
    }
    
}
