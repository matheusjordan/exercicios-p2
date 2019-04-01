package exercicio3;

public class Aniversario {
	private int idade;
	
	public Aniversario(int dia, int mes, int ano) {
		this.idade = 2019 - ano;
	}
	
	public int getIdade() {
		return this.idade;
	}
}
