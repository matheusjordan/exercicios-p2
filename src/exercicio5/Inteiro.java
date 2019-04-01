package exercicio5;

public class Inteiro {
	private int numero;
	
	public Inteiro(int num) {
		this.numero = num;
	}
	
	public int[] getDivs() {
		int qtdDivs = getQntdDivs();
		int[] divs = new int[qtdDivs];
		
		int div = 0;
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				divs[div] = i;
				div++;
			}
		}
		return divs;
	}
	
	public int getQntdDivs() {
		if (numero == 0) return 0;
		if (numero == 1) return 1;
		
		int divs = 2;
		for (int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				divs += 1;
			}
		}
		return divs;
	}
}
