
package reproductor_multimedia;

import javax.swing.*;

public class Usuario {
    
    private String nombre;
    private long id;
    private String contrasena;
    private ImageIcon foto;
    

    public Usuario(String nombre, long id, String contrasena, ImageIcon foto) {
        this.nombre = nombre;
        this.id = id;
        this.contrasena = contrasena;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }
    
}
