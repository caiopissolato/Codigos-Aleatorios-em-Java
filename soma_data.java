import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LocalDate data, data_fim;
		int d, m, a;
		System.out.println("Data para somar");
		System.out.println("Dia: ");
		d = in.nextInt();
		System.out.println("Mês: ");
		m = in.nextInt();
		System.out.println("Ano: ");
		a = in.nextInt();
		
		data = LocalDate.of(a, m, d);
		
		int n;
		System.out.println("Quantos dias deseja somar a está data? ");
		n = in.nextInt();
		
		data_fim = data.plusDays(n);
		
		System.out.println("\nData Final\n"+ data_fim.getDayOfMonth() +"/"+ data_fim.getMonthValue() +"/"+ data_fim.getYear());
	
		in.close();
	}
}