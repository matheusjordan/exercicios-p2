package exercicio2;

public class ConversorChar {
	
	//Quest�o 6
	public static char getCharMaiusculo(char ch) {
		int num = (int) ch;
		char caractere = (char) (num -32);
		return caractere;
	}
	
	//Quest�o 7
	public static char getCharMinusculo(char ch) {
		int num = (int) ch;
		char caractere = (char) (num + 32);
		return caractere;
	}
}
