import java.util.Scanner;
public class PruebaArraymetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce la dimension filas");
		int dimension1 = teclado.nextInt();
		System.out.println("introduce la dimension columnas");
		int dimension2 = teclado.nextInt();
		int pedro[][] = new int [4][4];
		int vector2[][] = new int [dimension1][dimension2];
		System.out.println("introduce el valor maximo");
		int maximo = teclado.nextInt();
		System.out.println("introduce el minimo");
		int minimo = teclado.nextInt();
		escribirArray(pedro,maximo,minimo);
		System.out.println();
		escribirArray(vector2,maximo,minimo);
	}
	public static void escribirArray(int vector[][],int maximo,int minimo){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				vector[i][j]=(int)(((Math.random()*(maximo-minimo+1)))+minimo);
				System.out.printf("%+04d  ",vector[i][j]);
			}
			System.out.println();
		}
	}

}
