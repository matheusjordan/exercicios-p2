package exercicio4;

public class Somatorio {
	private int inicio;
	private int fim;
	
	public Somatorio(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	public int getSomatorio() {
		int soma = 0;
		
		for (int i=inicio; i <= fim; i++) {
			soma += i;
		}
		
		return soma;
	}
}
