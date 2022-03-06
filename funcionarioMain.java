package funcionario;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		//cria uma lista de funcionarios
		ArrayList<Funcionario> lista = new ArrayList<>();
		Scanner leitor = new Scanner(System.in);
		String nome = "";
		double salario;
		while(true) {
			System.out.printf("\nEntre com o nome do funcionario, ou \"fim\" para sair:");
			nome = leitor.nextLine();
			if(nome.equalsIgnoreCase("fim")) {
				break;
			}
			
			System.out.printf("\nEntre com o salário do funcionario:");
			salario = Double.parseDouble(leitor.nextLine());
			lista.add(new Funcionario(nome, salario)); //com construtor
			//lista.add(Funcionario.getInstance(nome, salario)); //com factory
		}
		
		// mostra a lista de funcionarios
		for(Funcionario f: lista) {
			System.out.printf("\nNome = %s, Salario = %.2f, ID = %d", f.getNome(), f.getSalario(), f.getId());
		}
		
		//da  um aumento de 10% a todos os funcionarios
		for(Funcionario f: lista) {
			f.aumentaSalario(10.0);
			System.out.printf("\nNome = %s, Salario = %.2f, ID = %d", f.getNome(), f.getSalario(), f.getId());
		}
	}
}