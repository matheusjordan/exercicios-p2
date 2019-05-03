package exercicio6;

public class ConversorDeComprimento {
	private static final double JARDAS = 1.09361;
	private static final double POLEGADAS = 39.36996;
	
	public static double metrosToJardas(double metros) {
		return metros * JARDAS;
	}
	
	public static double metrosToPolegadas(double metros) {
		return metros * POLEGADAS;
	}
}
