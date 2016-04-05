package reproductor_multimedia;

public class ColaAudio {

    private NodoAudio frente;
    private NodoAudio ultimo;

    public void insertar(NodoAudio a) {
        if (frente == null) {
            frente = a;
            ultimo = a;
        } else {
            ultimo.setAtras(a);
            ultimo = a;
        }
    }

    public NodoAudio remover() {
        NodoAudio aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }
    
    @Override
    public String toString(){
        String s = "";
        NodoAudio aux = frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }
}
