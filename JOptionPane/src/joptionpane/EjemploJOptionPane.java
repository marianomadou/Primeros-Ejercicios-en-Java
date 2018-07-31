

package joptionpane;

import javax.swing.JOptionPane;

public class EjemploJOptionPane {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un decimal: "));
        
        JOptionPane.showMessageDialog(null,"la cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"el entero es: "+entero);
        JOptionPane.showMessageDialog(null,"la letra es: "+letra);
        JOptionPane.showMessageDialog(null,"la decimal es: "+decimal);
        
        
        
        
        
    }
    
}
