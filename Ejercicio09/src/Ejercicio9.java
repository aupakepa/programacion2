/**9.-INTRODUCIR UN NUMERO POR TECLADO Y QUE NOS DIGA SI ES POSITIVO O NEGATIVO
 * 
 */
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("introducir un numero por teclado");
		int numero = teclado.nextInt();
		if (numero >= 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");	//no hemos considerado el cero
		}
		teclado.close();
	}

}
