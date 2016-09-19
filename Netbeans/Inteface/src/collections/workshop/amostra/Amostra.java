package collections.workshop.amostra;

public class Amostra {
    
    private String id;
    private String nome;
    
    //Construtor de Amostras
  
    public Amostra (String id, String nome){
        
    this.id = id;    
    this.nome = nome;
    
    }
    
    @Override
    public String toString(){
        
    return "\n Amostra[ ID = " + id  + " Nome = " + nome + "]";
    
    }
    
    @Override
    public boolean equals(Object x){
        
    if (x == null){
        
    return false;
            
    }
    
    if(this.getClass() != x.getClass()){
        
    return false;
    
    }
    
    Amostra a = (Amostra)x;
    
    return a.id.equals(this.id) && a.nome.equals(this.nome);
    
    }  
    
    @Override
    public int hashCode(){
        
    return id.hashCode() + nome.hashCode();
    
    }
    
}


