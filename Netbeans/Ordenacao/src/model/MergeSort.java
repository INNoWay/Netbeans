package model;

import static view.JFMenu.jRadioButton1;
import static view.JFMenu.jRadioButton2;
import static view.JFMenu.jRadioButton3;
import static view.JFMenu.jRadioButton4;
import static view.JFMenu.jRadioButton5;

public class MergeSort {
    
    static int contMerge=0;
    
    public static int setMergeSort(){
       
        int num = contMerge;   
        System.out.println("Quantidade de trocas do Merge: " + contMerge);
        return num;
        
   }
    
    public static void intMergeSort(int[] array, int inicio, int fim) {
	       
        if (fim <= inicio) {
            return;
	}
        
	int meio = (inicio + fim) / 2;
	intMergeSort(array, inicio, meio);
	intMergeSort(array, meio + 1, fim);
	int[] A = new int[meio - inicio + 1];
	int[] B = new int[fim - meio];
        
	for (int i = 0; i <= meio - inicio; i++) {
            A[i] = array[inicio + i];
	}
        
	for (int i = 0; i <= fim - meio - 1; i++) {
            B[i] = array[meio + 1 + i];
	}
        
	int i = 0;
	int j = 0;
        
	for (int k = inicio; k <= fim; k++) {
            if (i < A.length && j < B.length) {
                    if (A[i] < B[j]) {
                        array[k] = A[i++];
                    } else {
                        array[k] = B[j++];
                    }
            } else  if (i < A.length) {
                    array[k] = A[i++];
                    } else if (j < B.length) {
                        array[k] = B[j++];
                    }
                    contMerge++;
	}
    }
    
    public static void imprime(int vetor[]) {
   
        int cont, num = 0;
    
        setMergeSort();
        
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())){
        num = 30;
        }
        if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){
        num = 20000;
        }
    // imprimi os elementos ordenados         
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){  
        System.out.print("Elementos Ordenados MergeSort: ");
            for(cont=1; cont<num; cont++) {           
            System.out.print(vetor[cont]+", ");  
            }
        }     
        if((jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())){       
        System.out.print("Elementos Inversamente Ordenados MergeSort: ");    
            for(cont=num-1; cont>=0; cont--) {          
            System.out.print(vetor[cont]+", "); 
            }        
        }
    }
}
