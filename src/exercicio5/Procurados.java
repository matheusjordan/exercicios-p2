package exercicio5;

public class Procurados {
	private String[] vetor;
	
	public Procurados(String[] vetor) {
		this.vetor = vetor;
	}
	
	public boolean hasProcurado(String procurado) {
		for(String proc : vetor) {
			if(proc.contentEquals(procurado)) {
				return true;
			}
		}
		return false;
	}
}
