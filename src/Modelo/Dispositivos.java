
package Modelo;

/**
 *
 * @author glend
 */
public class Dispositivos {
private String id;
private String tipo;
private String nombre;
private String correo_electronico;
private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Dispositivos(String id, String tipo, String nombre, String correo_electronico, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.estado = estado;
    }
  
   


}
