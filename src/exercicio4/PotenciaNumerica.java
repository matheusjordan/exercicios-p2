package exercicio4;

public class PotenciaNumerica {
	private int base;
	private int expoente;
	
	public PotenciaNumerica(int base, int expoente) {
		this.base = base;
		this.expoente = expoente;
	}
	
	
	// Já que o resultado já começa pela base, é utilizado o valor da (base -1)
	public long getPotencia() {
		long resultado = base;
		
		for (int i=1; i < expoente; i++) {
			resultado *= base;
		}
		
		return resultado;
	}
}
