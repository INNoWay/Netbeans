package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.MergeSort;
import static view.JFMenu.jRadioButton1;
import static view.JFMenu.jRadioButton2;
import static view.JFMenu.jRadioButton4;
import static view.JFMenu.jRadioButton5;

public class ControllertMergeSort {
    
    //Cria uma lista
    public List sorteaElmentos = new ArrayList<Integer>();
    
    public void controllertMergeSort(){
       
        int i, num = 0;   
        
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())){
        num = 30;
        }else if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())){
        num = 20000;
        }
        
        int[] vetor = new int[num];
        
        //Adiciona elementos nas listas
        for(i=1; i<=num; i++){
        sorteaElmentos.add(i);
        }   
        
        //Desordena os elementos das listas
        Collections.shuffle(sorteaElmentos);
        
        //Passa para o vetor os elementos da lista desordenada
        for(i=1; i<=num-1; i++){
        vetor[i] = (int) sorteaElmentos.get(i);
        }
        
        System.out.println("Elementos Desordenados MergeSort: "+sorteaElmentos);        
                
        //Chama o metodo do intInsertionSort para ordenar os elementos do vetor
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())){
        
        MergeSort ms = new MergeSort();       
        ms.intMergeSort(vetor,1,29);
        ms.imprime(vetor);
        }else if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())){
        MergeSort ms = new MergeSort();       
        ms.intMergeSort(vetor,1,19999);
        ms.imprime(vetor);
        }  
              
    }
}
