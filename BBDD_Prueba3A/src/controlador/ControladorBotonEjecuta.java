
package controlador;

import java.awt.event.*;
import java.sql.*;
import modelo.*;
import vista.*;

public class ControladorBotonEjecuta implements ActionListener{

    private final Marco_Aplicacion2 elMarco;
    ejecutaConsultas obj=new ejecutaConsultas();
    private ResultSet resultadoConsulta;
    
    public ControladorBotonEjecuta(Marco_Aplicacion2 elMarco) {
        
        this.elMarco=elMarco;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String seleccionSeccion=(String)elMarco.secciones.getSelectedItem();
        String seleccionPais=(String)elMarco.paises.getSelectedItem();
        
        resultadoConsulta=obj.filtraBBDD(seleccionSeccion, seleccionPais);
        
        try
        {
            elMarco.resultado.setText("");
            
            while(resultadoConsulta.next())
            {
                elMarco.resultado.append(resultadoConsulta.getString(1));
                elMarco.resultado.append(", ");
                elMarco.resultado.append(resultadoConsulta.getString(2));
                elMarco.resultado.append(", ");
                elMarco.resultado.append(resultadoConsulta.getString(3));
                elMarco.resultado.append(", ");
                elMarco.resultado.append(resultadoConsulta.getString(4));
                elMarco.resultado.append("\n");
            }
        }catch(SQLException e1)
        {
            e1.printStackTrace();
        }
        
    }
    
}
