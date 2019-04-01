package exercicio2;

public class Media {
	private float[] numeros;
	
	public Media(float... nums) {
		numeros = nums;
	}
	
	//Questão 10
	public float getMedia() {
		float soma = 0.0f;
		int qtd = numeros.length;
		
		for(float num : numeros) {
			soma += num;
		}
		
		return soma / qtd;
	}
}
