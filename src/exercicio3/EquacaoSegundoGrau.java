package exercicio3;

public class EquacaoSegundoGrau {
	private double a;
	private double b;
	private double c;
	
	public EquacaoSegundoGrau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isEquacaoValida() {
		if(this.a == 0 || this.calculeDelta() < 0) {
			return false;
		} return true;
	}
	
	public double calculeDelta() {
		return (this.b * this.b) - (4 * this.a * this.c);
	}
	
	public double calculeX1(double delta) {
		double raizQuadrada = Math.sqrt(delta);
		return ((-this.b) + raizQuadrada) / (2 * this.a);
	}
	
	public double calculeX2(double delta) {
		double raizQuadrada = Math.sqrt(delta);
		return ((-this.b) - raizQuadrada) / (2 * this.a);
	}
}
