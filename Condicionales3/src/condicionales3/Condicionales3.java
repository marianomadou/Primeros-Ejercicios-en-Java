//Hacer un programa que lea un caracter por teclado y compruebe si es mayuscula o minuscula
//se hace un 20% de descuento en compras mayores a 300 pesos. calcular e imprimir el monto a abonar
package condicionales3;

import javax.swing.JOptionPane;

public class Condicionales3 {

    public static void main(String[] args) {

        float monto,montoFinal, descuentoCompra;
        float descuento=(float) 0.2;
        monto=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese monto a facturar: "));
        
        if(monto>=300)
        {
            descuentoCompra=monto*descuento;
            montoFinal=monto-descuentoCompra;
            JOptionPane.showMessageDialog(null,"Monto total: "+monto+" \nDescuento sobre compra: "+descuentoCompra+" \nTotal a abonar: "+montoFinal );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se realizaros descuentos. \nEl monto a abonar es: "+monto);
        }
        
        
        
        
        
        /*char letra;
        letra=(JOptionPane.showInputDialog(null, "Ingrese una letra: ")).charAt(0);
        
        if (Character.isUpperCase(letra))
        {
            JOptionPane.showMessageDialog(null, "El caracter es MAYUSCULA");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El caracter es minuscula");
        }*/
        
        
        
        
        
    }
    
}
