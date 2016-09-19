package controller;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args){
        //Metodo para ler do teclado
        Scanner scan = new Scanner( System.in ); 
        
        System.out.println("Radix Sort\n");
        
        int n, i;       
        
        //Tamanho do vetor 
        System.out.print("Digite o tamanho do seu vetor: ");
        
        n = scan.nextInt();
        
        // Criar um array de inteiros de n elementos        
        int arr[] = new int[ n ];
        
        // Insere elements 
        System.out.println("\nDigite os "+ n +" Elementos a ser ordenados");
        
        for (i = 0; i < n; i++)
            
            arr[i] = scan.nextInt();
        
            // Chama o mmetodo sort 
            sort(arr);
            
            // imprime os elementos ordenados
            System.out.println("\nElements Ordenados"); 
            
        for (i = 0; i < n; i++)
            
        System.out.print(arr[i]+" ");     
        
        System.out.println();   
        
    }
    
}
