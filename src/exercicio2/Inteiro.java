package exercicio2;

public class Inteiro {
	private int numero;
	
	public Inteiro(int numero) {
		this.numero = numero;
	}
	
	//Quest�o 1
	public int getAlgU() {
		return numero % 10;
	}
	
	//Quest�o 2
	public int getAlgD() {
		return (numero / 10) % 10;
	}
	
	//Quest�o 3
	public int getAlgC() {
		return (numero / 100) % 10;
	}
	
	//Quest�o 4
}
