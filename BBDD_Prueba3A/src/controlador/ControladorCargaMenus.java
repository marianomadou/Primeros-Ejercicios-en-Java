/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.*;
import java.sql.*;
import modelo.*;
import vista.*;

/**
 *
 * @author Administrador
 */
public class ControladorCargaMenus extends WindowAdapter {

    CargaMenus obj = new CargaMenus();
    private Marco_Aplicacion2 elMarco;

    public ControladorCargaMenus(Marco_Aplicacion2 elMarco) {
        this.elMarco=elMarco;
    }

    public void WindowOpened(WindowEvent ew) {
        obj.ejecutaConsultas();

        try {
            while (obj.rs.next()) {
                elMarco.secciones.addItem(obj.rs.getString(1));
            }
            while (obj.rs2.next()) {
                elMarco.paises.addItem(obj.rs2.getString(1));
            }

        } catch (SQLException ew1) {
            ew1.printStackTrace();
        }
    }

}
