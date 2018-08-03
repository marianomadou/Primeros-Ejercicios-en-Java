/*
 

 */
package buclefor;
import javax.swing.JOptionPane;
/**
 

 */
public class BucleFor {

   
    
    public static void main(String[] args) {
       
        int numero, cuadrado;
        numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        
        while(numero>=0)
        {
            //cuadrado=numero*numero;
            cuadrado=(int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El cuadrado del numero "+numero+ " es: "+cuadrado);
            numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro numero"));
        }
        
        
        
        
        
        
        /*for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }*/
    }
    
}
