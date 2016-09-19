package collections.workshop.hashset;

import collections.workshop.hashmap.HashSet;
import collections.workshop.amostra.Amostra;

/**
 *
 * @author Daniel, Bruno, Samuel, Leticia. 
 */
public class HashSetAmostra {

    public static void main(String[] args) {

        HashSet<Amostra> meuHashSet = new HashSet<Amostra>();
        meuHashSet.adicionar(new Amostra("0001", "Maria"));
        meuHashSet.adicionar(new Amostra("0002", "Jose"));
        meuHashSet.adicionar(new Amostra("0003", "Tadeu"));
        meuHashSet.adicionar(new Amostra("0004", "Carol"));
        meuHashSet.adicionar(new Amostra("0005", "Sarah"));
        meuHashSet.adicionar(new Amostra("0006", "Petrus"));
        meuHashSet.adicionar(new Amostra("0006", "Petrus"));
        //meuHashSet.adicionar(new Amostra(null, null));
        //meuHashSet.adicionar(new Amostra("0009", null));
         
        System.out.println("\n\n HashSet contem amostra com id 0001 & nome = 'Maria'?"
                + " " + meuHashSet.contains(new Amostra("0001", "Maria")));
        System.out.println(" HashSet contem amostra com id 00050 & nome = 'Alice'?"
                + " " + meuHashSet.contains(new Amostra("00050", "Alice")));

        System.out.println("\n\nExibindo Informações:");
        meuHashSet.exibir();

        System.out.println("\n \n Amostra com id=0001 & nome = 'Maria' removida ?: "
                + meuHashSet.remover(new Amostra("0001", "Maria")));

        System.out.println("\n Amostra com id=00050 & nome = 'Alice' removida ?: "
                + meuHashSet.remover(new Amostra("00050", "Alice")));

      
        
        System.out.println("\n \n Exibindo Informações:");
        meuHashSet.exibir();

    }

}
