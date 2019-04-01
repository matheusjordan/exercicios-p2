package exercicio5;

public class Lista {
	private int[] vetor;
	
	public Lista(int[] vetor) {
		this.vetor = vetor;
	}
	
	public boolean hasRepetido() {
		for(int i = 0; i < vetor.length; i++){
			int num1 = vetor[i];
			for(int j = (i +1); j < vetor.length; j++) {
				int num2 = vetor[j];
				if(num1 == num2) return true;
			}
		}
		return false;
	}
}
