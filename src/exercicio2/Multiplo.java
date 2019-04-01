package exercicio2;

public class Multiplo {

	//Questão 11
	public static int getMaiorMultiplo(int num, int limite) {
		int maiorMultiplo = 0;
		
		for(int i = 0; i<limite; i++) {
			
			if(i % num == 0) {
				
				//Verifica se o multiplo é igual ou maior que 100
				if(maiorMultiplo >= limite) {
					return maiorMultiplo;
				
				} else {
					maiorMultiplo = i;
				}
			}
		}
		
		return maiorMultiplo;
	}
}
