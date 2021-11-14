
package Modelo;

import Programa.Configuracion;

/**
 * @author Diego Quinonez Flores
 */

public class ArregloUser {
    
    private User arregloU[];
    private int indiceUser;
    
    public ArregloUser(int tamano) {
        this.indiceUser = 0;
        this.arregloU = new User[tamano];
    }

    public ArregloUser() {
        this.indiceUser = 0;
        this.arregloU = new User[Configuracion.maxUser];
    }
    
    public boolean agregarUsuario(User usuario){
        boolean result = false;
        if(!usuarioRegistrado(usuario)) {
            if(this.indiceUser >= this.arregloU.length){
                crecerArreglo();
            }
            this.arregloU[this.indiceUser] = usuario;
            this.indiceUser++;
            result = true;
        }
        return result;
    }
    
    public boolean usuarioRegistrado(User usuario) {
        boolean result = false;
        for(int i=0; i<this.indiceUser; i++) {
            if(this.arregloU[i].getTipoDoc().getNombre() == usuario.getTipoDoc().getNombre()) {
                if(this.arregloU[i].getDocumento() == usuario.getDocumento()) {
                    result = true;
                }
            }
        }
        return result;
    }
    
    private void crecerArreglo() {
        User arregloPlus[] = new User[(this.arregloU.length) + 1];
        for(int i=0; i<this.indiceUser; i++){
            arregloPlus[i] = this.arregloU[i];
        }
        this.arregloU = arregloPlus;
    }
    
    
}