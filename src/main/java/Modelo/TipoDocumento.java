package Modelo;

/**
 * @author Diego Quiñonez Flores
 */

public class TipoDocumento {
    private String nombre;
    private int codigo;

    public TipoDocumento(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public TipoDocumento() {
        this.nombre = "DNI";
        this.codigo = 15003;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
    
}