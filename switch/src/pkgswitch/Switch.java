/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato;
        
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 y 5: "));
        
        switch(dato){
            case 1:
                JOptionPane.showMessageDialog(null,"Es el numero 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Es el numero 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Es el numero 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Es el numero 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Es el numero 5");
                break;
            default: // es el else del switch
                JOptionPane.showMessageDialog(null, "El numero no se encuentra dentro del rango solicitado");
                
        }
        
        
        
        
    }
    
}
