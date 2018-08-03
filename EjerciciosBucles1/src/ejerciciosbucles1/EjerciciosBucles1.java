/*
realizar un juego para adivinar un numero. para ello generar un numero aleatorio entre 0 y 100
y luego ir pidiendo numeros indicando al usuario si el numero aleatorio es mayor o menor al elegido
el proceso finaliza cuando el usuario acierta el numero y mostrar el numero de intentos
*/
package ejerciciosbucles1;

import javax.swing.JOptionPane;


public class EjerciciosBucles1 {


    public static void main(String[] args) {
       
        int numero,numeroAleatorio,contador=0;
        
        numeroAleatorio=(int)(Math.random()*100);//genera un numero aleatorio de 0 a 100
        
        System.out.println(""+numeroAleatorio);
        
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero del 0 al 100"));
            
            if(numeroAleatorio>numero)
            {
                System.out.println("Digite un numero mayor a "+numero);
            }else if(numeroAleatorio<numero)
            {
                System.out.println("Digite un numero menor a: "+numero);
            }
            else{
            JOptionPane.showMessageDialog(null, "Numero Encontrado!");    
            }
            
        }while(numero!=numeroAleatorio);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero: "));
        
        while(numero!=0)//mientras sea distinto de cero
        {
            if(numero%2==0)//si el numero es par
            {
                JOptionPane.showMessageDialog(null, "El numero es par");
            }
            else //if(numero%2!=0) si el numero es inpar
            {
                JOptionPane.showMessageDialog(null, "El numero es inpar");
            }
            
            numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Reingrese un numero: "));
        }*/
            
            
            
    }
    
}
