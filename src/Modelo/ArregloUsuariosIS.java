
package Modelo;

import Programa.Configuracion;

/**
 * @author Diego
 */

public class ArregloUsuariosIS {
    
    private Usuario usuarios[];
    private int indiceUsuarios;

    public ArregloUsuariosIS() {
        this.usuarios = new Usuario[Configuracion.maxUsuarios];
        this.indiceUsuarios = 0;
    }
    
    public void agregarUsuarioIS(Usuario usuario) {
        if(!usuarioRegistrado(usuario)){
            if(this.indiceUsuarios >= this.usuarios.length){
                crecerArreglo();
            }
            this.usuarios[this.indiceUsuarios] = usuario;
            this.indiceUsuarios++;
        }
    }
    
    public boolean usuarioRegistrado(Usuario usuario) {
        boolean result = false;
        for(int i=0; i<this.indiceUsuarios; i++) {
            if(this.usuarios[i].getNombre() == usuario.getNombre()){
                result = true;
            }
        }
        return result;
    }
    
    public boolean usuarioRegistrado(String usuario) {
        boolean result = false;
        for(int i=0; i<this.indiceUsuarios; i++) {
            if(this.usuarios[i].getNombre() == usuario){
                result = true;
            }
        }
        return result;
    }
    
    private void crecerArreglo() {
        Usuario usuariosPlus[] = new Usuario[(this.usuarios.length) + 1];
        for(int i=0; i<this.indiceUsuarios; i++) {
            usuariosPlus[i] = this.usuarios[i];
        }
        this.usuarios = usuariosPlus; 
    }
    
    
}