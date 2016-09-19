package collections.workshop.performance;

import collections.workshop.amostra.Cachorro;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class PerformanceSet {
    
    //Teste de Performance no TreeSet, HashSet e LinkedHashSet
  
    public static void main(String[] args) {
        
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        
        HashSet<Cachorro> hashSet = new HashSet<Cachorro>();         
        LinkedHashSet<Cachorro> linkedSet = new LinkedHashSet<Cachorro>();
        TreeSet<Cachorro> treeSet = new TreeSet<Cachorro>(); 
        
        long startTimeHash = System.currentTimeMillis(); // start time        
        for (int i = 0; i < 1300000; i++) { 
            int x = r1.nextInt(1300000 - 13) + 10;
            hashSet.add(new Cachorro(x));
        }          
        long endTimeHash = System.currentTimeMillis(); // end time
        //long duration = endTime - startTime;    
        System.out.printf("HashSet: %.3f  segundos%n", (endTimeHash - startTimeHash) / 1000d);
         
        
        long startTime = System.currentTimeMillis(); // start time
        for (int i = 0; i < 1300000; i++) {
            int x = r2.nextInt(1300000 - 13) + 10;
            linkedSet.add(new Cachorro(x)); 
        } 
        long endTime = System.currentTimeMillis(); // end time
        //long duration = endTime - startTime;    
        System.out.printf("LinkedHashSet: %.3f  segundos%n", (endTime - startTime) / 1000d);
        
        
        long startTimeTree = System.currentTimeMillis(); // start time 
        for (int i = 0; i < 1300000; i++) {
            int x = r3.nextInt(1300000 - 13) + 10;
            treeSet.add(new Cachorro(x));
        } 
        long endTimeTree = System.currentTimeMillis(); // end time
        //long duration = endTime - startTime;    
        System.out.printf("TreeSet: %.3f  segundos%n", (endTimeTree - startTimeTree) / 1000d);
        
    }
    
}
