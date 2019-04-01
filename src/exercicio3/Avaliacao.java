package exercicio3;

public class Avaliacao {
	private double nota1;
	private double nota2;
	private double nota3;
	private int aulas;
	private int faltas;
	
	public Avaliacao(double n1, double n2, double n3, int aulas, int faltas) {
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
		this.aulas = aulas;
		this.faltas = faltas;
	}
	
	public double getMedia() {
		double somaNotas = (this.nota1 + this.nota2 + this.nota3);
		double media = somaNotas / 3;
		
		return media;
	}
	
	private boolean isPresente() {
		int presencaMinima = (this.aulas * 75) / 100;
		int tolerancia = this.aulas - presencaMinima;
		
		if(this.faltas <= tolerancia) {
			return true;
		}
		
		return false;
	}
	
	public boolean isAprovado() {
		boolean naMedia = this.getMedia() >= 7;
		
		if(naMedia && this.isPresente()) {
			return true;
		}

		return false;
	}
}
