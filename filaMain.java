package fila;

public class Main {
  public static void main(String[] args) {
	  Fila minhaFila = new Fila();
	  minhaFila.insere("Linder");
	  minhaFila.insere("Prog 3");
	  minhaFila.insere("Terminando a aula");
	  
	  while(!minhaFila.vazia()) {
		  String aux = minhaFila.remove();
		  System.out.printf("\nString recuperada da fila = %s",aux);
	  }
  }
}
