package D_Newton_Raphson;

import java.util.Scanner;

public class Newton_Raphson {


	static double xn,xr;
	static double x1;
	static int it = 0;
	
	static double f(double x){
		//double y = 5*x*x+12*x*-8;
		//double x1 = x*x*x+3*x*x+4*x+224;
		double x2 = x*x*x-5*x*x-52*x+224;
		return x2;
	}
	
	static double fder(double x){
		//double y = 10*x+12;
		//double x1 = 3*x*x+6*x+4;
		double x2 = 3*x*x-10*x-52;
		return x2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("x");
		xn = teclado.nextDouble();
	
		while(Math.abs(f(x1)) > 0.0001){
			x1 =  xn - (f(xn) / fder(xn));
			xn = x1;
			it++;
			System.out.println("F(x"+it+") = "+f(x1)+"    valor x"+it+": "+x1);
		}
		System.out.println("\n"+x1);
	}

}
