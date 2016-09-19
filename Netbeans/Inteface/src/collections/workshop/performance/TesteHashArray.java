package collections.workshop.performance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TesteHashArray {
public static void main(String[] args) {
    Collection<Integer> colecao = new ArrayList<Integer>(); //pecorre linear
    //Collection<Integer> colecao = new HashSet<Integer>(); //pecorre tabela
 
    long tempoInicial = System.currentTimeMillis();
 
    for (int i = 0; i < 1300000; i++) {
      colecao.add(i);
    }
 
    for (int i = 0; i < 130000; i++) {
      colecao.contains(i);
    }
 
    long tempoFinal = System.currentTimeMillis();
    System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
  }    
}
