
package reproductor_multimedia;

public class NodoImagen {
    
    //LISTAS DOBLES
    
    private Imagen imagen;
    private NodoImagen next;
    private NodoImagen back;

    public NodoImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public NodoImagen getNext() {
        return next;
    }

    public void setNext(NodoImagen next) {
        this.next = next;
    }

    public NodoImagen getBack() {
        return back;
    }

    public void setBack(NodoImagen back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return imagen + "\n";
    }
}
