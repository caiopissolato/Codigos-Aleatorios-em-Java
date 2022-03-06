import java.util.Scanner;

public class Balanco{
  public static void main(String [] args){
   double janeiro;
   double fevereiro;
   double marco;
 
   Scanner in = new Scanner(System.in);
   
   System.out.printf("\nEntre com o gasto de Janeiro: ");
   janeiro = in.nextDouble();
   
   System.out.printf("\nEntre com o gasto de Fevereiro: ");
   fevereiro = in.nextDouble();
   
   System.out.printf("\nEntre com o gasto de Março: ");
   marco = in.nextDouble();
   
   double total, media;
   
   total = janeiro + fevereiro + marco;
   media = total/3.0;
   
   System.out.printf("\nGasto Total: %.2f",total);
   System.out.printf("\nGasto medio: %.2f",media);
  } 
}  