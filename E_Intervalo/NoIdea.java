package E_Intervalo;

import javax.swing.JOptionPane;

public class NoIdea {

	static double f(double x){
		return x*x*x-5*x*x-52*x+224; 
	}
	
	public static void main(String[] args) {
		double x1,x2,intervalo,a,b;
		a = Double.parseDouble(JOptionPane.showInputDialog(null,"Limite a = "));
		b = Double.parseDouble(JOptionPane.showInputDialog(null,"Limite b = "));
		intervalo = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor del intervalo = "));
		
		for(x1 = a, x2 = a+intervalo; x2 < b ; x1 += intervalo,x2+=intervalo){
			if(f(x1) * f(x2) < 0.0001){
				JOptionPane.showMessageDialog(null,"Raiz = "+x1+" y "+x2);
			}
		}
	}

}
