package fila;

/* neste exemplo implementamos a estrutura de dados Fila, com métodos para
 * inserção e remoção de elementos da fila. O objetivo fundamental foi mostrar a
 * utilização de classes aninhadas.
 */
public class Fila {
	private static class No{
		//variaveis de instancia da classe interna
		String dado;
		No proximo;
		
		//construtor da classe interna
		public No(String dado) {
			this.dado = dado;
			this.proximo = null;
		}
		
		public String getDado(){
			return this.dado;
		}
	}
	
	//variaveis de instancia da classe externa
	private No comeco;
	private No fim;
	
	//construtor
	public Fila() {
		this.comeco = null;
		this.fim = null;
	}
	
	public boolean vazia() {
		return this.comeco == null;
	}
	
	//metodo para inserir na fila
	public void insere(String dado) {
		No novoNo = new No(dado);
		if(vazia()) {
			this.comeco = novoNo;
			this.fim = novoNo;
		}else {
			this.fim.proximo = novoNo;
			this.fim = novoNo;
		}
	}
	
	//método para remover da fila
	public String remove() {
		if(vazia()) {
			return null;
		}else {
			No aux = this.comeco;
			if(this.comeco == this.fim) {	
				this.comeco = null;
				this.fim = null;
			} else {
			  this.comeco = this.comeco.proximo;
			  aux.proximo = null;
			}
			return aux.dado;
		}
	}
}
