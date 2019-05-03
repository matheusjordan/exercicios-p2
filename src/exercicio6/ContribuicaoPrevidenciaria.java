package exercicio6;

public class ContribuicaoPrevidenciaria {
	private static final float SALARIO_1 = 1174.86f;
	private static final float SALARIO_2 = 1958.10f;
	private static final float SALARIO_3 = 3916.20f;
	
	private static final float ALIQUOTA_1 = 0.08f;
	private static final float ALIQUOTA_2 = 0.09f;
	private static final float ALIQUOTA_3 = 0.11f;
	
	private static final float TETO = 430.78f;
	
	private float valor;
	
	public ContribuicaoPrevidenciaria(float valor) {
		this.valor = valor;
	}
	
	public float calcContribuicao() {
		if(valor <= SALARIO_1) {
			return (valor * ALIQUOTA_1);
		} else if(valor <= SALARIO_2) {
			return (valor * ALIQUOTA_2);
		} else if(valor <= SALARIO_3) {
			return (valor * ALIQUOTA_3);
		}
		
		return TETO;
	}
	
	public float getSalarioLiquido() {
		float salarioLiquido = valor - calcContribuicao();
		return salarioLiquido;
	}
}
