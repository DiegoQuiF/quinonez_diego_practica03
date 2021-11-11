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
    
    public User(String materno, String nombres, String documento) {
        this.materno = materno;
        this.nombres = nombres;
        this.tipoDoc = new TipoDocumento();
        this.documento = documento;
        this.indiceTarjeta = 0;
        this.tarjetas = new Tarjeta[Configuracion.maxTarjetasUser];
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public TipoDocumento getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(TipoDocumento tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Tarjeta[] getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(Tarjeta[] tarjetas) {
        this.tarjetas = tarjetas;
    }

    public int getIndiceTarjeta() {
        return indiceTarjeta;
    }

    public void setIndiceTarjeta(int indiceTarjeta) {
        this.indiceTarjeta = indiceTarjeta;
    }

    public Tarjeta getPorDefecto() {
        return porDefecto;
    }

    public void setPorDefecto(Tarjeta porDefecto) {
        this.porDefecto = porDefecto;
    }
    
    
    
    
    
    
    
}