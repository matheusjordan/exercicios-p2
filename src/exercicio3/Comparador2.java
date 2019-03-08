package exercicio3;

public class Comparador2 {
	private double num1;
	private double num2;
	
	public Comparador2(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Questão 3
	public double getMaior() {
		if(num1 >= num2) {
			return num1;
		} 
		else return num2;
	}
	
	//Questão 4
	public double getMenor() {
		if(num1 <= num2) {
			return num1;
		}
		else return num2;
	}
}
