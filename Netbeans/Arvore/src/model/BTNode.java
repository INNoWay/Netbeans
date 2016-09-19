package model;

public class BTNode {
    int val; //valor do no
    BTNode esq;//referencia para o filho esquerdo
    BTNode dir;//referencia para o filho direito
    //contrutor
    public BTNode(int p_val, BTNode p_esq, BTNode p_dir){
        val= p_val;
        esq=p_esq;
        dir=p_dir;
    }    
    
}
