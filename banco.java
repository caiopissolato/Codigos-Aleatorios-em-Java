package conta;

public class Conta {
	private String nome;
	private double saldo;
	private double limite;

	public Conta() {
		this.nome = "";
		this.saldo = 0.0;
		this.limite = 0.0;
	}

	public Conta(String n, double s, double l) {
		this.nome = n;
		this.saldo = s;
		this.limite = l;
	}

	public boolean deposita(double valor) {
		if(valor >= 0) {
			this.saldo += valor;
			return true;
		}else {
			return false;
		}
	}

	public boolean saca(double valor) {
		if((this.saldo + this.limite) >= valor) {
			this.saldo -= valor;
			return true;
		}else {
		  return false;
		}
	}

	public boolean transfere(Conta c, double valor) {
		if((this.saldo + this.limite) >= valor) {
			c.saldo += valor;
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}

	public void show() {
		System.out.printf("\nNome = %s\n Saldo = %.2f\n Limite = %.2f", this.nome, this.saldo, this.limite);
	}

}

public class Main {
  public static void main(String [] args) {
	  Conta c1, c2;

	  c1 = new Conta("Joao", 5500.0, 10000.0);
	  c2 = new Conta("Marcelo", 2000.0, 3000.0);

	  c1.show(); //joao; saldo=5500; limite = 10000.0
	  c2.show(); //Marcelo; saldo = 2000.0; limite = 3000.0

	  c1.deposita(500.0);
	  c2.saca(300.0);

	  c1.transfere(c2, 400.0);

	  c1.show(); //joao; saldo = 5600.0; limite = 10000
	  c2.show(); //marcelo; saldo = 2100; limite = 3000

  }
}
