package exercicio4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendario {
	private String[] week = {"D", "S", "T", "Q", "Q", "S", "S" };
	
	public void generateTable(int mes, int ano) {
		String columns = " ";
		String table = "";
		int limite = this.totalDias(mes, ano);
		int loops = 1;
		int inicio = this.diaDaSemana(mes, ano, 1);

		//Loop da coluna de dias
		for (int i = 0; i < 7; i++) {
			columns += week[i];
			
			//Teste que acrescenta 2 espaços na tabela e colunas
			if(i < 6) columns += "  ";

			String days = " ";
			
			//Loop para adicionar os dias do mês
			for (int j = 0; j < 7; j++) {
				String day;
				
				if(loops < inicio) {
					day = " ";
					loops = 1;
					break;
				} else {
					day = "" + loops;
				}
				
				//Condicional para interromper o loop caso chegue a um determinado dia
				if(loops == limite) break;
				
				//Condicional para formatar digitos de 1 casa decimal
				if(day.length() == 1) {
					if(j < 7) {
						days += day + "  ";
					} else {
						days += day;
					}
				} 
				
				// Condicional para formatar digitos com 2 casas decimais
				else {
					if(j < 7) {
						days += day + " ";
					} else {
						days += day;
					}
				}
				loops++;
			}
			
			//Adicionado linha de dias à tabela
			table += days + "\n";
		}

		System.out.println(columns);
		System.out.println(table);
	}
	
	public int totalDias(int mes, int ano) {
		Calendar cl = generateMonthCalendar(mes, ano);
		int dias = getDaysOfMonth(cl);
		return dias;
	}
	
	public int diaDaSemana(int mes, int ano, int dia) {
		Calendar cl = generateMonthCalendar(mes, ano);
		setCalendarDay(cl, dia);
		int diaDaSemana = getDayOfWeek(cl);
		return (diaDaSemana) +1;
	}
	
	private Calendar generateMonthCalendar(int mes, int ano) {
		Calendar cl = new GregorianCalendar();
		cl.set(Calendar.MONTH, mes -1);
		cl.set(Calendar.YEAR, ano);
		return cl;
	}
	
	//Retorna a quantidade de dias que um mes tem
	private int getDaysOfMonth(Calendar cl) {
		int totalDays = cl.getActualMaximum(Calendar.DAY_OF_MONTH);
		return (totalDays) +1;
	}
	
	//Seta o dia do mes do objeto calendario
	private void setCalendarDay(Calendar cl, int day) {
		cl.set(Calendar.DAY_OF_MONTH, day);
	}
		
	//Retorna o dia da semana de um determinado dia, ex: dia 10 retorna 2=Segunda
	private int getDayOfWeek(Calendar cl) {
		return cl.get(Calendar.DAY_OF_WEEK);
	}
}
