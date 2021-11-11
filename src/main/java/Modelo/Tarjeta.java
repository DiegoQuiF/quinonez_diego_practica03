package Modelo;

/**
 * @author Diego Quiñonez Flores
 */

public class Tarjeta {
    
    private String aPat;
    private String aMat;
    private String nom;
    private String tDoc;
    private String doc;
    private int edad;
    private int nCel;
    private int numT;
    private boolean estado;
    private String nUser;
    private String passw;
    private float saldo;
    private float precio;

    public Tarjeta(String aPat, String aMat, String nom, String tDoc, String doc, int edad, int nCel, int numT, String nUser, String passw, float saldo, float precio) {
        this.aPat = aPat;
        this.aMat = aMat;
        this.nom = nom;
        this.tDoc = tDoc;
        this.doc = doc;
        this.edad = edad;
        this.nCel = nCel;
        this.numT = numT;
        this.nUser = nUser;
        this.passw = passw;
        this.saldo = saldo;
        this.precio = precio;
        this.estado = true;
    }

    public String getaPat() {
        return aPat;
    }

    public void setaPat(String aPat) {
        this.aPat = aPat;
    }

    public String getaMat() {
        return aMat;
    }

    public void setaMat(String aMat) {
        this.aMat = aMat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String gettDoc() {
        return tDoc;
    }

    public void settDoc(String tDoc) {
        this.tDoc = tDoc;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getnCel() {
        return nCel;
    }

    public void setnCel(int nCel) {
        this.nCel = nCel;
    }

    public int getNumT() {
        return numT;
    }

    public void setNumT(int numT) {
        this.numT = numT;
    }

    public String getnUser() {
        return nUser;
    }

    public void setnUser(String nUser) {
        this.nUser = nUser;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public boolean recargarTarjeta(float monto) {
        boolean result = false;
        if((this.getEstado() == true) && (monto>0.0f)){
            
        }
        return result;
    }
    
    public boolean consumirTarjeta(float monto) {
        boolean result = false;
        
        
        
        
        return result;
    }
    
    
}