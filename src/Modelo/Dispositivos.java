
package Modelo;

/**
 *
 * @author glend
 */
public class Dispositivos {
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

    public Dispositivos(String nombre, String correo_electronico, String estado) {
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.estado = estado;
    }


}
