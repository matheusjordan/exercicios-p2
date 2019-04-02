package exercicio5;

public class Campeonato {
	private String[] times;
	
	public Campeonato(String[] times) {
		this.times = times;
	}
	
	public String[] permuta() {
		int len = getLeng(times.length);
		String[] perm = new String[len];
		
		int cont = 0;
		for(String time1 : times) {
			for(String time2 : times) {
				if(!time1.equals(time2)) {
					if(cont % 3 == 0) {
						perm[cont++] = time1;
						perm[cont++] = time2;	
					}
					else cont++;
				}
			}
		}
		return perm;
	}
	
	private int getLeng(int num) {
		int len = 0;
		for(int i=1; i < num; i++) {
			len += i * num;
		}
		return len;
	}
}
