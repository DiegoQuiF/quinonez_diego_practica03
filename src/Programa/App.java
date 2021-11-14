
package Programa;

import Modelo.ArregloUser;
import Modelo.Estacion;
import Modelo.Tarjeta;
import Modelo.User;

/**
 * @author Diego Quinonez Flores
 */

public class App {
    
    public static void main (String [] Args) {
        Tarjeta t1, t2, t3;
        User usuario;
        ArregloUser usuarios = new ArregloUser();
        Estacion A = new Estacion(1526, "Estacion Grau", "Av. Grau");
        Estacion B = new Estacion(1527, "Estacion Riva Aguero", "Av. Riva Aguero");
        
        usuario = new User("Quiñonez", "Flores", "Diego", "DNI", 15003, "72429935");
        usuarios.agregarUsuario(usuario);
        usuario.crearTarjeta(15425145, 200f, 1.5f);
        usuario.recargarTarjeta(15425145, 50f, A);
        usuario.consumirTarjeta(15425145, A);
        
        usuario = new User("Perez", "Hernandes", "Miriam", "DNI", 15003, "72485192");
        usuarios.agregarUsuario(usuario);
        usuario.crearTarjeta(15421234, 120f, 1.5f);
        usuario.recargarTarjeta(15421234, 30f, B);
        usuario.consumirTarjeta(15421234, B);
        
    }
    
    
}