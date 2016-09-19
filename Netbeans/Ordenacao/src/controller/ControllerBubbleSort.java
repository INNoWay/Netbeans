package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.BubbleSort;
import static view.JFMenu.jRadioButton1;
import static view.JFMenu.jRadioButton2;
import static view.JFMenu.jRadioButton4;
import static view.JFMenu.jRadioButton5;

public class ControllerBubbleSort {
    
    //Cria uma lista
    public List sorteaElmentos = new ArrayList<Integer>();
     
    public void  controllerBubbleSort(){
        
        int i, num = 0;
        
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())){
        num = 30;
        }else if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())){
        num = 20000;
        }
        
        //Cria vetor
        int[] vetor = new int[num]; 
        
        //Adiciona elementos na lista
        for(i=1; i<=num; i++){
        sorteaElmentos.add(i);
        }
        
        //Desordena os elementos da lista
        Collections.shuffle(sorteaElmentos); 
        
        //Passa para o vetor os elementos da lista desordenada
        for(i=1; i<=num-1; i++){
        vetor[i] = (int) sorteaElmentos.get(i);
        }
        
        System.out.println("Elementos Desordenados BubbleSort: "+sorteaElmentos);
                
        //Chama o metodo do vetBubbleSort para ordenar os elementos do vetor
         if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())){
       
        BubbleSort bs = new BubbleSort();  
        bs.vetBubbleSort(vetor,30); 
        bs.imprime(vetor);
        }else if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())){
        BubbleSort bs = new BubbleSort();  
        bs.vetBubbleSort(vetor,20000); 
        bs.imprime(vetor);
        
        }
     }
    
}
