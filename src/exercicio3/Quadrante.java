package exercicio3;

public class Quadrante {
	
	public int getQuadrante(int angulo) {
		if(angulo >= 0 && angulo <= 360) {
			if(angulo >= 0 && angulo < 90) {
				return 1;
			}
			else if(angulo >= 90 && angulo < 180) {
				return 2;
			}
			else if(angulo >= 180 && angulo < 270) {
				return 3;
			}
			else if(angulo >= 270 && angulo <= 360) {
				return 4;
			}
		}
		return 0;
	}
}
