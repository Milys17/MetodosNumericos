package A_Euler;
import java.util.Scanner;


public class Serie1 {

	static double Termino = 1.0,Factorial = 1.0,Potencia = 1.0,sumatoria = 0.0;
	static int i = 1;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		while(Math.abs(Termino) > 0.0001){
			Potencia *= x;
			System.out.println("P = "+Potencia);
			
			Factorial *= i;
			System.out.println("F = "+Factorial);
			
			Termino = Potencia / Factorial;
			System.out.println("T = "+Termino);
			System.out.println("---------------");
			
			sumatoria += Termino;
			i += 1;
		}
		System.out.println(sumatoria);
	}

}
