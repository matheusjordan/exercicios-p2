package exercicio5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		out: while (true) {
			System.out.println();
			System.out.print("Digite um número ente 1 e 9: ");
			int opc = read.nextInt();
			read.nextLine();

			switch (opc) {
			case 1:

				System.out.print("Digite um número: ");
				int num = read.nextInt();

				Inteiro i = new Inteiro(num);

				String divs = "{";
				int cont = 0;
				int divT = i.getQntdDivs() - 1;
				for (int div : i.getDivs()) {
					divs += div;

					if (cont != divT)
						divs += " ";
					cont++;
				}
				divs += "}";

				System.out.println("Os divisores são: " + divs + "\n");
				break;

			case 2:
			case 3:
			case 4:
				double[] vetor = new double[4];
				for (int j = 0; j < 4; j++) {
					System.out.printf("Digite o valor %s: ", j + 1);
					vetor[j] = read.nextDouble();
				}
				VetorReais vt = new VetorReais(vetor);

				if (opc == 2) {
					System.out.println("O maior valor no array : " + vt.getMaior());
				} else if (opc == 3) {
					System.out.println("O maior valor no array : " + vt.getMenor());
				} else if (opc == 4) {
					System.out.println("O maior valor no array : " + vt.getMedia());
				}

				break;

			case 5:
				int[] vetorI = new int[5];
				for (int j = 0; j < 5; j++) {
					System.out.printf("Digite o valor %s: ", j + 1);
					vetorI[j] = read.nextInt();
				}

				Lista ls = new Lista(vetorI);
				System.out.println("A lista possui valores repetidos: " + ls.hasRepetido());
				break;

			case 6:
				System.out.print("Digite os procurados separador por espaço: ");
				String[] procurados = read.nextLine().split(" ");
				Procurados proc = new Procurados(procurados);
				System.out.print("Digite o nome a procurar: ");
				String nome = read.next();
				System.out.printf("O nome foi encontrado? " + proc.hasProcurado(nome) + "\n");
				break;

			case 7:
				System.out.printf("Digite os times separados por espaço: ");
				String[] times = read.nextLine().split(" ");
				Campeonato camp = new Campeonato(times);
				
				for(int j = 0; j < camp.permuta().length; j++) {
					if(j == (camp.permuta().length -1)) break;
					
					String time1 = camp.permuta()[j];
					String time2 = camp.permuta()[j+1];
					
					if(time1 != null && time2 != null) {
						System.out.println(time1 +" X "+ time2);
					}
				}
				break;
			case 8:
				break;
			case 9:
				break;
			default:
				break out;
			}
		}
		read.close();
	}
}
