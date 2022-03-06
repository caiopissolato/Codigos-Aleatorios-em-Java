import java.util.Scanner;

public class IO{
  public static void main(String []args){
    Scanner in = new Scanner(System.in);
    
    String nome;
    System.out.printf("\nEntre com seu nome: ");
    nome = in.nextLine(); //le texto
    
    int data;
    System.out.printf("\nEntre com sua data de nascimento: ");
    data = in.nextInt();
    
    int idade = 2018 - data;
    
    System.out.printf("\n%s tem %d de idade...", nome,idade);
 
  }
}  