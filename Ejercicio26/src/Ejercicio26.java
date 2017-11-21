import java.util.Scanner;

/**26.-intoducir una frase por teclado e imprimirla en el centro de la pantalla
 * 
 * @author usuario
 *
 */

public class Ejercicio26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una frase");
		String frase = teclado.nextLine();
		System.out.println("\n");
		for (int i = 0; i <(180-frase.length())/2; i++) {
			frase = " ".concat(frase);
		}
		System.out.println(frase);
		teclado.close();
	}
	
}
