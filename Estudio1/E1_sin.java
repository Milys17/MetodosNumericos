package Estudio1;

import java.util.Scanner;

public class E1_sin {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("leer");
		int x = teclado.nextInt();
		double op = 1.0,n = 0.0,suma = 0.0;
		
		while(Math.abs(op) > 0.0001){
			int y = (int) (2*n)+1;
			double p1 = Math.pow(x, y);
			double p2 = factorial(y);
		 
			op = (p1 / p2)* Math.pow(-1, n);
			suma += op;
			n++;
		}
			System.out.println(suma);

	}
	
	static double factorial(int n){
		double m = 1;
		for(int y = n;y > 0;y--){
			m *= y;
		}
		return m;
	}

}
