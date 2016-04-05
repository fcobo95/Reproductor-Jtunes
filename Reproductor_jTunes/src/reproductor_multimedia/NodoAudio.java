
package reproductor_multimedia;

public class NodoAudio {
    
    //COLAS
    
    private Audio audio;
    private NodoAudio atras;

    public NodoAudio(Audio audio) {
        this.audio = audio;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public NodoAudio getAtras() {
        return atras;
    }

    public void setAtras(NodoAudio atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "Audio:\n" + audio;
    }
}
