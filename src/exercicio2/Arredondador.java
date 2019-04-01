package exercicio2;

public class Arredondador {
	private float numero;
	
	public Arredondador(int numero) {
		this.numero = numero;
	}
	
	//Questão 5
	public float getArredondado() {
		return (int) ((int) numero * 2) / 2;
	}
}
