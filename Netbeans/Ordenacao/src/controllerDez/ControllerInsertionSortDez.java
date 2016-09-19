package controllerDez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.InsertionSort;
import static view.JFMenu.jRadioButton1;
import static view.JFMenu.jRadioButton2;
import static view.JFMenu.jRadioButton3;
import static view.JFMenu.jRadioButton4;
import static view.JFMenu.jRadioButton5;


public class ControllerInsertionSortDez {
     //Cria uma lista
    public List sorteaElmentos1 = new ArrayList<Integer>();
    public List sorteaElmentos2 = new ArrayList<Integer>();
    public List sorteaElmentos3 = new ArrayList<Integer>();
    public List sorteaElmentos4 = new ArrayList<Integer>();
    public List sorteaElmentos5 = new ArrayList<Integer>();
    public List sorteaElmentos6 = new ArrayList<Integer>();
    public List sorteaElmentos7 = new ArrayList<Integer>();
    public List sorteaElmentos8 = new ArrayList<Integer>();
    public List sorteaElmentos9 = new ArrayList<Integer>();
    public List sorteaElmentos10 = new ArrayList<Integer>();
    
     
    public void  controllerInsertionSortDez(){
        
        int i, n = 30, num = 0;
        
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())){
        num = 30;
        }else if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){
        num = 20000;
        }
        
        //Cria vetor
        int[] vetor1 = new int[num]; 
        int[] vetor2 = new int[num];
        int[] vetor3 = new int[num];
        int[] vetor4 = new int[num];
        int[] vetor5 = new int[num];
        int[] vetor6 = new int[num];
        int[] vetor7 = new int[num];
        int[] vetor8 = new int[num];
        int[] vetor9 = new int[num];
        int[] vetor10 = new int[num];
        
        
        //Adiciona elementos na lista
        for(i=1; i<=num; i++){
        sorteaElmentos1.add(i);
        sorteaElmentos2.add(i);
        sorteaElmentos3.add(i);
        sorteaElmentos4.add(i);
        sorteaElmentos5.add(i);
        sorteaElmentos6.add(i);
        sorteaElmentos7.add(i);
        sorteaElmentos8.add(i);
        sorteaElmentos9.add(i);
        sorteaElmentos10.add(i);
        }
        
        //Desordena os elementos da lista
        Collections.shuffle(sorteaElmentos1); 
        Collections.shuffle(sorteaElmentos2);
        Collections.shuffle(sorteaElmentos3);        
        Collections.shuffle(sorteaElmentos4);
        Collections.shuffle(sorteaElmentos5);
        Collections.shuffle(sorteaElmentos6);
        Collections.shuffle(sorteaElmentos7);
        Collections.shuffle(sorteaElmentos8);
        Collections.shuffle(sorteaElmentos9);
        Collections.shuffle(sorteaElmentos10);        
        
        //Passa para o vetor os elementos da lista desordenada
        for(i=1; i<=num-1; i++){
        vetor1[i] = (int) sorteaElmentos1.get(i);
        vetor2[i] = (int) sorteaElmentos2.get(i);
        vetor3[i] = (int) sorteaElmentos3.get(i);
        vetor4[i] = (int) sorteaElmentos4.get(i);
        vetor5[i] = (int) sorteaElmentos5.get(i);
        vetor6[i] = (int) sorteaElmentos6.get(i);
        vetor7[i] = (int) sorteaElmentos7.get(i);
        vetor8[i] = (int) sorteaElmentos8.get(i);
        vetor9[i] = (int) sorteaElmentos9.get(i);
        vetor10[i] = (int) sorteaElmentos10.get(i);
        
        }
        
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos1);
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos2);
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos3);
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos4);
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos5);
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos6);
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos7);                
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos8);
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos9);
        System.out.println("Elementos Desordenados InsertionSort: "+sorteaElmentos10);
        
        //Chama o metodo do vetBubbleSort para ordenar os elementos do vetor
        InsertionSort is = new InsertionSort();  
        is.intInsertionSort(vetor1);
        is.imprime(vetor1);
        is.intInsertionSort(vetor2);        
        is.imprime(vetor2);
        is.intInsertionSort(vetor3);
        is.imprime(vetor3);
        is.intInsertionSort(vetor4);
        is.imprime(vetor4);
        is.intInsertionSort(vetor5);         
        is.imprime(vetor5);
        is.intInsertionSort(vetor6);
        is.imprime(vetor6);
        is.intInsertionSort(vetor7); 
        is.imprime(vetor7);
        is.intInsertionSort(vetor8);
        is.imprime(vetor8);
        is.intInsertionSort(vetor9);
        is.imprime(vetor9);
        is.intInsertionSort(vetor10); 
        is.imprime(vetor10);
        
     }
    
}
