//package exercicio4;
//
//public class Conversor {
//	private int numero;
//	
//	public Conversor(int numero) {
//		this.numero = numero;
//	}
//	
//	public String getNumeroRomano() {
//		
//		
//		return "";
//	}
//	
//	//Funções que retornam o algarismo
//	private int getMilhar(int numero) {
//		return (numero / 1000);
//	}
//	
//	private int getCentena(int numero) {
//		return (numero / 100);
//	}
//	
//	private int getDezena(int numero) {
//		return (numero / 10);
//	}
//	
//	private String getUnidade(int numero) {
//		int num = (numero % 10);
//		String alg = "";
//		
//		if(num == 5) alg += "V";
//		else if(num == 6) alg += "VI";
//		else if(num == 4) alg += "IV";
//		else if(num == 9 || num == 1) alg += "I";
//		
//	}
//	
//	// Retorna o tamanho do numeo
//	private int getTamanho(int numero) {
//		if(numero == 0) return 1;
//		
//		int cont = 0;
//		while(numero % 10 != 0) {
//			cont++;
//		}
//		return cont;
//	}
//}
