package collections.workshop.amostra;

public class Cachorro implements Comparable<Cachorro>{ 
    
    int cachorro; 
    
    public Cachorro(int s) { 
        
        cachorro = s; 
        
    } 
    
    public String toString() {
        
        return cachorro + ""; 
        
    } 
    
    @Override 
    
    public int compareTo(Cachorro o){ 
        
        return cachorro - o.cachorro;
        
    }
    
}

