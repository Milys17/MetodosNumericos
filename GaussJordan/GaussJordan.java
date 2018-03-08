package GaussJordan;
import java.util.Scanner;
public class GaussJordan {

	static double[][] A = new double[3][4];
	public static void main(String[] args) {
		introDatos();
		mostrarDatos();
		dividir();
		mostrarDatos();
	}
	
	public static void introDatos(){
		Scanner teclado = new Scanner(System.in);
		for (int x = 0; x < A.length; x++) {
			for (int y = 0; y < A[0].length; y++) {
				if(y+1 == A[0].length){
					System.out.println("Resultado Fila ["+(x+1)+ "]");
				}else{
					System.out.println("Fila ["+(x+1)+"] Columna ["+(y+1)+"]");
				}
					A[x][y] = teclado.nextDouble();					
				}
			}
		}
	
	public static void mostrarDatos(){
		System.out.println("----- Matriz -----");
		for (int i = 0; i < A.length; i++) {
			System.out.print("(");
			for (int j = 0; j < A[0].length; j++) {
				if(j+1 == A[0].length){
					System.out.print("|"+A[i][j]+"|");
				}else{
				System.out.print(" "+A[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void dividir(){
		for (int i = 0; i < A.length; i++) {
			double pivote = 1/A[i][i];
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = A[i][j] * pivote;
			}
			cero(i);
		}
	}
	
	public static void cero(int i){
		mostrarDatos();
		double[] no = new double[2];
		int r=0;
		double dato = A[i][i];
		for(int x = 0; x < A.length;x++){
			if(dato != A[x][i]){
				no[r] = -(1)*(A[x][i]);
				r++;
			}
			
		}
		
		for (int n = 0, z = 0; z < A.length; z++) {
			int c2 = 0;
			if(z != i){
			for (int q = 0; q < A[0].length; q++) {
				A[z][q] = A[i][c2] * no[n] + A[z][q];
				c2++;
			}
			n++;
			}
		}	
	}
}