package exercicio2;

public class Inteiro {
	private int numero;
	
	public Inteiro(int numero) {
		this.numero = numero;
	}
	
	//Questão 1
	public int getAlgU() {
		return numero % 10;
	}
	
	//Questão 2
	public int getAlgD() {
		return (numero / 10) % 10;
	}
	
	//Questão 3
	public int getAlgC() {
		return (numero / 100) % 10;
	}
	
	//Questão 4
}
