package controll;

public class TesteSeguranca {

    public static void main(String[] args) {
        
        String senhaCodificada = "";
        
        Seguranca seg = new Seguranca();
        
        senhaCodificada = seg.converterSenhaEmMD5("senha");
        System.out.println("Senha codificada: " + senhaCodificada);
        
        senhaCodificada = seg.converterSenhaEmMD5("senha2");
        System.out.println("Senha codificada: " + senhaCodificada);
        
        senhaCodificada = seg.converterSenhaEmMD5("senha");
        System.out.println("Senha codificada: " + senhaCodificada);      
        
        
    }
    
}
