package model;

/**
 *
 * @author Samuel
 */
public class Fila {
    
    Item inicio, fim;

        
    public boolean estaVazia(){
    
        return inicio == null;
    
    }
    
    public void insereFim(int valor){
    
        Item novo = new Item(valor);
    
            if(estaVazia()){
        
            inicio = novo;
        
            fim = novo;
        
            }else{
            
            fim.proximo = novo;
         
            fim = novo;
         
            }
        
    }
    public int removeFila(){
    
        int valor = inicio.valor;
        
        inicio = inicio.proximo;
        
        return valor;
        
    }        
    
    public int frente(){
    
        return inicio.valor;
    
    }
    
    public int tamanho(){
    
        int tam = 0;
    
        Item aux = inicio;
    
            while(aux!=null){
    
            tam++;
    
            aux = aux.proximo;
    
            }
    
        return tam;
    
    }
    
}
