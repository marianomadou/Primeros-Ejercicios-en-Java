/*
Ejercicio 11:
Hacer un programa que simule el funcionamiento de una calculadora (suma, resta, multiplicacion y division) 
El usuario debe especificar con el primer caracter si:
es suma (S o s)
resta (R o r)
multiplicacion (M o m)
division (D o d)

Ejercicio 13:
Simule un cajero automatico con un saldo inicial de $1000 con estas opciones:
1)Ingresar dinero a la cuenta
2)Retirar dinero de la cuenta
3)salir

*/
package condicionales6;

import javax.swing.JOptionPane;

public class Condicionales6 {

    public static void main(String[] args) {
    //Ejercicio 13
    
    final int saldoInicial=1000;
    int opcion;
    float ingreso,egreso,saldoActual;
    
    opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenido BANELCO\n"
    +"1)Ingresar dinero a la cuenta.\n"
    +"2)Retirar dinero de la cuenta.\n"
    +"3)Salir\n"));
    
    switch(opcion)
    {
        case 1:
            ingreso=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la cantidad que desea depositar: $"));
            saldoActual = saldoInicial+ingreso;
            JOptionPane.showMessageDialog(null, "El saldo actual es de: "+saldoActual);
            break;
        case 2:
            egreso=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite la cantidad que desea extraer: $"));
            saldoActual=saldoInicial-egreso;
            if(egreso>saldoActual)
            {
                JOptionPane.showMessageDialog(null, "No posee saldo suficiente para esa extraccion. Lo sentimos.");
            }else
                {
                    saldoActual=saldoInicial-egreso;
                    JOptionPane.showMessageDialog(null, "Se realizo correctamente la extraccion.\nEl saldo actual es de $"+saldoActual);
                }
            break;
        case 3:
            JOptionPane.showMessageDialog(null, "Usted ha salido");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opcion Incorrecta. Reintentar.");
            break;
            
    }
        
        
        
    /*
    //Ejercicio 11
    int numero1, numero2;
    float suma, resta, multiplicacion,division;
    char operacion;
    
    numero1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer operando: "));
    numero2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo operando: "));
    operacion=JOptionPane.showInputDialog(null, "Ingrese la operacion que desea hacer: ").charAt(0);
    
    switch(operacion)
    {
        case 's'://suma
        case 'S':
            suma=numero1+numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+suma);
            break;
        case 'r'://resta
        case 'R':
            resta=numero1-numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+resta);
            break;
        case 'm'://multiplicacion
        case 'M':
            multiplicacion=numero1*numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: "+multiplicacion);
            break;
        case 'd'://division
        case 'D':
            division=numero1/numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la division es: "+division);
            break;
        default: JOptionPane.showMessageDialog(null, "Error al elegir opcion");
            break;
    }*/
    
        
        
    }
    
}
