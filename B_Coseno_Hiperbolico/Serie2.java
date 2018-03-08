package B_Coseno_Hiperbolico;

import java.util.Scanner;

public class Serie2 {

	static double Termino = 1.0,Factorial = 1.0,Potencia = 1.0,sumatoria = 0.0;
	static int i = 1;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		while(Math.abs(Termino) > 0.0001){
			Potencia *= (x*x);
			Factorial *= (i*(i+1));
			Termino = Potencia / Factorial;
			sumatoria += Termino;
			i += 1;
		}
		System.out.println(sumatoria);
	}
}
