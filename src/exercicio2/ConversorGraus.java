package exercicio2;

public class ConversorGraus {
	
	//Questão 7 - avisar ao professor
	public static float celciusToFahrenheit(float celcius) {
		return ((9/5.0f) * celcius) + 32;
	}
	
	//Questão 8
	public static float fahrenheitToCelcius(float fahrenheit) {
		return (fahrenheit - 32) / (9/5.0f);
	}
}
