/*
Se piden por consola 5 elementos ordenados de manera ASCENDENTE para cargar un array y UN elemento a insertar en el array.
Se hace lugar en el array para insertar un nuevo numero, se inserta y se muestra el array reordenado.
 */
package arrays8;

import java.util.Scanner;

public class Arrays8 {


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
    }
    
}
