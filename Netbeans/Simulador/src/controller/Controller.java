package controller;

import javax.swing.table.DefaultTableModel;

import model.Fila;

import static view.JFSimulador.jTSenhaChamada;

import view.JFSimulador;

import static view.JFSimulador.jTable1;

import static view.JFSimulador.jTable2;

public class Controller {
      
    int valorNorm, valorPref;
    
    Fila f2 = new Fila();
     
    Fila f1 = new Fila();
    
    int cont1 = 0;
       
    int cont2 = 0;
    
    int cont = 0;
           	
    public void retirarSenhaNormal(int valor){
        
        this.valorNorm=valor;
        
        f1.insereFim(valorNorm);
        
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();  
  
        Object[] linha = null; 
                
        tabelaModelo.addRow(linha);
        
        tabelaModelo.setValueAt(valorNorm,cont1,0);    
        
        System.out.println("Tamanho Normal: "+f1.tamanho());
                      
        cont1++;      
    }
	
    public void retirarSenhaPreferencial(int valor){
               
        this.valorPref=valor;    
        
        f2.insereFim(valorPref); 
        
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable2.getModel();  
  
        Object[] linha = null; 
                
        tabelaModelo.addRow(linha);
        
        tabelaModelo.setValueAt(valorPref,cont2,0);  
        
        System.out.println("Tamanho Prioritaria: "+f2.tamanho());
        
	cont2++; 
    }
	
    public void chamarSenha (){
                
        if(f2.estaVazia()){
            
        int valorN = f1.frente();  
        
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable1.getModel();
                
        tabelaModelo.removeRow(cont);
            
        jTSenhaChamada.setText(String.valueOf(valorN));         
        
        System.out.println("Frente Normal: "+f1.frente()); 
        
        f1.removeFila();
        
        cont1--;  
        
        }else{   
            
        int valorP = f2.frente(); 
        
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTable2.getModel();
                
        tabelaModelo.removeRow(cont);     
        
        jTSenhaChamada.setText(String.valueOf(valorP));  
        
        System.out.println("Frente Prioritaria: "+f2.frente());   
        
        f2.removeFila();    
        
        cont2--;  
        
        }
        
    }
	
}
