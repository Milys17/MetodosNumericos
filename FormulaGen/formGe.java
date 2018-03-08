package FormulaGen;

public class formGe {

	static int a = 8,b = -3,c = 24;
	//static int a = 2,b = -3, c = 1;
	static double p3a;
	static double p3b;
	static double x1;
	static double x2;
	static String cad1="";
	static boolean i = false;
	public static void main(String[] args) {
		op();

	}
	static public void op(){
		double p1 = Math.pow(b,2) - 4*(a*c);
		System.out.println(p1);
		
		double p2 = 0.0;
		if(Math.sqrt(p1) > 0){
			p2 = Math.sqrt(p1);
		}else{
			i = true;
			double seg = p1*-1;
			p2 = Math.sqrt(seg);
			// la raiz es imaginaria
			
		}
		int a2 = 2*a;
		
		if(i){
			
			double r1 = -1*(b)/a2;
			cad1 += r1+"+"+p2/a2+"\n"+r1+"-"+p2/a2;
		}else{
			p3a = -1*(b) + p2;
			p3b = -1*(b) - p2;
			
			
			double x1 = p3a/(a2);
			double x2 = p3b/(a2);
		}
		
		
		if(i == true){
			System.out.println(cad1);
		}else{
			System.out.println("X1: "+x1+"\nX2: "+x2);
		}
		
		
	}

}
