package exercicio3;

import java.util.GregorianCalendar;

public class Fome {
	private final Long CAFE = new GregorianCalendar(2019, 1, 1, 6, 30).getTimeInMillis();
	private final Long ALMOCO = new GregorianCalendar(2019, 1, 1, 13, 0).getTimeInMillis();
	private final Long JANTA = new GregorianCalendar(2019, 1, 1, 19, 45).getTimeInMillis();
	
	private long horaAtual;
	
	public Fome(int hora, int minuto) {
		this.horaAtual = new GregorianCalendar(2019, 1, 1, hora, minuto).getTimeInMillis();
	}
	
	//0 -> café
	//1 -> almoço
	//2 -> janta
	public int getRefeicao() {
		Long agora = this.horaAtual;
		
		if(agora <= this.JANTA && agora > this.ALMOCO) {
			return 2;
		}
		else if(agora <= this.ALMOCO && agora > this.CAFE) {
			return 1;
		}
		
		return 0;
	}
}
