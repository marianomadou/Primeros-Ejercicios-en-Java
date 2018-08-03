/*
Ejercicio 5: 
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
- Si trabaja 40hs o menos, se le paga $16 pesos por hora.
- Si trabaja mas de 40hs, se le paga $16 pesos por cada una de las primeras 40 horas y $20 mas por cada una de las horas extras.
Ejercicio 6:
Hacer un programa que tome dos numeros y diga si ambos son pares o impares.
 */
package condicionales4;

import javax.swing.JOptionPane;

public class Condicionales4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
        
        if(num1%2==0 && num2%2==0)
        {
            JOptionPane.showMessageDialog(null, "El numero "+num1+" y el numero "+num2+" son PARES." );
        }
        else if(num1%2!=0 && num2%2!=0)
        {
            JOptionPane.showMessageDialog(null, "El numero "+num1+" y el numero "+num2+" son INPARES.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ambos numeros no son pares o impares");
        }
        
        
        
        
        
        
        
        
        /*int horasTrabajadas;
        float salarioTotal;
        
        horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el total de horas trabajadas: "));
        
        if(horasTrabajadas>40)
        {
            salarioTotal= (40*16) + ((horasTrabajadas-40)*20);
        }
        else
        {
            salarioTotal=horasTrabajadas*16;
        }
        
        JOptionPane.showMessageDialog(null, "El salario a percibir es: "+salarioTotal);*/
    }
    
}
