package reproductor_multimedia;

import java.applet.*;


public class Reproductor {

    AudioClip v = java.applet.Applet.newAudioClip(getClass().getResource("../Audios/set.wav"));

    public void reproducir() {

        
            v.play();

        
    }
}
