
package Controlador;

import Programa.frmInicio;
import Programa.frmUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Usuario;
import Modelo.ArregloUsuariosIS;
import Controlador.ControladorInicio;

/**
 * @author Diego Quinonez Flores
 */

public class ControladorUser {
    
    private frmInicio vista;
    private frmUsuario vistaD;
    private ArregloUsuariosIS arregloU;
    
    public ControladorUser(frmInicio vista) {
        this.vista = vista;
        this.vista.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.vista.btnRegistrarse.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaD = new frmUsuario();
                ControladorInicio contIni = new ControladorInicio(vistaD);
                contIni.iniciar();
            }
        });
        
        this.vista.btnIniciarS.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //agregar aquí
            }
        });
        
    }
    
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    private void limpiar() {
        this.vista.txtUsuario.setText("");
        this.vista.txtContrasena.setText("");
    }
    
}