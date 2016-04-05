
package reproductor_multimedia;

public class ListaImagen {
    
    private NodoImagen cabeza;
    private NodoImagen ultimo;
    
    public void inserta(Imagen i){
        if(cabeza == null){
            cabeza = new NodoImagen(i);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else {
            ultimo.setNext(new NodoImagen(i));
            ultimo.getNext().setBack(ultimo);
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }
    }
    
    public void elimina(String nombre) {
        NodoImagen aux = cabeza;
        if (aux.getImagen().getNombre().equals(nombre)) {
            cabeza = cabeza.getNext();
            cabeza.setBack(ultimo);
            ultimo.setNext(cabeza);
        } else if (ultimo.getImagen().getNombre().equals(nombre)) {
            ultimo.getBack().setNext(cabeza); //ARREGLAR ERROR AL SACAR IMAGENES
            ultimo = ultimo.getBack();
        } else {
            aux = aux.getNext();
            while (aux != cabeza) {
                if (aux.getImagen().getNombre().equals(nombre)) {
                    aux.getBack().setNext(aux.getNext());
                    aux.getNext().setBack(aux.getBack()); //ARREGLAR ERROR
                }
                aux = aux.getNext();
            }
        }
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo);
    }
    
    @Override
    public String toString(){
        NodoImagen aux = cabeza;
        String s = "Lista de Imagenes:\n";
        if (aux != null) {
            s += aux + "";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + "";
                aux = aux.getNext();
            }
        } else {
            s += "Vacia";
        }
        return s;
    }
}
