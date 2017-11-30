import java.util.Scanner;

/**7.	Generar una matriz de 5x5 numérica entera entre -10 y 10, 
 * a continuación pedir dos números de fila, que se deben filtrar entre 1 y 5 
 *  e intercambiar ambas filas. 
 * Presentar las matrices antes y después del cambio.
 * @author jmonf
 *
 */
public class Ar07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][] = new int [5][5];
		int matriz2 [][] = new int [5][5];
		Scanner teclado = new Scanner(System.in);
		int fila2;
		int fila1;		
		do {		
		System.out.println(" introducir dos numeros del 1 al 5");	
		fila1 = teclado.nextInt()-1;
		fila2 = teclado.nextInt()-1; 
		} while ((fila1 > 4 || fila1 < 0) && (fila2 > 4 || fila2 < 0) || (fila1 > fila2));		
		System.out.println("matriz geerada");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random()*21)-10;
				System.out.printf("%+3d ",matriz[i][j]);
			}
		}
		System.out.println("\n");
		System.out.println("imprimir matriz intercambiada");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[0].length; j++) {
				if (i == fila1) {
				matriz2 [i][j] = matriz[fila2][j];
				}
				else if (i == fila2) {				
					matriz2 [i][j] = matriz[fila1][j];
				}
				else {
					matriz2[i][j] =  matriz[i][j];
				}
				System.out.printf("%+3d ",matriz2[i][j]);
			}
		}
		teclado.close();
	}

}