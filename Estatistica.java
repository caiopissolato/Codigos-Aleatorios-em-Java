package estatistica;

import java.util.Arrays;
import java.util.Scanner;

/* Este exemplo visa ilustrar o uso alguns conceitos básicos, como loopings e 
 *  passagem de parâmetro para métodos
 */
public class Estatistica {
	public static void main(String[] args) {
		double[] numeros = new double[5];
	
		//lê os elementos do array
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com os elementos do array: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("numeros[%d]=", i);
			numeros[i] = leitor.nextDouble();
		}
		
		//media do array
		double media = calculaMedia(numeros);
		
		//maior valor
		double maior = encontraMaior(numeros);
		
		//soma 3
		double resultado = soma(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0);
		
		//mostra resultado
		System.out.printf("Media = %.2f, Maior = %.2f", media, maior);
		
		System.out.printf("Soma = %.2f", resultado);
	}
	
	//método para calcular a média
	public static double calculaMedia(double[] array) {
		double soma = 0.0;
		for(double elem: array) {
			soma += elem;
		}
		return soma / array.length;
	}
	
	//método para encontrar o maior valor do array
	public static double encontraMaior(double[] array) {
		double maior = Double.MIN_VALUE;
		for(double elem: array) {
			if(elem > maior)
				maior = elem;
		}
		return maior;
	}
	
	//método para encontrar maior 2
	public static double encontraMaior2(double[] array) {
	  Arrays.sort(array);
	  return array[array.length -1];
	}
	
	//soma numeros
	public static double soma(double... nums) {
		double soma = 0.0;
		for(double elem: nums) {
			soma += elem;
		}
		return soma;
	}
}
