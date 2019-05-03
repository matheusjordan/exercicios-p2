package exercicio6;

public class PontoCartesiano {
	private int coordX;
	private int coordY;
	private String rotulo;
	
	public PontoCartesiano(int coordX, int coordY, String rotulo) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.rotulo = rotulo;
	}
	
	public PontoCartesiano clone(PontoCartesiano ponto) {
		PontoCartesiano newPonto = ponto;
		return newPonto;
	}
	
	public String toString() {
		return "Coordenada X: " + coordX + "\n"
				+ "Coordenada Y: " + coordY + "\n"
				+ "Rotulo: " + rotulo;
	}
}
