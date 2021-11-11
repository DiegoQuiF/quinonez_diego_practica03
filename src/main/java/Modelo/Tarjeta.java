package Modelo;

/**
 * @author Diego Quiñonez Flores
 */

public class Tarjeta {
    
    private int numero;
    private float saldo;
    private boolean activo;
    private float precio;
    private Movimiento movimientos[];

    public Tarjeta(int numero, float saldo, float precio) {
        this.numero = numero;
        this.saldo = saldo;
        this.activo = true;
        this.precio = precio;;
    }
    
    public Tarjeta(int numero, float saldo, float precio, boolean activo) {
        this.numero = numero;
        this.saldo = saldo;
        this.activo = activo;
        this.precio = precio;;
    }
    
    
    
}