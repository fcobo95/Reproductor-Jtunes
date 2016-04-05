
package reproductor_multimedia;

public class NodoUsuario {
    
    //ARBOLES
 
    private Usuario usuario;
    private NodoUsuario hijoIzq;
    private NodoUsuario hijoDer;

    public NodoUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public NodoUsuario getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoUsuario hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoUsuario getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoUsuario hijoDer) {
        this.hijoDer = hijoDer;
    }
    
}
