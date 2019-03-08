package exercicio3;

public class Comparador3 {
	private double num1;
	private double num2;
	private double num3;

	public Comparador3(double num1, double num2, double num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	//Questão 5
	public double getMaior() {
		if (num1 >= num2 && num1 >= num3) {
			return num1;
		} 
		else if (num2 >= num1 && num2 >= num3) {
			return num2;
		} 
		else if (num3 >= num1 && num3 >= num2) {
			return num3;
		}
		return num1;
	}

	//Questão 6
	public double getMenor() {
		if (num1 <= num2 && num1 <= num3) {
			return num1;
		} 
		else if (num2 <= num1 && num2 <= num3) {
			return num2;
		} 
		else if (num3 <= num1 && num3 <= num2) {
			return num3;
		}
		return num1;
	}
}
