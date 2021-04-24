
package Modelo;

public class Usuario {
   static String admin;
   static String Contraseña;

    public static String getAdmin() {
        return admin;
    }

    public static void setAdmin(String admin) {
        Usuario.admin = admin;
    }

    public static String getContraseña() {
        return Contraseña;
    }

    public static void setContraseña(String Contraseña) {
        Usuario.Contraseña = Contraseña;
    }

    public Usuario(String admin,String Contraseña) {
        this.admin = admin;
        this.Contraseña = Contraseña;
    }

   
 
}
