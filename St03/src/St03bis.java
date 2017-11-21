import java.util.Scanner;

/**3. Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra 
 * en la frase y si no la encuentra devuelva un cero.
 * Lo hacemos con el comando charAt que creo es mas flexible aunque tiene sus pegas por ejemplo 
 * diferencia siempre mayusculas y minusculas al menos nosotros no.
 * @author jmonf
 *
 */
public class St03bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase = "";
		String palabra = "";
		int inicio = 0;
		int contador = 0;
		int palabras = 1;
		System.out.println("Introducir una frase de menos de 80 caracteres");
		frase = teclado.nextLine();
		while (!(frase.length()<80)) {
			System.out.println("Introducir una frase de menos de 80 caracteres");
			frase = teclado.nextLine();
		}
		System.out.println("buscar la palabra ...");
		palabra = teclado.next();
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i)==' ') {
				palabras++;
			}
			if (frase.charAt(i) == palabra.charAt(0)) {
				for (int j = 0; j < palabra.length(); j++) {
					if(frase.charAt(i+j) == palabra.charAt(j)) {
						inicio = i;
					}
				}
				if (inicio!=0) {
					contador++;
					System.out.println("la palabra "+palabra+" empieza en la posicion  "+inicio+" y es la palabra nº"+palabras);
				}
			}
		}
		System.out.println("la palabra se ha repetido  "+contador+"  veces");
		teclado.close();
	}
}
