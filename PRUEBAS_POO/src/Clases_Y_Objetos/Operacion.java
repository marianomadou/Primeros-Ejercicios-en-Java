/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Y_Objetos;

import java.util.Scanner;

public class Operacion {

    //metodos
    
      
    public int sumarNumeros(int numero1, int numero2)//metodo para sumar numeros
    {
        int suma=numero1+numero2;
        return suma;
    }
    
    public int restarNumeros(int numero1, int numero2)//metodo para restar numeros
    {
        int resta=numero1-numero2;
        return resta;
    }
    
    public int multiplicarNumeros(int numero1, int numero2)//metodo para multiplicar numeros
    {
        int multiplicar=numero1*numero2;
        return multiplicar;
    }
    
    public int dividirNumeros(int numero1, int numero2)//metodo para dividir numeros
    {
        int dividir=numero1/numero2;
        return dividir;
    }
    
    /*
    public void mostrarResultados(int suma, int resta, int multi, int div)
    {
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multipliacion es "+multi);
        System.out.println("La division es "+div);
    }*/
    


    
}



/*
//atributos
    //int numero1;
    //int numero2;
    int suma;
    int resta;
    int multiplicar;
    int dividir;
    
    //metodos
    
      
    public void sumarNumeros(int numero1, int numero2)//metodo para sumar numeros
    {
        suma=numero1+numero2;
    }
    
    public void restarNumeros(int numero1, int numero2)//metodo para restar numeros
    {
        resta=numero1-numero2;
    }
    
    public void multiplicarNumeros(int numero1, int numero2)//metodo para multiplicar numeros
    {
        multiplicar=numero1*numero2;
    }
    
    public void dividirNumeros(int numero1, int numero2)//metodo para dividir numeros
    {
        dividir=numero1/numero2;
    }
    
    public void mostrarResultados()
    {
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multipliacion es "+multiplicar);
        System.out.println("La division es "+dividir);
    }
*/

/*
public class Operacion {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicar;
    int dividir;
    
    //metodos
    
    //metodo para pedir numeros
    public void leerNumeros()
    {
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero1=lector.nextInt(); 
        System.out.println("Ingrese otro numero: ");
        numero2=lector.nextInt(); 
    }
    
    public void sumarNumeros()//metodo para sumar numeros
    {
        suma=numero1+numero2;
    }
    
    public void restarNumeros()//metodo para restar numeros
    {
        resta=numero1-numero2;
    }
    
    public void multiplicarNumeros()//metodo para multiplicar numeros
    {
        multiplicar=numero1*numero2;
    }
    
    public void dividirNumeros()//metodo para dividir numeros
    {
        dividir=numero1/numero2;
    }
    
    public void mostrarResultados()
    {
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multipliacion es "+multiplicar);
        System.out.println("La division es "+dividir);
    }
}

*/