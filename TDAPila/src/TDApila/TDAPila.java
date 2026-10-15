package TDApila;
public class TDAPila {
    public static void main(String[] args) {
        Pila pila = new Pila();
        
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        System.out.println("Peek: "+ pila.peek());
        System.out.println("Pop: "+ pila.pop());
        System.out.println("Empty: "+ pila.empty());
        System.out.println("Size: "+ pila.size());
    }
    
}
