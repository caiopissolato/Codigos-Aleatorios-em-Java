package sorteioloteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
	  //criando o ArrayList
	  ArrayList<Integer> numeros = new ArrayList<>();
	  for(int i=0; i<50; i++)
		  numeros.add(i);
	  
	  //fazendo o sorteio
	  int[] valoresSorteados = new int[6];
	  for(int i=0; i < valoresSorteados.length; i++) {
		  int id = sorteia(numeros);
		  valoresSorteados[i] = numeros.remove(id);
	  }
	  
	  Arrays.sort(valoresSorteados);
	  System.out.println("Os Valores sorteados foram: ");
	  System.out.println(Arrays.toString(valoresSorteados));
  }
  
  //dado um arraylist sorteia um valor
  public static int sorteia(ArrayList<Integer> array) {
	  Random geradorNumeroAleatorio = new Random();
	  int indice = geradorNumeroAleatorio.nextInt(array.size());
	  return indice;
  }
  
}
