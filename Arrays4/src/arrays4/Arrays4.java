/*
 * Se ingresan 5 numeros a un array y se saca el promedio de los numeros positivos y negativos contabilizando los ceros
 */
package arrays4;

import java.util.Scanner;

public class Arrays4 {

    public static void main(String[] args) {
       
        
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
            
        
            
        System.out.println("La cantidad de ceros es: "+conteoCero);
        
        
        
    }
    
}
