package exercicio3;

public class ContaEnergia {
	private int consumo;
	
	public ContaEnergia(int consumo) {
		this.consumo = consumo;
	}
	
	public double getValorConsumo() {
		if(consumo > 0 && consumo <= 100) {
			return (consumo * 8) / 100;
		} 
		else if (consumo > 100 && consumo <= 200) {
			return (consumo * 10) / 100;
		} 
		else if (consumo > 200 && consumo <= 500) {
			return (consumo * 12) / 100;
		}
		else if (consumo > 500) {
			return (consumo * 15) / 100;
		}
		return 0;
	}
	
	public double getValorICMS() {
		double valorConsumo = this.getValorConsumo();
		double valorICMS = (valorConsumo * 18) / 100;
		return valorICMS;
	}
	
	public double getValorAPagar() {
		return (this.getValorICMS() + this.getValorConsumo());
	}
}
