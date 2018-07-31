

package operadores;

import java.util.Scanner;


public class Operadores {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, multiplicacion, division, resto;
        
        System.out.println("Digite dos numeros: ");
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
        
        suma= numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        division=numero1/numero2;
        resto=numero1%numero2;
                
        System.out.println("SUMA: "+suma);
        System.out.println("RESTA: "+resta);
        System.out.println("MULTIPLICACION: "+multiplicacion);
        System.out.println("DIVISION: "+division);
        System.out.println("RESTO: "+resto);
        
        
        
        
        
        
        
        
    }
    
}
