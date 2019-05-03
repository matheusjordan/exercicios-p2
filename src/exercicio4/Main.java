package exercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.printf("Escolha uma op��o (1 a 10): ");
		int opc = read.nextInt();
		
		switch(opc) {
		case 1:
			Numero numero = new Numero(-1);
			int digitos = numero.getDigitos();
			System.out.println(digitos);
			break;
			
		case 2:
			numero = new Numero(1);
			int fatorial = numero.getFatorial();
			System.out.println(fatorial);
			break;
			
		case 3:

		case 4:
		
		case 5:
			PotenciaNumerica potObj = new PotenciaNumerica(6, 16);
			long potencia = potObj.getPotencia();
			System.out.println(potencia);
			break;
			
		case 6:
			
			
		case 7:
			Somatorio somatorio = new Somatorio(50, 58);
			int soma = somatorio.getSomatorio();
			System.out.println(soma);
			break;
			
		case 8:
			
		case 9:
			Sintetizador st = new Sintetizador();
			String texto = st.getText(11);
			System.out.println(texto);
			break;
			
		case 10:
			Calendario cl = new Calendario();
			cl.generateTable(4, 2019);
			break;
			
		}
		read.close();
	}
	
}
