package model;

public class BTree {
    
    private BTNode raiz;// raiz da arvore 
    
    //construtor
    
    public BTree(){
        
    raiz= null;
    
    }
    
    //obter no raiz da arvore
    
    public BTNode getRaiz(){
        
    return raiz;
    
    }
    
    //setar no raiz da arvore
    
    public void setRaiz(BTNode p_no){
        
    raiz=p_no;
    
    }    
    
    //metodo publico para inserir um no na arvore binaria
    
    public void insertBTNode(int p_valor){
        
    raiz=insert(raiz, p_valor);
    
    }
    
    //insere na arvore percorrendo ate achar um no adequado
    
    private BTNode insert(BTNode p_no, int p_valor){
               
    if(p_no==null){
        
    return new BTNode(p_valor, null,null);
    
    }else{   
        
        if(p_valor==p_no.val){
            
        System.out.println("A valores repetidos na arvore. O Valor: "+p_no.val);
        
        }else{
            
            if(p_valor<=p_no.val){
                
            p_no.esq=insert(p_no.esq,p_valor);
            
            }else{
                
            p_no.dir=insert(p_no.dir,p_valor);
            
            }
            
        }
        
    }
    
        return p_no;
        
    }
    
    //metodo publico para imprimir a arvore InOrder
    
    public void printInOrder(){
        
        InOrder(raiz);    
        
    }
    
    public void printPosOrder(){
        
        PosOrder(raiz);    
    }
    
    public void printPreOrder(){
        
        PreOrder(raiz);    
        
    }
    
    //percorre a arvore de modo IN-ORDEM de forma recursiva
    
    private void InOrder(BTNode p_no){
        
        if(p_no!=null){
            
        InOrder(p_no.esq);
        
        System.out.println("\nIN-ORDEM: "+p_no.val);    
        
        InOrder(p_no.dir);
        
        }            
        
    }
    
    //percorre a arvore de modo POS-ORDEM
    
    private void PosOrder(BTNode p_no){
        
        if (p_no != null){ 
                        
        PosOrder(p_no.esq);  
        
        PosOrder(p_no.dir); 
        
        System.out.println("\nPOS-ORDEM: "+p_no.val); 
        
        }         
        
    }
    
    //percorre a arvore de modo PRE-ORDEM
    
    private void PreOrder(BTNode p_no){
        
        if (p_no != null){  
            
        System.out.println("\nPRE-ORDEM: "+p_no.val);  
        
        PreOrder(p_no.esq);  
        
        PreOrder(p_no.dir);  
        
        } 
                
    }
    public boolean containsKey(int p_valor){
        
        return contains(raiz, p_valor);
        
    }
    
    private boolean contains(BTNode p_no, int p_valor){
        
        if(p_no==null){
            
        return false;
        
        } 
        
        if(p_no.val==p_valor){
            
        return true;
        
        }
        
        if(p_valor<p_no.val){
            
        return contains(p_no.esq,p_valor);        
        
        }else{
            
        return contains(p_no.dir,p_valor);
        
        }    
    
    }
    
}
