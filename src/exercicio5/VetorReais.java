package exercicio5;

public class VetorReais {
	public double[] vetor = new double[4];
	
	public VetorReais(double[] vetor) {
		this.vetor = vetor;
	}
	
	public double getMaior() {
		double maior = vetor[0];
		for (double val : vetor) {
			if(val >= maior) {
				maior = val;
			}
		}
		return maior;
	}
	
	public double getMenor() {
		double menor = vetor[0];
		for (double val : vetor) {
			if(val <= menor) {
				menor = val;
			}
		}
		return menor;
	}
	
	public double getMedia() {
		double media = 0;
		
		for(double val : vetor) {
			media += val;
		}
		media /= 4;
		return media;
	}
}
