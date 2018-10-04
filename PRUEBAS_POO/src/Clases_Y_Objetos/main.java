
package Clases_Y_Objetos;

import java.util.Scanner;



public class main {
    
    public static void main(String[] args)
    {
        int n1,n2;
        
        
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n1=lector.nextInt(); 
        System.out.println("Ingrese otro numero: ");
        n2=lector.nextInt(); 
        
        Operacion op=new Operacion();
        
        
        System.out.println("La suma es: " +op.sumarNumeros(n1, n2));
        System.out.println("La resta es: "+op.restarNumeros(n1, n2));
        System.out.println("La multipliacion es: "+op.multiplicarNumeros(n1, n2));
        System.out.println("La division es: "+op.dividirNumeros(n1, n2));
        
        /*
        int suma=op.sumarNumeros(n1, n2);
        int resta=op.restarNumeros(n1, n2);
        int mult=op.multiplicarNumeros(n1, n2);
        int div=op.dividirNumeros(n1, n2);
        
        op.mostrarResultados(suma, resta, mult, div);
        */
    }
    
}




/*
int n1,n2;
        
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n1=lector.nextInt(); 
        System.out.println("Ingrese otro numero: ");
        n2=lector.nextInt(); 
        
        Operacion op=new Operacion();
        op.sumarNumeros(n1, n2);
        op.restarNumeros(n1, n2);
        op.multiplicarNumeros(n1, n2);
        op.dividirNumeros(n1, n2);
        op.mostrarResultados();
*/



/*
Operacion op= new Operacion();//Creo un objeto op de la clase Operacion
        
        op.leerNumeros();
        op.sumarNumeros();
        op.restarNumeros();
        op.multiplicarNumeros();
        op.dividirNumeros();
        op.mostrarResultados();
        
*/