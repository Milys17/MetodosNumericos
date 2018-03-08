package C_Raiz_Funcion;

import java.util.Scanner;

public class raiz {
	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Intervalo 1");
		double i1 = teclado.nextDouble();
		System.out.println("Intervalo 2");
		double i2 = teclado.nextDouble();
		op(i1,i2);
	}
	
	static double fdex(double x){
		double y = 8*x*x+2*x-7; // 8X^2 +2X -7
		//double y = (5*x*x*x)+(8*x*x)+(9*x)-7;
		return y;
	}
	
	static void op(double intervalo1,double intervalo2){
		double x1 = intervalo1,x2 = intervalo2,x3 = (x1+x2/2.0);
		
		while(Math.abs(fdex(x3)) > 0.001){
			System.out.println(x1+"   "+x2);
		if((fdex(x3)*fdex(x1)) > 0){
			x1 = x3;
		}
		else{
			x2 = x3;
			x3 = (x1+x2/2.0);
			}
		break;
		}
		
		System.out.println(x3);
		}
	
	
		
	}
	
