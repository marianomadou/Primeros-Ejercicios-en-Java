/*pedir dos numeros y calcular e imprimir cual es el mayor
 */
package condicionales2;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrador
 */
public class Condicionales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1, numero2;
        numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un primer numero"));
        
        numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un segundo numero"));
        
        if (numero1<numero2)
        {
            JOptionPane.showMessageDialog(null, "El numero 2 es mayor al numero 1");    
        }
        else if (numero1>numero2)
        {
            JOptionPane.showMessageDialog(null, "El numero 2 es menor al numero 1");
        }
        else
            JOptionPane.showMessageDialog(null, "Los dos numeros son iguales");
        
        
        
        
        /*if(numero%10==0)//operador mod devuelve el resto y si es cero entra, sino else
        {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es divisor de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no es divisor de 10");
        }*/
        
        
        
    }
    
}
