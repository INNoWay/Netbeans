package model;

import static view.JFMenu.jRadioButton1;
import static view.JFMenu.jRadioButton2;
import static view.JFMenu.jRadioButton3;
import static view.JFMenu.jRadioButton4;
import static view.JFMenu.jRadioButton5;


public class InsertionSort {
    
    static int continsertion=0;
    
    public static int setInsertionSort(){
       
        int num = continsertion;   
        System.out.println("Quantidade de trocas do Insertion: " + continsertion);
        return num;
        
   }
    //Metodo par ordenação dos elementos 
    public static void intInsertionSort (int []a){
    
        int i;
           
        for(i=1; i<a.length; i++){
    
            int temp = a[i];
            int j;
                
                for(j = i-1; j>=0 && temp<a[j]; j--)
                a[j+1]=a[j];
                a[j+1]=temp;
                
            continsertion++; 
        }  
        
    }
    public static void imprime(int vetor[]) {
   
        int cont, num = 0;
        
        setInsertionSort();
    
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())){
        num = 30;
        }
        if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){
        num = 20000;
        }
        
    // imprimi os elementos ordenados         
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){  
        System.out.print("Elementos Ordenados InsertionSort: ");
            for(cont=1; cont<num; cont++) { 
            System.out.print(vetor[cont]+", ");  
            }
        }         
        if((jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())){       
        System.out.print("Elementos Inversamente Ordenados InsertionSort: ");    
            for(cont=num-1; cont>=0; cont--) { 
            System.out.print(vetor[cont]+", "); 
            }        
        }
    }    
}
