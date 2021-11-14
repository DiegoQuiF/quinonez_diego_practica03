
package Modelo;

/**
 * @author Diego Quinonez Flores
 */

public class Usuario {
    
    private String nombre;
    private String contrasena;
    private User user;

    public Usuario(String nombre, String contrasena, User usuario) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.user = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public User getUser() {
        return user;
    }
    
}