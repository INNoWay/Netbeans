package collections.workshop.hashmap;

/**
 *
 * @author Bruno, Daniel, Leticia, Samuel. 
 * 
 */
public class HashSet<E> {
    
    private HashMap<E, Object> hashMap;
    private LinkedHashMap<E, Object> linkedHashMap;
    
    public HashSet(){
    hashMap = new HashMap<>();
    linkedHashMap = new LinkedHashMap<>();
    }
    
    /**
     * Adiciona objeto no Conjunto Hash
     */
    public void adicionar(E valor){
     //   hashMap.inserir(valor, null);
        linkedHashMap.inserir(valor, null);
    }
    
    /**
     * Método que exibe todos os objetos do Conjunto. 
     * A ordem de inserção não é garantida, para manter ordem de inserção
     * devemos usar um LinkeHashSet
     */
    public void exibir(){
     //    hashMap.exibirConjunto();
         linkedHashMap.exibirConjuntoLinked(); //mantem ordem de insercao
    }
    
    
    public boolean contains(E objeto){
     //  return hashMap.contains(objeto) !=null ? true : false;
     return linkedHashMap.contains(objeto) !=null ? true : false;
    }
    
    /**
     * Método que remove objetos do Conjunto
     * @param objeto
     */
    public boolean remover(E objeto){
    //return hashMap.remover(objeto);
    return linkedHashMap.remover(objeto);
    }
}
