package collections.workshop.set;

import collections.workshop.amostra.Cachorro;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    
    //utiliza o algoritmo red-black tree(árvore rubro-negra) 
    //seus elementos são ordenados
    //possui uma complexidade maior, para os metodos add, remover, retirar possui maior variação de tempo
    //otimo para lidar com  volumes de dados que nescessitam mais precisao para sua ordenação 
    
    public static void main(String[] args) { 

        TreeSet<Cachorro> tree = new TreeSet<Cachorro>();
    
        tree.add(new Cachorro(5));
        tree.add(new Cachorro(3));
        tree.add(new Cachorro(4));
        tree.add(new Cachorro(1));
        tree.add(new Cachorro(2));  
  
        Iterator<Cachorro> iterator = tree.iterator(); 
  
        System.out.println("TreeSet"); 
  
        while (iterator.hasNext()) { 
    
        System.out.println(iterator.next() + " "); 
    
        }

    }
    
}

