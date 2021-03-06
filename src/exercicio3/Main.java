package exercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Scanner
		Scanner read = new Scanner(System.in);

		int opc;

		do {
			System.out.println();
			System.out.print("Escolha uma op��o (1-18): ");
			opc = read.nextInt();
			System.out.println();

			switch (opc) {
			case 1:
				// Quest�o 1
				System.out.print("Digite um n�mero: ");
				int numero = read.nextInt();
				System.out.println("� par? " + Inteiro.isPar(numero));
				System.out.println("� impar? " + Inteiro.isImpar(numero));
				break;

			case 2:
				// Quest�o 2
				System.out.print("Digite um n�mero: ");
				numero = read.nextInt();
				System.out.println("O valor absoluto de " + numero + " �: " + Inteiro.valorAbs(numero));
				break;

			case 3:
			case 4:
				// Quest�o 3 e 4
				System.out.print("Digite o 1� numero: ");
				double num1 = read.nextDouble();
				System.out.print("Digite o 2� numero: ");
				double num2 = read.nextDouble();

				// Novo objeto
				Comparador2 comparador2 = new Comparador2(num1, num2);

				// Condicional para verificar a resposta que ser� dada
				if (opc == 3) {
					System.out.println("O maior valor �: " + comparador2.getMaior());
				} else if (opc == 4) {
					System.out.println("O menor valor �: " + comparador2.getMenor());
				}
				break;

			case 5:
			case 6:
				// Quest�o 5 e 6
				System.out.print("Digite o 1� numero: ");
				num1 = read.nextDouble();
				System.out.print("Digite o 2� numero: ");
				num2 = read.nextDouble();
				System.out.print("Digite o 3� numero: ");
				double num3 = read.nextDouble();

				// Novo objeto
				Comparador3 comparador3 = new Comparador3(num1, num2, num3);

				// Condicional para verificar a resposta que ser� dada
				if (opc == 5) {
					System.out.println("O maior valor �: " + comparador3.getMaior());
				} else if (opc == 6) {
					System.out.println("O menor valor �: " + comparador3.getMenor());
				}
				break;

			case 7:
				// Quest�o 7
				System.out.print("Digite o valor de 'a': ");
				num1 = read.nextDouble();
				System.out.print("Digite o valor de 'b': ");
				num2 = read.nextDouble();
				System.out.print("Digite o valor de 'c': ");
				num3 = read.nextDouble();

				// Novo objeto
				EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(num1, num2, num3);
				double delta = equacao.calculeDelta();
				System.out.println("Delta = " + delta);
				if (equacao.isEquacaoValida()) {
					System.out.println("X1 = " + equacao.calculeX1(delta));
					System.out.println("X2 = " + equacao.calculeX2(delta));
				} else
					System.out.println("Equa��o n�o possui raizes reais!");
				break;
			case 8:
				// Quest�o 8
				System.out.print("Digite o n�mero do m�s: ");
				int mesNum = read.nextInt();

				// Novo objeto
				Mes mes = new Mes();

				if (mesNum > 0 && mesNum <= 12) {
					System.out.println("Nome do m�s: " + mes.getMesByNum(mesNum));
				} else {
					System.out.println("M�s inv�lido!");
				}
				break;

			case 9:
				// Quest�o 9
				System.out.print("Digite o nome do m�s: ");
				String mesNome = read.next().toLowerCase();

				// Novo objeto
				Mes mes2 = new Mes();

				mesNum = mes2.getMesByNome(mesNome);

				if (mesNum != 0) {
					System.out.println("Numero do m�s: " + mesNum);
				} else {
					System.out.println("M�s inv�lido!");
				}
				break;

			case 10:
				// Quets�o 10
				System.out.print("Digite o n�mero do m�s: ");
				mesNum = read.nextInt();
				System.out.print("Digite o ano: ");
				int anoNum = read.nextInt();

				// Novo objeto
				Mes mes3 = new Mes();

				int diasMes = mes3.getDiasByMesAndAno(mesNum, anoNum);
				if (mesNum != 0 && anoNum != 0) {
					System.out.println("Dias do m�s: " + diasMes);
				} else {
					System.out.println("M�s ou ano invalido(s)!");
				}
				break;

			case 11:
				// Quets�o 11
				System.out.print("Digite um �ngulo: ");
				int angulo = read.nextInt();

				// Novo objeto
				Quadrante quadrante = new Quadrante();

				if (angulo > 0 && angulo <= 360) {
					System.out.println("Quadrante: " + quadrante.getQuadrante(angulo));
				} else {
					System.out.println("Angulo invalido");
				}
				break;

			case 12:
				// Quets�o 12
				System.out.print("Digite o ano: ");
				anoNum = read.nextInt();
				if (anoNum != 0) {
					System.out.println("Bissexto: " + Mes.isBissexto(anoNum));
				} else {
					System.out.println("Ano inv�lido!");
				}
				break;

			case 13:
			case 14:
				// Quets�o 13 e 14
				System.out.print("Digite o lado 1: ");
				int l1 = read.nextInt();
				System.out.print("Digite o lado 2: ");
				int l2 = read.nextInt();
				System.out.print("Digite o lado 3: ");
				int l3 = read.nextInt();

				// Novo objeto
				Triangulo triangulo = new Triangulo(l1, l2, l3);
				
				//Validador de op��o de acordo com o retorno
				switch(opc) {
				case 13:
					if (triangulo.isTriangulo()) {
						System.out.println("SIM");
					} else {
						System.out.println("NAO");
					}
					break;
				
				case 14:
					int retorno = triangulo.getTipoTriangulo();
					
					switch(retorno) {
					case 0:
						System.out.println("Nenhum");
						break;
						
					case 1:
						System.out.println("Equilatero");
						break;
					
					case 2:
						System.out.println("Isosceles");
						break;
						
					case 3:
						System.out.println("Escaleno");
					}
					break;
				}
				break;
				
			case 15:
				// Quest�o 15
				System.out.print("Digite o dia: ");
				int dia = read.nextInt();
				System.out.print("Digite o mes: ");
				int meses = read.nextInt();
				System.out.print("Digite o ano: ");
				int ano = read.nextInt();
				
				// Novo Objeto
				Aniversario niver = new Aniversario(dia, meses, ano);
				
				System.out.println("A idade da pessoa �: " + niver.getIdade());
				break;
			case 16:
				// Quest�o 16
				System.out.print("Digite a hora: ");
				int hora = read.nextInt();
				System.out.print("Digite a nota 2: ");
				int minuto = read.nextInt();
				
				// Novo Objeto
				Fome fome = new Fome(hora, minuto);
				
				int refeicao = fome.getRefeicao();
				String txt = "A proxima refei��o ser�: ";
				
				//Verifica��o da variavel refeicao
				switch(refeicao) {
				case 0:
					System.out.println(txt + "Caf� da manh�");
					break;
				
				case 1:
					System.out.println(txt + "Almo�o");
					break;
					
				case 2:
					System.out.println(txt + "Jantar");
					break;
				}
				break;
				
			case 17:
				// Quest�o 17
				System.out.print("Digite a nota 1: ");
				num1 = read.nextDouble();
				System.out.print("Digite a nota 2: ");
				num2 = read.nextDouble();
				System.out.print("Digite a nota 3: ");
				num3 = read.nextDouble();
				System.out.print("Digite a quantidade de aulas ministradas: ");
				int aulas = read.nextInt();
				System.out.print("Digite a quantidade de faltas do aluno: ");
				int faltas = read.nextInt();
				
				// Novo Objeto
				Avaliacao avaliacao = new Avaliacao(num1, num2, num3, aulas, faltas);
				
				String status = avaliacao.isAprovado() ? "APROVADO" : "REPROVADO";
				System.out.printf("M�dia do aluno: %.1f%nO aluno foi: %s%n", avaliacao.getMedia(), status);
				break;
			case 18:
				// Quets�o 18
				System.out.print("Digite o cosumo: ");
				int consumo = read.nextInt();
				
				// Novo objeto
				ContaEnergia conta = new ContaEnergia(consumo);
				
				System.out.printf("Valor de Consumo: %.2f%nValor de ICMS: %.2f%nValor a pagar: %.2f", conta.getValorConsumo(), conta.getValorICMS(), conta.getValorAPagar());
				break;
			}

		} while (opc != 0);
		read.close();
	}
}
