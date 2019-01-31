/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JFrame;
import vista.*;
import modelo.*;
import controlador.*;

/**
 *
 * @author Administrador
 */
public class Ejecuta_Modelo_Vista_Controlador {
    public static void main (String[] args)
    {
        Marco_Aplicacion2 miMarco= new Marco_Aplicacion2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);   
    }
}
