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

    public Movimiento(int codigo, String tipo, int dd, int mm, int aaaa, float monto, int codEst, String nomEst, String direcEst) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.dd = dd;
        this.mm = mm;
        this.aaaa = aaaa;
        this.monto = monto;
        this.lugar = new Estacion(codEst, nomEst, direcEst);
    }
    
    
    
    
    
    
}