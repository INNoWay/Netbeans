package model;

import static view.JFMenu.jRadioButton1;
import static view.JFMenu.jRadioButton2;
import static view.JFMenu.jRadioButton3;
import static view.JFMenu.jRadioButton4;
import static view.JFMenu.jRadioButton5;

public class BubbleSort {
     
    static int contbubble=0;
    
    public static int setBubbleSort(){
       
        int num = contbubble;   
        System.out.println("Quantidade de trocas do Bubble: " + contbubble);
        return num;
        
   }
    //Metodo par ordenação dos elementos
    public void vetBubbleSort(int v[], int n){
    
        int i, j, tmp;
        
        for(i=0;i<n-1;i++){
                    
            for(j=0;j<n-2;j++){
            
                if(v[j]>v[j+1]){
               
                    tmp=v[j];
                
                    v[j]=v[j+1];
                
                    v[j+1]=tmp;  
                    
                    contbubble++; 
                }
                     
            }   
         
        }         
        
    }
    public static void imprime(int vetor[]) {
   
        int cont, num = 0;
    
        setBubbleSort();
        
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())){
        num = 30;
        }
        if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){
        num = 20000;
        }       
        
    // imprimi os elementos ordenados         
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){  
        System.out.print("Elementos Ordenados BubbleSort: ");
            for(cont=1; cont<num; cont++) {           
            System.out.print(vetor[cont]+", ");  
            }
        }         
        if((jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())){       
         System.out.print("Elementos Inversamente Ordenados BubbleSort: ");    
            for(cont=num-1; cont>=0; cont--) {           
            System.out.print(vetor[cont]+", "); 
            }        
        }
    }    
}
