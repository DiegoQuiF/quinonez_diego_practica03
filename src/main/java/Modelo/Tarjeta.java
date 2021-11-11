package Modelo;

import Programa.Configuracion;

/**
 * @author Diego Quiñonez Flores
 */

public class Tarjeta {
    
    private int numero;
    private float saldo;
    private boolean activo;
    private float precio;
    private Movimiento movimientos[];
    private int indiceMov;

    public Tarjeta(int numero, float saldo, float precio) {
        this.numero = numero;
        this.saldo = saldo;
        this.activo = true;
        this.precio = precio;
        this.indiceMov = 0;
        this.movimientos = new Movimiento[Configuracion.numMovimientos];
    }
    
    public Tarjeta(int numero, float saldo, float precio, boolean activo) {
        this.numero = numero;
        this.saldo = saldo;
        this.activo = activo;
        this.precio = precio;
        this.indiceMov = 0;
        this.movimientos = new Movimiento[Configuracion.numMovimientos];
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public float getPrecio() {
        return precio;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public int getIndiceMov() {
        return indiceMov;
    }

    public void setIndiceMov(int indiceMov) {
        this.indiceMov = indiceMov;
    }
    
    public boolean recargarTarjeta(float monto, Estacion esta) {
        boolean result = false;
        Movimiento mov = new Movimiento(this.indiceMov+1000, "recarga", Configuracion.ddHoy, Configuracion.mmHoy, Configuracion.aaaaHoy, monto);
        if((this.isActivo() == true)&&(monto > 0.0f)){
            this.saldo += monto;
            this.movimientos[this.indiceMov] = mov;
            this.indiceMov++;
            result = true;
        }
        return result;
    }
    
    public boolean consumirTarjeta() {
        boolean result = false;
        
        
        
        return result;
    }
    
    public void aumentarMovimientos() {
        
        
        
    }
    
}