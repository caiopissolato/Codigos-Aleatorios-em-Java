package funcionario;

/* esse exercício implementa a classe funcionário e visa exemplificar
 * vários conceitos de POO, incluindo definição de classes, construtores,
 * variáveis estáticas, entre outros.
 */
public class Funcionario {
	//variáveis de instância
	private String nome;
	private double salario;
	private int id;
	private static int ultimoId = 0;
	
	// construtor
	public Funcionario() {
		this.nome = "";
		this.salario = 0.0;
		ultimoId++;
		this.id = ultimoId;
	}
	
	public Funcionario(String nome) {
		this(nome, 0.0);
	}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		ultimoId++;
		this.id = ultimoId;
	}
	
	//factory
	public static Funcionario getInstance(String nome, double salario) {
		return new Funcionario(nome, salario);
	}
	
	// métodos de acesso
	public String getNome() {
		return this.nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public int getId() {
		return this.id;
	}
	
	//método modificador
	public void aumentaSalario(double percentual) {
		double aumento = this.salario * percentual /100.0;
		this.salario += aumento;
	}

}
