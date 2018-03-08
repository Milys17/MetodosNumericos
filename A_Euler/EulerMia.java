package A_Euler;

import java.util.Scanner;

public class EulerMia {
	
	static int n = 0;
	static double op = 1.0,sumatoria = 0.0;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("abrete alv");
		int x = teclado.nextInt();
		//System.out.println(factorial(x));
		
		while(Math.abs(op) > 0.0001){
			double p1 = Math.pow(x, n);
			double p2 = factorial(n);
			op = p1 / p2;
			System.out.println(op);
			sumatoria += op;
			n++;
			//if(n == 3){break;}
		}
		
		System.out.println(sumatoria);
	}
	
	static double factorial(int n){
		double m = 1;
		for(int y = n;y > 0;y--){
			m *= y;
		}
		return m;
	}

}
