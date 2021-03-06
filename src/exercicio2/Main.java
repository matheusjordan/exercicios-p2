package exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Scanner
		Scanner read = new Scanner(System.in);
	
		//Quest�o 1
		Inteiro n1 = new Inteiro(1651124);
		System.out.println(n1.getAlgU());
		
		//Quest�o 2
		Inteiro n2 = new Inteiro(1651124);
		System.out.println(n2.getAlgD());
		
		//Quest�o 3
		Inteiro n3 =  new Inteiro(1651124);
		System.out.println(n3.getAlgC());
		
		//Quest�o 4
		Arredondador n4 = new Arredondador(7);
		System.out.println(n4.getArredondado());
		
		//Quest�o 5
		System.out.println(ConversorChar.getCharMaiusculo('m'));
		
		//Quest�o 6
		System.out.println(ConversorChar.getCharMinusculo('M'));
		
		//Quest�o 7
		System.out.println(ConversorGraus.celciusToFahrenheit(40));
		
		//Quest�o 8
		System.out.println(ConversorGraus.fahrenheitToCelcius(77));
		
		//Quest�o 9
		Promocao promo = new Promocao(50, 5);
		System.out.printf("%.1f%n", promo.getValorComDesconto());
		
		//Quest�o 10
		Media media = new Media(7.5f, 8.5f, 8.0f);
		System.out.println(media.getMedia());
		
		//Quest�o 11
		System.out.println(Multiplo.getMaiorMultiplo(13, 100));
		
		//Quest�o 12
		Janela janela = new Janela(1, 6, 4, 8);
		System.out.println(janela.calculeArea());
		
		//Quest�o 13
		Circulo circulo = new Circulo(50);
		System.out.printf(circulo.getDiametro() +" %.2f %.2f" , circulo.getArea(), circulo.getCircunferencia());
		read.close();
	}
}
