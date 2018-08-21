/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays1;

import java.util.Scanner;


/**
 *
 * @author Administrador
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in);
        
        float[] numeros=new float[5];
        
        System.out.println("Guardando los datos en el arreglo: ");
        
        for(int i=0; i<5;i++)
        {
            System.out.println((i+1)+" - Digite un numero: ");
            numeros[i]=entrada.nextFloat();
            
        }
        
        for (float i:numeros)
        {
            System.out.println(i);
        }
        
        
        
        
        
        
        
        
        
        /* 
        String[] nombres = {"Mariano","Mercedes","Silvia"."Juandi","Laura","Carlos"};
        
        for(String i:nombres)
        {
            System.out.println("Nombres : "+i);
        }
        */
        
        /*for(int i=0; i<nombres.length;i++)
        {
            System.out.println(nombres[i]);
        }*/
        
    }
    
}


/*Scanner entrada = new Scanner (System.in);
        
        int nElementos;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite una cantidad de elementos: "));
        
        char[] letras = new char[nElementos];
        
        System.out.println("Digite los elementos del arreglo:  ");
        for (int i=0; i<nElementos; i++)
        {
            System.out.print((i+1)+" - Digite un caracter: ");
            letras[i]=entrada.next().charAt(0);
        }
        System.out.println("Los caracteres del arreglo son: ");
        for (int i=0; i<nElementos; i++)
        {
            System.out.println(letras[i]+" ");
        }*/


/*int[] numeros=new int[3];
        
        numeros[0]=7;
        numeros[1]=10;
        numeros[2]=13;
        
        int[] numeros={5,7,9};
        
        for(int i=0;i<3;i++)
        {
            System.out.println(numeros[i]);
        }*/