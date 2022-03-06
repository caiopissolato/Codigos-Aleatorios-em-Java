package learquivo2;
public class LeArquivo2 {

    public static void main(String[] args) {
        String[] nome = {"ProgII", "UFMT", "CUA"};
        int[] numeros = {1,2,3,4,5};
        
        for(int i=0; i<nome.length; i++) {
            System.out.println(nome[i]);
        }
        
        for(String s: nome) {
            System.out.println(s);
        }
        for(int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
    }
    
    
}
