import java.util.Scanner;

/**3. Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra 
 * en la frase y si no la encuentra devuelva un cero.
 * Lo hacemos con el comando charAt que creo es mas flexible aunque tiene sus pegas por ejemplo 
 * diferencia siempre mayusculas y minusculas al menos nosotros no.
 * @author jmonf*/

public class St03cuatris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase;
		String Palabra;
		Scanner teclado = new Scanner(System.in);
		System.out.print("introducir una frase de menos de 80 caracteres: ");
		Frase = teclado.nextLine();
		while (!(Frase.length() < 80)) {
			System.out.print("introducir una frase de menos de 80 caracteres: ");
			Frase = teclado.nextLine();
		}
		int contador = 0;
		System.out.print("busca la palabra: ");
		Palabra = teclado.nextLine();
		int posicion = 0;
		while (posicion != -1) {
			posicion = Frase.indexOf(Palabra,posicion);
			if (posicion !=-1) {			
				System.out.println("la palabra esta en la posicion "+posicion);
				contador++;
				posicion++;
			}
		}
		System.out.println(" La palabra se repite "+contador+" veces");
		teclado.close();
	}

}
