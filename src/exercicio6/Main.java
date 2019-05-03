package exercicio6;

import org.input4j.Input;

public class Main {
	public static void main(String[] args) {
		boolean loop = true;
		
		while(loop) {
			int opc = Input.Int("Escolha uma opção: ");
			System.out.println();
			
			switch(opc) {
			case 1:
				int cX = Input.Int("Digite a coordenada X: ");
				int cY = Input.Int("Digite a coordenada Y: ");
				String r = Input.Str("Digite o rótulo: ");
				
				PontoCartesiano pc = new PontoCartesiano(cX, cY, r);
				System.out.println(pc);
				System.out.println("Clone: \n" + pc.clone(pc));
				System.out.println();
				break;
				
			case 2:
				String artista, album, nome, numero;
				artista = Input.Str("Digite o nome do artista: ");
				album = Input.Str("Digite o Album da musica: ");
				nome = Input.Str("Digite o nome da musica: ");
				numero = Input.Str("Digite o numero da musica: ");
				DescritorMusical dm = new DescritorMusical(artista, album, nome, numero);
				System.out.println(dm);
				System.out.println("Clone: \n" + dm.clone(dm));
				
				System.out.println();
				break;
				
			case 3:
				String email, telefone;
				nome = Input.Str("Digite o nome do contato: ");
				Contato c = new Contato();
				
				if(!nome.isEmpty()) {
					email = Input.Str("Digite o email do contato: ");
					
					if(!email.isEmpty()) {
						telefone = Input.Str("Digite o telefone do contato: ");
						
						if(!telefone.isEmpty()) {
							c = new Contato(nome, email, telefone);
						} else {
							c = new Contato(nome, email);
						}
						
					} else {
						c = new Contato(nome);
					}
				}
				
				System.out.println(c);
				System.out.println("Clone: \n" + c.clone(c));
				System.out.println();
				
				break;
				
			case 4:
				float sl = Input.Float("Digite o valor do salário: ");
				ContribuicaoPrevidenciaria cp = new ContribuicaoPrevidenciaria(sl);
				System.out.println("Contribuição: " + cp.calcContribuicao());
				System.out.println("Salario Liquido: " + cp.getSalarioLiquido());
				System.out.println();
				
				break;
				
			case 5:
				int fichas = Input.Int("Digite a quantidade de fichas: ");
				Fichas.genFichas(fichas);
				
				fichas = Input.Int("Digite a quantidade de fichas: ");
				Fichas.genFichas(fichas);
				break;
			case 6:
				int qtd = Input.Int("Quantos atletas deseja cadastar? ");
				Atleta[] atletas = new Atleta[qtd];
				
				for(int i=0; i<qtd; i++) {
					nome = Input.Str(String.format("Digite o nome do atleta %s: ", i+1));
					double peso = Input.Double("Digite o peso do atleta: ");
					double altura = Input.Double("Digite a altura do atleta: ");
					
					Atleta at = new Atleta(nome, peso, altura);
					atletas[i] = at;
				}
				
				for(Atleta at : atletas) {
					System.out.println(at);
				}
				
				System.out.println("Maior peso: " + Atleta.getMAIOR_PESO());
				System.out.println("Maior altura: " + Atleta.getMAIOR_ALTURA());
				
				break;
				
			case 7:
				int n1 = Input.Int("Digite um numero: ");
				int n2 = Input.Int("Digite outro numero: ");
				
				System.out.println(Calculadora.some(n1, n2));
				System.out.println(Calculadora.subtraia(n1, n2));
				System.out.println(Calculadora.multiplique(n1, n2));
				System.out.println(Calculadora.divida(n1, n2));
				break;
				
			case 8:
				
				break;
			case 9:
				break;
			case 10:
				double metros = Input.Int("Digite a quantidade de metros: ");
				double jardas = ConversorDeComprimento.metrosToJardas(metros);
				double polegadas = ConversorDeComprimento.metrosToPolegadas(metros);
				System.out.println();
				System.out.println("Jardas: " + jardas);
				System.out.println("Polegadas: " + polegadas);
				
				break;
				
			default:
				loop = false;
			}
		}
		
	}
}
