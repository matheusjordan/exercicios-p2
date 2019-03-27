package exercicio4;

public class Numero {
	private int valor;
	
	public Numero(int numero) {
		this.valor = numero;
	}
	
	// Sabe-se o tamanho de um numero contando quantas vezes o mesmo é divisivel por 10
	// QUando o resto da divisão desse numero for 0, então contamos quantas vezes ele foi divido
	// Até chegar no resto 0. E caso o numero seja 0, retorne 1
	public int getDigitos() {
		if (valor == 0) return 1;
		
		int cont = 0;
		while(valor % 10 != 0) {
			cont += 1;
			valor = valor / 10;
		}
		return cont;
	}
	
	public int getFatorial() {
		if (valor == 0 || valor == 1) return 1;
		
		int fatorial = 0;
		for (int i = (valor -1); i > 0; i--) {
			fatorial += i * valor;
		}
		return fatorial;
	}
}
