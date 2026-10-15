
package TDApila;

public class Pila {
    private Nodo cima;
    private int nElementos;
    
    public Pila() {
        cima = null;
        nElementos = 0;
    }
    
    public void push(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        nElementos++;
    }
    
    public int pop() {
        if (empty()) {
            throw new RuntimeException("La pila esta vacia");
        }
        int dato = cima.dato;
        cima = cima.siguiente;
        nElementos--;
        return dato;
    }
    
    public int peek() {
        if (empty()) {
            throw new RuntimeException("La pila esta vacia");
        }
        return cima.dato;
    }
    
    public boolean empty() {
        return cima == null;
    }
    
    public int size() {
        return nElementos;
    }
}
