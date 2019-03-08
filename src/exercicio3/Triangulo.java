package exercicio3;

public class Triangulo {
	private int a;
	private int b;
	private int c;
	
	public Triangulo(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// Questão 13
	public boolean isTriangulo() {
		int soma = this.a + this.b;
		if(soma >= this.c) {
			return true;
		} return false;
	}
	
	//0 = nenhum
	//1 = equilatero
	//2 = isosceles
	//3 = escaleno
	public  int getTipoTriangulo() {
		
		if(!this.isTriangulo()) {
			return 0;
		}
		
		if(a == b && b == c && a == c) {
			return 1;
		}
		else if(a == b || b == c || a == c) {
			return 2;
		}
		else return 3;
	}
}
