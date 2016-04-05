
package reproductor_multimedia;

import javax.swing.*;

public class ArbolUsuario {
    
    private NodoUsuario raiz;
    private boolean existe = false;

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }
    
    public void inserta(Usuario u) {
        if (raiz == null) {
            raiz = new NodoUsuario(u);
        } else {
            insertaRec(raiz, u.getId(), u);
        }
    }

    private void insertaRec(NodoUsuario n, long num, Usuario u) {
        if (num <= n.getUsuario().getId()) {
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new NodoUsuario(u));
            } else {
                insertaRec(n.getHijoIzq(), num, u);
            }
        } else if (n.getHijoDer() == null) {
            n.setHijoDer(new NodoUsuario(u));
        } else {
            insertaRec(n.getHijoDer(), num, u);
        }
    }
    
    public void inOrden() {
        if (raiz != null) {
            inOrdenRec(raiz);
        } else {
            System.out.println("El arbol esta vacio.");
        }
    }

    private void inOrdenRec(NodoUsuario n) {
        if (n != null) {
            inOrdenRec(n.getHijoIzq());
            System.out.print(n.getUsuario().getNombre() + " | " + n.getUsuario().getId() + "\n");
            inOrdenRec(n.getHijoDer());
        }
    }
    
    public void verificar(String usuario, String contrasena) {
        if (raiz != null) {
            verificarRec(raiz, usuario, contrasena);
        } else {
            JOptionPane.showMessageDialog(null, "Oops! Algo ha salido mal.\n"
                    + "Crea un usuario primero.");
        }
    }
    
    private void verificarRec(NodoUsuario n, String usuario, String contrasena) {
        if(n != null) {
            if (n.getUsuario().getNombre().equals(usuario) && n.getUsuario().
                    getContrasena().equals(contrasena)) {
                existe = true;
                Menu_Opciones menu_Opciones = new Menu_Opciones();
                menu_Opciones.setVisible(true);
            }
            verificarRec(n.getHijoIzq(), usuario, contrasena);
            verificarRec(n.getHijoDer(), usuario, contrasena);
        }
        if (existe = false) {
            JOptionPane.showMessageDialog(null, "Error: El usuario y/o "
                        + "contrasena son invalidos.");
        }
    }
}
