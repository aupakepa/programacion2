import java.util.Scanner;

/**34- hacer un programa que lea las calificaciones de un alumno en 10 asignaturas
 * almacen en un vector y calcule su media
 * 
 * @author usuario
 *
 */
public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double notas [] = new double [10]; 
		double suma = 0;
		System.out.println("introduzca diez notas");
		for (int i = 0; i < 10; i++) {
			notas [i] = teclado.nextDouble();
			while (notas [i] > 10 || notas [i]< 0)  {
			System.out.println("La nota debe estar entre 0 y 10");
			notas [i] = teclado.nextDouble();
			}			
		}
		for (int i = 0; i < 10; i++) {
			suma = suma + notas[i];
		}
		System.out.println("la media de las diez notas es: ");
		System.out.println((suma/10));
		teclado.close();
	}

}
