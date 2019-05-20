package exercicio6;

public class ConversorDePotencia {

	private static final double VALOR_CONVERSOR_PARA_POTENCIAHP = 0.9863;
	private static final double VALOR_CONVERSOR_PARA_POTENCIAKW = 0.7355;
	private static double potenciaHP;
	private static double potenciaKW;
	
	public static double getConversaoParaHP(int potenciaCV) {
		potenciaHP = potenciaCV * VALOR_CONVERSOR_PARA_POTENCIAHP;
		return potenciaHP;
	}
	
	public static double getConversaoParaKW(int potenciaCV) {
		potenciaKW = potenciaCV * VALOR_CONVERSOR_PARA_POTENCIAKW;
		return potenciaKW;
	}
	
}
