/*
Ejercicio 7: Pedir 3 numeros y mostrarlos ordenados de mayor a menor.

Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si es correcta. suponiendo que todos los meses tienen 30 dias.

 */
package condicionales5;

import javax.swing.JOptionPane;

public class Condicionales5 {

    
    public static void main(String[] args) {

        //Ejercicio 9:
    int dia, mes, anio;
    
    dia=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia: "));
    mes=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes: "));
    anio=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año: "));
        
    if((dia<=30) && (dia>=1))
    {   if((mes<=12)&&(mes>=1))
        {   if(anio!=0)
            {
                JOptionPane.showMessageDialog(null, "La fecha: "+dia+" / "+mes+" / "+anio+" Es CORRECTA!");
            }else
            {
                JOptionPane.showMessageDialog(null, "El año: "+anio+" es incorrecto");
            }
        }else
        {
            JOptionPane.showMessageDialog(null, "El mes: "+mes+" es incorrecto");
        }
    }else
    {
        JOptionPane.showMessageDialog(null, "El dia: "+dia+" es incorrecto");
    }
        
        
        
        
/*  //Ejercicio7
    int num1, num2, num3;
    
    num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
    num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
    num3=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer numero: "));
        
    if((num1>num2)&&(num2>num3))
    {
        JOptionPane.showMessageDialog(null, "Los numeros ordenados son: "+num1+" - "+num2+" - "+num3);
    }
    else if((num1>num3)&&(num3>num2))
    {
        JOptionPane.showMessageDialog(null, "Los numeros ordenados son: "+num1+" - "+num3+" - "+num2);
    }
    else if((num2>num1)&&(num1>num3))
    {
        JOptionPane.showMessageDialog(null, "Los numeros ordenados son: "+num2+" - "+num1+" - "+num3);
    }
    else if((num2>num3)&&(num3>num1))
    {
        JOptionPane.showMessageDialog(null, "Los numeros ordenados son: "+num2+" - "+num3+" - "+num1);
    }
    else if((num3>num1)&&(num1>num2))
    {
        JOptionPane.showMessageDialog(null, "Los numeros ordenados son: "+num3+" - "+num1+" - "+num2);
    }
    else
    {
        JOptionPane.showMessageDialog(null, "Los numeros ordenados son: "+num3+" - "+num2+" - "+num1);
    }
        
*/        
        
        
    }
    
}
