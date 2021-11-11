package Modelo;

/**
 * @author Diego quiñonez Flores
 */

public class Movimiento {
    private int codigo;
    private String tipo;
    private int dd;
    private int mm;
    private int aaaa;
    private float monto;
    private Estacion lugar;

    public Movimiento(int codigo, String tipo, int dd, int mm, int aaaa, float monto) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.dd = dd;
        this.mm = mm;
        this.aaaa = aaaa;
        this.monto = monto;
        this.lugar = new Estacion();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDd() {
        return dd;
    }

    public int getMm() {
        return mm;
    }

    public int getAaaa() {
        return aaaa;
    }

    public float getMonto() {
        return monto;
    }

    public Estacion getLugar() {
        return lugar;
    }

    public void setLugar(Estacion lugar) {
        this.lugar = lugar;
    }
    
    
    
    
    
    
}