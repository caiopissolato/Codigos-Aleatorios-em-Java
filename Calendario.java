//package cal;



import java.time.LocalDate;
import java.util.Scanner;

/* este exemplo visa implementar um gerador de calendário com base no mês e
 * no ano.
 */

public class Calendario {
	public static void main(String[] args) {
	  	//Lê o mes e o ano
		Scanner leitor = new Scanner(System.in);
		System.out.printf("Entre com o ano: ");
		int ano = leitor.nextInt();
		System.out.printf("\nEntre com mês: ");
		int mes = leitor.nextInt();
		System.out.println();
		leitor.close();

		//definindo a data inicial
		LocalDate data = LocalDate.of(ano, mes, 1);
		
		//imprime o calendário
		System.out.println("Su Mo Tu We Th Fr Sa");
		for(int i=0; i < (data.getDayOfWeek().getValue()%7); i++)
			System.out.print("   ");
		
		while(data.getMonthValue() == mes) {
			System.out.printf("%2d ", data.getDayOfMonth());
			if((data.getDayOfWeek().getValue()%6) == 0)
				System.out.println();
			data = data.plusDays(1); //avança um dia
		}	
		System.out.println();

		/*LocalDate data0 = LocalDate.of(2002, 12, 1);
		System.out.printf("%s: ", data0.getMonth(), "\n");*/			
	}
}