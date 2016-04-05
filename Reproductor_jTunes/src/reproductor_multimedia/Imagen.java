
package reproductor_multimedia;

import javax.swing.*;

public class Imagen {
    
    private String nombre;
    private ImageIcon imagen;

    public Imagen(String nombre, ImageIcon imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Imagen: " + nombre;
    } 
}
