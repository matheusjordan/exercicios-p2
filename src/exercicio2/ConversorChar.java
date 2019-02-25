package exercicio2;

public class ConversorChar {
	
	//Questão 6
	public static char getCharMaiusculo(char ch) {
		int num = (int) ch;
		char caractere = (char) (num -32);
		return caractere;
	}
	
	//Questão 7
	public static char getCharMinusculo(char ch) {
		int num = (int) ch;
		char caractere = (char) (num + 32);
		return caractere;
	}
}
