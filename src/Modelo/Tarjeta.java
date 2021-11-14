
package Modelo;

import Programa.Configuracion;

/**
 * @author Diego Quinonez Flores
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

    public void setIndiceMov() {
        this.indiceMov++;
    }
    
    public boolean recargarTarjeta(float monto, Estacion esta) {
        boolean result = false;
        Movimiento mov = new Movimiento(this.indiceMov+1000, "recarga", Configuracion.ddHoy, Configuracion.mmHoy, Configuracion.aaaaHoy, monto);
        this.setIndiceMov();
        mov.setLugar(esta);
        if((this.isActivo() == true)&&(monto > 0.0f)){
            this.saldo += monto;
            if(!(this.indiceMov < this.movimientos.length)){
                aumentarMovimientos();
            }
            this.movimientos[this.indiceMov] = mov;
            this.indiceMov++;
            result = true;
        }
        return result;
    }
    
    public boolean consumirTarjeta(Estacion esta) {
        boolean result = false;
        Movimiento mov = new Movimiento(this.indiceMov+1000, "consumo", Configuracion.ddHoy, Configuracion.mmHoy, Configuracion.aaaaHoy, this.getPrecio());
        this.setIndiceMov();
        mov.setLugar(esta);
        if((this.isActivo() == true)&&(this.getSaldo() >= this.getPrecio())&&(this.getPrecio() > 0.0f)){
            this.saldo -= this.precio;
            if(!(this.indiceMov < this.movimientos.length)){
                aumentarMovimientos();
            }
            this.movimientos[this.indiceMov] = mov;
            this.indiceMov++;
            result = true;
        }
        return result;
    }
    
    private boolean aumentarMovimientos() {
        boolean result = false;
        Movimiento nuevosMovimientos[] = new Movimiento[(this.movimientos.length) + 1];
        for(int i=0; i<this.movimientos.length; i++){
            nuevosMovimientos[i] = this.movimientos[i];
        }
        this.movimientos = nuevosMovimientos;
        result = true;
        return result;
    }
    
}