import java.util.Scanner;

/**8.	Tenemos 10 asignaturas y 10 alumnos numerados del 1 al 10
 *  tanto las asignaturas como los alumnos. 
 *  Introducimos las 10 notas de los 10 alumnos (generación aleatoria de 1 a 10) 
 *  y pidiendo por teclado bien número de asignatura ó bien número de alumno, 
 *  calcular media del  alumno tecleado ó media de la asignatura tecleada.
 * @author jmonf
 *
 */
public class Ar08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][] = new int [10][10];
		int suma = 0;
		int alumno = -1;
		int asignatura =-1;
		int menu=-1;
		Scanner teclado = new Scanner (System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz [i][j] = (int)(Math.random()*10)+1;		
			}

		}
		do {				
			System.out.println("\n");
			System.out.println("1.Imprimir matriz de notas");
			System.out.println("2.Calcular media de alumno");
			System.out.println("3.Calcular media de alumno");
			System.out.println("4.Salir");
			menu = teclado.nextInt();			
			
			switch (menu) {
			case 1:	for (int i = 0; i < matriz.length; i++) {
				System.out.println();

				for (int j = 0; j < matriz.length; j++) {
					System.out.printf("%02d ",matriz [i][j]);		
				}
			}
				break;
			case 2: 
				do {	
				System.out.println("introduzca el codigo del alumno para conocer su media");
				alumno = teclado.nextInt();
				} while (alumno > 10|| alumno < 1);	
				suma = 0;
				for (int j = 0; j < matriz.length; j++) {
					suma = suma + matriz[alumno-1][j];
				}
				System.out.println("la media del alumno "+alumno+" es "+ ((double)suma/10));
				break;
			case 3:		
				do {	
				System.out.println("introduzca el codigo de la asignatura para conocer su media");
				asignatura = teclado.nextInt();
				} while (asignatura > 10|| asignatura < 1);	
				suma = 0;
				for (int j = 0; j < matriz.length; j++) {
					suma = suma + matriz[j][asignatura-1];
				}
				System.out.println("la media de la asignatura "+asignatura+" es "+ ((double)suma/10));
				break;
			case 4:teclado.close();

				break;
			}
		} while (menu != 4);
	}
}