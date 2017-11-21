import java.util.Scanner;

/**Introduce una frase por teclado Imprmir 5 veves desplazada cuatro columnas
 */
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in);
	System.out.println("introducir frase");
	String frase = teclado.nextLine();
	for (int i = 0; i < 5; i++) {
		System.out.println(frase);
		frase = "    ".concat(frase);
	}
	teclado.close();
	}
}
