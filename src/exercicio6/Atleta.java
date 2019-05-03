package exercicio6;

public class Atleta {
	private static double MAIOR_PESO;
	private static double MAIOR_ALTURA;
	
	private String nome;
	private double peso;
	private double altura;
	
	protected Atleta(String nome) {
		this.nome = nome;
	}
	
	protected Atleta(String nome, double peso) {
		this(nome);
		this.peso = peso;
		verifyAndSetMaiorPeso(peso);
	}
	
	public Atleta(String nome, double peso, double altura) {
		this(nome, peso);
		this.altura = altura;
		verifyAndSetMaiorAltura(altura);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		verifyAndSetMaiorPeso(peso);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		verifyAndSetMaiorAltura(altura);
	}

	public static double getMAIOR_PESO() {
		return MAIOR_PESO;
	}

	public static double getMAIOR_ALTURA() {
		return MAIOR_ALTURA;
	}

	public String toString() {
		return "Nome: " + this.nome 
				+"\nPeso: " + this.peso
				+"\nAltura: " + this.altura;
	}

	protected void verifyAndSetMaiorPeso(double peso) {
		MAIOR_PESO = (peso > MAIOR_PESO) ? peso : MAIOR_PESO;
	}
	
	protected void verifyAndSetMaiorAltura(double altura) {
		MAIOR_ALTURA = (altura > MAIOR_ALTURA) ? altura : MAIOR_ALTURA;
	}
}
