/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoprograma;

import java.util.Scanner;//clase scanner

/**
 *
 * @author Administrador
 */
public class SegundoPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte entero;// entero=12
        entero=12;
        short entero2;
        entero2=12456;
        int entero3;
        entero3=1234567;
        long entero4;
        entero4=123456789;
        //numeros flotantes
        float decimal;
        decimal= 7.5f;
        float decimal2;
        decimal2= (float)7.5;//es lo mismo que 7.5f
        double decimal3;//double 64bits
        decimal3= 7.535;//no hace falta decirle que es float 7.5f.
        //caracteres
        char caracter='a';//los numeros tambien son caracteres. comilas simples se utilizan para un solo caracter
        boolean decision=true;
        Integer numero = 10;//integer es tipo de dato NO primitivo. No solamente permite almacenar numeros enteros sino que tambien puede almacenar NULL
        Integer numeroNull = null;
        //cadenas
        String palabra="Hola que tal";//comillas dobles se utilizan para las strings
        int numero5=19;
        numero5=19+20;//los numeros van cambiando a medida que avanza el codigo
        final int numero6=9;//final int es una declaracion de una variable global//es una constante, no una variable
        
        
        
        
        
        
        
        System.out.println("numero byte: "+  entero);
        System.out.println("numero short: "+entero2);
        System.out.println("numero int: "+entero3);
        System.out.println("numero long: "+entero4);
        System.out.println("numero decimal float: "+decimal);
        System.out.println("numero decimal float(): "+decimal2);
        System.out.println("numero decimal double: "+decimal3);
        System.out.println("Caracter char: "+caracter);
        System.out.println("booleana: "+decision);
        System.out.println("Integer :"+numero);
        System.out.println("Integer null: "+numeroNull);
        System.out.println("String: "+palabra);
        System.out.println(numero5);
        System.out.println(numero6);
        
        
        
    }
    
}
