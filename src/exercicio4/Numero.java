package exercicio4;

public class Numero {
	
	
	public static int getLen(long num) {
		String numS = "" + num;
		return numS.length();
	}
	
	public static Long getFatorial(int num) {
		long res = 0;
		
		if(num == 0 || num == 1) {
			return 1L;
		}
		
		
		for(int i = (num -1); i > 0; i--) {
			res += num * i;
			System.out.println(i);
		}
		
		return res;
	}
	
	public static int getMMC(int num1, int num2) {
		int i = 2;
		int mmc = 1;
		
		do {
			boolean eh1 = num1 % i == 0;
			boolean eh2 = num2 % i == 0;
			
			if(eh1) {
				mmc *= i;
				num1 = num1 / i;
			}
			
			if(eh2) {
				mmc *= i;
				num2 = num2 / i;
			}
			
			i++;
		} while(num1 != 1 && num2 != 1);
		
		return mmc;
	}
}
