package model;

/**
 *
 * @author Samuel
 */
public class Item {
    
    int valor;    
    
    Item proximo;
    
    public Item(int v) {
        
        this.valor = v;
        
        this.proximo = null;
        
    }
    
}
