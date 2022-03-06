import java.util.Scanner;

public class maior{
  public static void main(String []args){
    int a, b, c;
    Scanner in = new Scanner(System.in);

    
   System.out.printf("\nEntre com o valor a: ");
   a = in.nextInt();
   
   System.out.printf("\nEntre com o valor b: ");
   b = in.nextInt();
   
   System.out.printf("\nEntre com o valor c: ");
   c = in.nextInt();
   
   double maior;
   if(a > b){
    maior=a;
   }else{
    maior=b;
   }
   if(c > maior){
    maior = c;
   }
   
   System.out.printf("\nMaior valor: %.2f",maior);
   
   }
 }  
   
   
    