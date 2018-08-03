/*
Ejercicio 7: pedir numeros hasta que se introduzca un numero negativo y calcular la media
Ejercicio 8: pedir N numeros y mostrar todos los numeros positivos del 1 al N
Ejercicio 10: pedir 10 numeros y escribir la suma total
Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros numeros impares
 */
package calcularpromedio;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CalcularPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        //Ejercicios 11
        int numero, multiplicacion=1;
        
       
        for(int i=0;i<10;i++)
        {
            numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
             if (numero%2!=0)
            {
                multiplicacion*=numero;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El producto de los numeros ingresados es es: "+multiplicacion);
        */
        
        
        
        
        
        
        
        
        
        
        
        /*
        //Ejercicio 10
        int numero, suma=0;
        
        for(int i=0;i<10;i++)
        {
            numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
            suma+=numero;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros ingresados es: "+suma);
        */
        
        
        
        /*//Ejercicio 10
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de numeros que desea mostrar desde 1: "));
        
            for(int i=1;i<=numero;i++)
            {
                System.out.println(""+i);
            }
        */
        
        
        
        /*//Ejercicio7
        int numero, elementos=0, suma=0;
        float promedio;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
                
        while(numero>=0)
        {
            suma+=numero;//suma iterativa
            elementos++;
            numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro numero"));
        }
        
        if (elementos==0)
        {
            System.out.println("Error, la division entre cero no existe");
        }
        else
        {
            promedio=(float)suma/elementos;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
        }*/
        
        
        
    }
    
}
