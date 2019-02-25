package exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Scanner
		Scanner read = new Scanner(System.in);
	
		//Questão 1
		Inteiro n1 = new Inteiro(1651124);
		System.out.println(n1.getAlgU());
		
		//Questão 2
		Inteiro n2 = new Inteiro(1651124);
		System.out.println(n2.getAlgD());
		
		//Questão 3
		Inteiro n3 =  new Inteiro(1651124);
		System.out.println(n3.getAlgC());
		
		//Questão 4
		Arredondador n4 = new Arredondador(7);
		System.out.println(n4.getArredondado());
		
		//Questão 5
		System.out.println(ConversorChar.getCharMaiusculo('m'));
		
		//Questão 6
		System.out.println(ConversorChar.getCharMinusculo('M'));
		
		//Questão 7
		System.out.println(ConversorGraus.celciusToFahrenheit(40));
		
		//Questão 8
		System.out.println(ConversorGraus.fahrenheitToCelcius(77));
		
		//Questão 9
		Promocao promo = new Promocao(50, 5);
		System.out.printf("%.1f%n", promo.getValorComDesconto());
		
		//Questão 10
		Media media = new Media(7.5f, 8.5f, 8.0f);
		System.out.println(media.getMedia());
		
		//Questão 11
		System.out.println(Multiplo.getMaiorMultiplo(13, 100));
		
		//Questão 12
		
		//Questão 13
		Circulo circulo = new Circulo(50);
		System.out.printf(circulo.getDiametro() +"\n%.2f \n%.2f" , circulo.getArea(), circulo.getCircunferencia());
	}
}
