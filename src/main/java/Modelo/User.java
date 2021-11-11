package Modelo;

import Programa.Configuracion;

/**
 * @author Diego Quiñonez Flores
 */

public class User {
    
    private String paterno;
    private String materno;
    private String nombres;
    private String documento;
    private String tipoDocumento;
    private Tarjeta tarjetas[];
    private int indiceTarjeta;
    private Tarjeta porDefecto;

    public User(String paterno, String materno, String nombres, String documento, String tipoDocumento) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.indiceTarjeta = 0;
        this.tarjetas = new Tarjeta[Configuracion.maxTarjetasUser];
    }
    
    public User(String paterno, String nombres, String documento, String tipoDocumento) {
        this.paterno = paterno;
        this.nombres = nombres;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.indiceTarjeta = 0;
        this.tarjetas = new Tarjeta[Configuracion.maxTarjetasUser];
    }
    
    
    
    
    
    
    
    
}