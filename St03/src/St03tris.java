import java.util.Scanner;

/**3. Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra 
 * en la frase y si no la encuentra devuelva un cero.
 * Lo hacemos con el comando charAt que creo es mas flexible aunque tiene sus pegas por ejemplo 
 * diferencia siempre mayusculas y minusculas al menos tu no.
 * @author jmonf
 *
 */
public class St03tris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("introducir una frase: ");
		String frase;
		frase = teclado.nextLine();
		System.out.print("busca la palabra: ");
		String palabra;
		palabra = teclado.nextLine();
		while (!(frase.length() < 80)) {
			frase = teclado.nextLine();
			System.out.print("busca la palabra: ");
		}
		String buscar = "";
		int contador = 0;
		int palabras = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) !=' ') {
				buscar = buscar.concat(String.valueOf(frase.charAt(i)));
			}
			if (frase.charAt(i) ==' ') {
				palabras++;
				if(palabra.compareToIgnoreCase(buscar) == 0) {
					System.out.println("la palabra: "+palabra+" , empieza en la posicion "+i+" y es la palabra nº: "+palabras );
					contador++;
				}
				buscar = "";
			}
		}
		System.out.println("la palabra se repite : "+contador+" veces");
		teclado.close();
	}
}
