package collections.workshop.set;

import collections.workshop.amostra.Cachorro;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {

    //possui performance do HashSet (vlocidade no processamento)
    //possui o poder de ordenação do TreeSet 
    //seus elementos continuam na ordem que são inseridos
    //complexidade desta estrutura é quase nulla, para os metodos add, remover, retirar, possui uma pequena variação de tempo
         
    public static void main(String[] args){ 
       
        LinkedHashSet<Cachorro> linkedhash = new LinkedHashSet<Cachorro>(); 
        
        linkedhash.add(new Cachorro(5));
        linkedhash.add(new Cachorro(3));
        linkedhash.add(new Cachorro(4));
        linkedhash.add(new Cachorro(1));
        linkedhash.add(new Cachorro(2)); 
        
        Iterator<Cachorro> iterator = linkedhash.iterator();
        
        System.out.println("LinkedHashSet"); 
        
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next() + " ");
            
        }
        
    }
    
}
