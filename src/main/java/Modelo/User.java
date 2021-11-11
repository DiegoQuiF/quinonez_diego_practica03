package Modelo;

import Programa.Configuracion;

/**
 * @author Diego Quiñonez Flores
 */

public class User {
    
    private String paterno;
    private String materno;
    private String nombres;
    private TipoDocumento tipoDoc;
    private String documento;
    private Tarjeta tarjetas[];
    private int indiceTarjeta;
    private Tarjeta porDefecto;

    public User(String paterno, String materno, String nombres, String nomDoc, int codDoc, String documento) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.tipoDoc = new TipoDocumento(nomDoc, codDoc);
        this.documento = documento;
        this.indiceTarjeta = 0;
        this.tarjetas = new Tarjeta[Configuracion.maxTarjetasUser];
    }
    
    public User(String paterno, String nombres, String nomDoc, int codDoc, String documento) {
        this.paterno = paterno;
        this.nombres = nombres;
        this.tipoDoc = new TipoDocumento(nomDoc, codDoc);
        this.documento = documento;
        this.indiceTarjeta = 0;
        this.tarjetas = new Tarjeta[Configuracion.maxTarjetasUser];
    }
    
    
    
    
    
    
    
    
}