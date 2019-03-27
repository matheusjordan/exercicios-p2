package exercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.printf("Escolha uma opção (1 a 10): ");
		int opc = read.nextInt();
		
		switch(opc) {
		case 1:
			int numero = Numero.getLen(2314321544548L);
			System.out.println(numero);
			break;
			
		case 2:
			long numero0 = Numero.getFatorial(4);
			System.out.println(numero0);
			break;
			
		case 3:
			numero = Numero.getMMC(420, 360);
			System.out.println(numero);
			break;
		
		case 4:
		
		case 5:
		
		case 6:
			
		case 7:
			
		case 8:
			
		case 9:
			Sintetizador st = new Sintetizador();
			String texto = st.getText(11);
			System.out.println(texto);
		case 10:
			Calendario cl = new Calendario();
			
			cl.generateTable(4, 2019);
			
//			for(int i=1 ; i<=30; i++) {
//				int dia = cl.diaDaSemana(9, 2015, i);
//				switch(dia) {
//				case 1:
//					System.out.println(dia +" segunda");
//					break;
//				case 2:
//					System.out.println(dia +" terça");
//					break;
//				case 3:
//					System.out.println(dia +" quarta");
//					break;
//				case 4:
//					System.out.println(dia +" quinta");
//					break;
//				case 5:
//					System.out.println(dia +" sexta");
//					break;
//				case 6:
//					System.out.println(dia +" sabado");
//					break;
//				case 7:
//					System.out.println(dia +" domingo");
//					break;
//				}
//			}
		}
	}
	
}
