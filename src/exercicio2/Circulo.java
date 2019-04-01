package exercicio2;

public class Circulo {
	private float raio;
	private final float PI = 3.14159f; 

	public Circulo(float raio) {
		this.raio = raio;
	}
	
	public float getDiametro() {
		return raio * 2;
	}
	
	public float getArea() {
		return (raio * raio) * this.PI;
	}
	
	public float getCircunferencia() {
		return (raio * this.PI) * 2;
	}
}
