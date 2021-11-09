package Modelo;

import Programa.Configuracion;

/**
 * @author Diego Quiñonez Flores
 */

public class User {
    
    private String aPat;
    private String aMat;
    private String nom;
    private String tDoc;
    private String doc;
    private int edad;
    private int nCel;
    private Tarjeta[] tarjetas;
    private int indiceT;

    public User(String aPat, String aMat, String nom, String tDoc, String doc, int edad, int nCel) {
        this.aPat = aPat;
        this.aMat = aMat;
        this.nom = nom;
        this.tDoc = tDoc;
        this.doc = doc;
        this.edad = edad;
        this.nCel = nCel;
        this.tarjetas = new Tarjeta[Configuracion.maxTarjetasUser];
        this.indiceT = 0;
    }
    
    public User() {
        this.aPat = "modo invitado";
        this.aMat = "modo invitado";
        this.nom = "modo invitado";
        this.tDoc = "000";
        this.doc = "00000000";
        this.edad = 0;
        this.nCel = 0;
        this.tarjetas = new Tarjeta[Configuracion.maxTarjetasUser];
        this.indiceT = 0;
    }
    
     public User(String aPat, String aMat, String nom, String doc, int edad, int nCel) {
        this.aPat = aPat;
        this.aMat = aMat;
        this.nom = nom;
        this.tDoc = "DNI";
        this.doc = doc;
        this.edad = edad;
        this.nCel = nCel;
        this.tarjetas = new Tarjeta[Configuracion.maxTarjetasUser];
        this.indiceT = 0;
    }
    
    
    
    
}