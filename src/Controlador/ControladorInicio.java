
package Controlador;

import Programa.frmUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.User;

/**
 * @author Diego Quinonez Flores
 */

public class ControladorInicio {
    
    private frmUsuario vistaD;
    private User usu;
    
    public ControladorInicio(frmUsuario vistaD){
        this.vistaD = vistaD;
        this.vistaD.btnSalida.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaD.dispose();
            }
        });
        
        this.vistaD.btnRegistrarU.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                
                vistaD.dispose();
            }
        });
    }
    
    public void iniciar(){
        vistaD.setLocationRelativeTo(null);
        vistaD.setVisible(true);
    }
    
    private void limpiar() {
        this.vistaD.txtAPat.setText("");
        this.vistaD.txtAMat.setText("");
        this.vistaD.txtNom.setText("");
        this.vistaD.cbbTDoc.setSelectedIndex(0);
        this.vistaD.txtNDoc.setText("");
        this.vistaD.txtNUser.setText("");
        this.vistaD.txtContra.setText("");
    }
}