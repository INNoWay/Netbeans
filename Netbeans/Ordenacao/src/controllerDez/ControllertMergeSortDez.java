
package controllerDez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.InsertionSort;
import model.MergeSort;
import static view.JFMenu.jRadioButton1;
import static view.JFMenu.jRadioButton2;
import static view.JFMenu.jRadioButton3;
import static view.JFMenu.jRadioButton4;
import static view.JFMenu.jRadioButton5;


public class ControllertMergeSortDez {
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
    
     
    public void  controllertMergeSortDez(){
        
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
        
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos1);
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos2);
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos3);
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos4);
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos5);
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos6);
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos7);                
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos8);
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos9);
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos10);
        
        //Chama o metodo do vetBubbleSort para ordenar os elementos do vetor
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())){
        
        MergeSort ms = new MergeSort();  
        ms.intMergeSort(vetor1,1,29);
        ms.imprime(vetor1);
        ms.intMergeSort(vetor2,1,29); 
        ms.imprime(vetor2); 
        ms.intMergeSort(vetor3,1,29);
        ms.imprime(vetor3); 
        ms.intMergeSort(vetor4,1,29);
        ms.imprime(vetor4); 
        ms.intMergeSort(vetor5,1,29);
        ms.imprime(vetor5); 
        ms.intMergeSort(vetor6,1,29);
        ms.imprime(vetor6);
        ms.intMergeSort(vetor7,1,29);
        ms.imprime(vetor7);
        ms.intMergeSort(vetor8,1,29);
        ms.imprime(vetor8); 
        ms.intMergeSort(vetor9,1,29);
        ms.imprime(vetor9);
        ms.intMergeSort(vetor10,1,29); 
        ms.imprime(vetor10);   
        
        }else if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){
        MergeSort ms = new MergeSort();  
        ms.intMergeSort(vetor1,1,19999);
        ms.imprime(vetor1);
        ms.intMergeSort(vetor2,1,19999); 
        ms.imprime(vetor2); 
        ms.intMergeSort(vetor3,1,19999);
        ms.imprime(vetor3); 
        ms.intMergeSort(vetor4,1,19999);
        ms.imprime(vetor4); 
        ms.intMergeSort(vetor5,1,19999);
        ms.imprime(vetor5); 
        ms.intMergeSort(vetor6,1,19999);
        ms.imprime(vetor6);
        ms.intMergeSort(vetor7,1,19999);
        ms.imprime(vetor7);
        ms.intMergeSort(vetor8,1,19999);
        ms.imprime(vetor8); 
        ms.intMergeSort(vetor9,1,19999);
        ms.imprime(vetor9);
        ms.intMergeSort(vetor10,1,19999); 
        ms.imprime(vetor10);                       
              
        }
     }  
}
