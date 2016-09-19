package collections.workshop.set;

import collections.workshop.amostra.Cachorro;
import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    
    //HashSet é bem rápido , utiliza HashTable em sua implementação
    //seus elementos não são ordenados
    //complexidade desta estrutura é nulla, para os metodos add, remover, retirar, o tempo de execução sempre será o mesmo
    //otimo para lidar com grande volumes de dados que nao precise de ordenação 
    
    public static void main(String[] args) { 
    
        HashSet<Cachorro> hash = new HashSet<Cachorro>();
        
        hash.add(new Cachorro(5));
        hash.add(new Cachorro(3));
        hash.add(new Cachorro(4));
        hash.add(new Cachorro(1));
        hash.add(new Cachorro(2)); 
        
        Iterator<Cachorro> iterator = hash.iterator();
        
        System.out.println("HashSet"); 

        while (iterator.hasNext()){ 
    
        System.out.println(iterator.next() + " ");
    
        }
    
    }
    
}
