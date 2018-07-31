/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int numero, dato=5;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        
        if(numero==dato)
        {
            JOptionPane.showMessageDialog(null,"El numero es 5");
        }
        else if(numero<dato)
        {
            JOptionPane.showMessageDialog(null,"El numero es menor de 5");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El numero es mayor de 5");
        }
        
    }
    
}
