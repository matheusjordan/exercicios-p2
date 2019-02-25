package exercicio2;

public class Promocao {
	private float valor;
	private float porcentagemDesconto;
	
	public Promocao(float valor, float porcentagemDesconto) {
		this.valor = valor;
		this.porcentagemDesconto = porcentagemDesconto;
	}
	
	//Questão 9
	public float getValorComDesconto() {
		return valor - ((valor * porcentagemDesconto) / 100f);
	}
}
