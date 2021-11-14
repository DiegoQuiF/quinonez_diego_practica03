
package Controlador;

import Programa.frmPerfil;
import Programa.frmUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.User;

/**
 * @author Diego Quinonez Flores
 */

public class ControladorPerfil {
    
    private frmPerfil perfil;
    
    public ControladorPerfil(frmPerfil perfil){
        this.perfil = perfil;
        this.perfil.btnCerrar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                perfil.dispose();
            }
        });
        
        this.perfil.btnRecargar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                
                perfil.dispose();
            }
        });
        
        this.perfil.btnConsumir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                
                perfil.dispose();
            }
        });
    }
    
    public void iniciar(){
        perfil.setLocationRelativeTo(null);
        perfil.setVisible(true);
    }
    
}