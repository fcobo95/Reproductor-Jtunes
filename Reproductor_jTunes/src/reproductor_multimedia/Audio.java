
package reproductor_multimedia;

import javax.swing.*;
import java.applet.*;

public class Audio {
    
    private String nombre;
    private String artista;
    private String album;
    private String genero;
    private ImageIcon caratula;
    private AudioClip audio;

    public Audio(String nombre, String artista, String album, String genero, ImageIcon caratula, AudioClip audio) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.caratula = caratula;
        this.audio = audio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ImageIcon getCaratula() {
        return caratula;
    }

    public void setCaratula(ImageIcon caratula) {
        this.caratula = caratula;
    }

    public AudioClip getAudio() {
        return audio;
    }

    public void setAudio(AudioClip audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Cancion: " + nombre + " | Artista: " + artista + " | Album: " +
                album + " | Genero: " + genero;
    }
    
    
}
