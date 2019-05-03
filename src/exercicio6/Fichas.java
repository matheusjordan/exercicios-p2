package exercicio6;

import java.util.Date;

public class Fichas {
	private static int qntdFichas = 0;
	
	public static void genFichas(int qntd) {
		int limite = qntd + qntdFichas;
		
		for(int i = (qntdFichas+1); i<=limite; i++) {
			System.out.println(formatFicha(i));
		}
		
		qntdFichas = limite;
	}
	
	protected static String formatFicha(int ficha) {
		Date date = new Date();
		String txt = ficha + " " + date;
		return txt;
	}
}
