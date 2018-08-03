/*

*/
package ciclowhile;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        int i=1, contador;
        System.out.println("Digite la cantidad de terminos: ");
        contador=entrada.nextInt();
        
        do{//primero ejecuta al menos 1 vez y despues evalua la condicion
            System.out.println(i);
            i++;
        }while(i<=contador);//ejecuta y despues evalua la condicion muy utilizado en los menues de opciones
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int i=1, contador;
        
        System.out.println("cuantos numeros quiere en pantalla?: ");
        contador=entrada.nextInt();
        
        
        while(i<=contador)
        {
            System.out.println(i);
            //i++;
            i+=2;
        }*/
        
        
        
    }
    
}
