package controll;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Seguranca {
    
    public String converterSenhaEmMD5(String password){
        
        BigInteger hash = null;
        
        try{
            
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        hash = new BigInteger(1, md.digest(password.getBytes()));
        
        }
        
        catch(NoSuchAlgorithmException nsa){
            
        System.out.println("Algoritmo não encontrado.");
        
        }
        
        return String.format("%32x", hash);
        
    }
             
}