public class Balanco{
  public static void main(String [] args){
   double janeiro = 15000.0;
   double fevereiro = 23000.0;
   double marco = 17000.0;
   
   double total, media;
   
   total = janeiro + fevereiro + marco;
   media = total/3.0;
   
   System.out.printf("\nGasto Total: %.2f",total);
   System.out.printf("\nGasto medio mensal: %.2f",media);
  } 
}  