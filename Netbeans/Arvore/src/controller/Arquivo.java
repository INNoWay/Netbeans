package controller;

import model.BTree;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arquivo {
    
    public List dados = new ArrayList<>();
     
    private String num;
    
    private int i;
    
    public Arquivo() throws FileNotFoundException{ 
             
        BTree bt = new BTree();
        
        Scanner scanner = new Scanner(new FileReader("arq.txt")).useDelimiter(",");
        
        try{
            
            while (scanner.hasNext()) {
  
            num = scanner.next();
                        
            i = Integer.parseInt(num);            
            
            bt.insertBTNode(i);
            
            dados.add(this.i); 
            
            }               
            
            bt.printInOrder(); 
            
            bt.printPosOrder();
    
            bt.printPreOrder();
        }
        catch(Exception e){
            
        System.out.println("Valor invalido no arquivo txt");
         
        }
    }
    
} 



