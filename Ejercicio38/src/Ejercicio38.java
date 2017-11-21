/** Cargar en una matriz las notas de los alumnos de un colegio en funcion de cursos (filas) y del número de alumnos por curso (columnas)
 * 
 * @author usuario
 *
 */
import java.util.Scanner;
public class Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir número de cursos");
		int cursos = teclado.nextInt()+1;
		System.out.println("Introducir número de alumnos");
		int alumnos = teclado.nextInt()+1;
		String matriz[][] = new String [cursos][alumnos]; // La matriz tiene las dimensiones dadas por teclado
		for (int i = 1; i < cursos; i++) {
			for (int j = 1; j < alumnos; j++) {
				matriz[i][j] = String.valueOf((int)(Math.random()*10+1));
			}
		}
		for (int i = 0; i < cursos; i++) {
			for (int j = 0; j < alumnos; j++) {
				if (i==0 || j==0){
					System.out.printf("%5d ", (matriz[i][j]));
				}
				else{
					System.out.printf("%5d ", Integer.parseInt(matriz[i][j]));
				}
			}
			System.out.println();
		}
	}

}
