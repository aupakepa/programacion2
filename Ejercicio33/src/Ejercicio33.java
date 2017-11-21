import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		/** Crear un array unidimensional con 20 elementos con nombres de personas y visualizar los elementos
		 * 
		 */
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombres[] = new String[20];
		for (int i = 0; i < 20; i++) {
			nombres[i] = teclado.nextLine();
		}
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if (nombres[j].compareTo(nombres[j+1])>0){
					String apoyo = nombres[j];
					nombres[j]=nombres[j+1];
					nombres[j+1]=apoyo;
				}
			}
		}
		for (int i = 0; i < 20; i++) {
			System.out.println(nombres[i]);
		}
		teclado.close();
	}

}
