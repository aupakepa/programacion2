import java.util.Scanner;

/**6.-Programa que imprima los naturales desde la unidad a un numero que introducimos por teclado
 * 
 * @author jmonf
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero;
		System.out.println("introducir un numero");
		numero = teclado.nextInt();
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
	
		}
		teclado.close();
	}
}
