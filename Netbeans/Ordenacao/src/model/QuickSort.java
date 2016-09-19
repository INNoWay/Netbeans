package model;

import static view.JFMenu.jRadioButton1;
import static view.JFMenu.jRadioButton2;
import static view.JFMenu.jRadioButton3;
import static view.JFMenu.jRadioButton4;
import static view.JFMenu.jRadioButton5;

public class QuickSort{
    
   static int contquick=0;
   
   public static int setQuickSort(){
       
        int num = contquick;   
        System.out.println("Quantidade de trocas do Quick: " + contquick);
        return num;
        
   }
   
   public static void ordenar(int[] vetor){
       
        int cont, num = 0;  
        
        setQuickSort();
        
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())){
        ordenar(vetor, 1, 29);
        }else if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){
        ordenar(vetor, 1, 19999);
        }
        
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())){
        num = 30;
        }
        if((jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){
        num = 20000;
        }
        
    // imprimi os elementos ordenados         
        if((jRadioButton4.isSelected() && jRadioButton1.isSelected())||(jRadioButton5.isSelected() && jRadioButton1.isSelected())||(jRadioButton4.isSelected() && jRadioButton3.isSelected())||(jRadioButton5.isSelected() && jRadioButton3.isSelected())){  
        System.out.print("Elementos Ordenados QuickSort: ");
            for(cont=1; cont<num; cont++) {           
            System.out.print(vetor[cont]+", ");  
            }
        }        
        if((jRadioButton4.isSelected() && jRadioButton2.isSelected())||(jRadioButton5.isSelected() && jRadioButton2.isSelected())){       
        System.out.print("Elementos Inversamente Ordenados QuickSort: ");        
            for(cont=num-1; cont>=0; cont--) {      
            System.out.print(vetor[cont]+", "); 
            }       
        }
   }

   public static void ordenar(int[] vetor, int inicio, int fim){
        
      contquick++;
      
      if (inicio < fim){
         int posicaoPivo = separar(vetor, inicio, fim);
         ordenar(vetor, inicio, posicaoPivo - 1);
         ordenar(vetor, posicaoPivo + 1, fim);
      }       
   }

   private static int separar(int[] vetor, int inicio, int fim){
       
      int pivo = vetor[inicio];
      int i = inicio + 1, f = fim;
      while (i <= f)
      {
         if (vetor[i] <= pivo)
            i++;
         else if (pivo < vetor[f])
            f--;
         else
         {
            int troca = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = troca;
            i++;
            f--;
         }
      }
      vetor[inicio] = vetor[f];
      vetor[f] = pivo;
      return f;
   }
}
