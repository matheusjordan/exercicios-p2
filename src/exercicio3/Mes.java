package exercicio3;

public class Mes {
	String[] meses = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
	
	public Mes() {
	}
	
	//Questão 8
	public String getMesByNum(int num) {
		return (num > 0) && (num <= 12) ? meses[num -1] : "";
	}
	
	//Questão 9
	public int getMesByNome(String nome) {
		for(int i = 0; i < meses.length; i++) {
			if(nome.equals(meses[i])) {
				return i+1;
			}
		} return 0;
	}
	
	//Questão 10
	public int getDiasByMesAndAno(int mes, int ano){
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
			
		case 2:
			if(isBissexto(ano)) {
				return 29;
			}return 28;
			
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		}
		return 0;
	}
	
	public static boolean isBissexto(int ano) {
		boolean divisibleBy4 = ano % 4 == 0;
		boolean divisibleBy10 = ano % 10 == 0;
		boolean divisibleBy400 = ano % 400 == 0; 
		boolean divisibleBy100 = ano % 100 == 0;
		
		if((divisibleBy4 && !divisibleBy10) || (divisibleBy400 && !divisibleBy100)) {
			return true;
		} return false;
	}
}
