package exercicio4;

public class Sintetizador {
	
	private final String MIL = "MIL";
	private final String ZERO = "ZERO";
	private String[] centena = {"CEM", "DUZENTOS", "TREZENTOS", "QUATROCENTOS", "QUINHENTOS", "SEISCENTOS", "SETECENTOS", "OITOCENTOS", "NOVECENTOS"};
	private String[] dezena = {"DEZ", "VINTE", "TRINTA", "QUARENTA", "CINQUENTA", "SESENTA", "SETENTA", "OITENTA", "NOVENTA"};
	private String[] unidade = {"UM", "DOIS", "TRES", "QUATRO", "CINCO", "SEIS", "SETE", "OITO", "NOVE", "DEZ"};
	
	
	public String getText(int num) {
		String text = "";
		
		boolean divMil = num % 1000 == 0;
		if(divMil) {
			num += num % 1000;
			text += MIL;
			
		}
		
		boolean divCent = num % 100 == 0;
		if(divCent) {
			num += num % 100;
			text += centena[num -1];
		}
		
		boolean divDez = num % 10 == 0;
		if(divDez) {
			num += num % 10;
			text += dezena[num -1];
			
		}
		
		boolean divUni = num % 1 == 0;
		if(num % 1 == 0) {
			num += num % 1;
			text += unidade[num -1];
		}
		
		return text;
	}
}
