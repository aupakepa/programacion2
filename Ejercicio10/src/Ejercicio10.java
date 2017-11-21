/** INTRODUCIR UN NUMERO POR TECLADO QUE NOS DIGA SI ES PAR O IMPAR
 */
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("introducir un numero para saber si es o no par");
		int numero = teclado.nextInt();
		if (numero%2==0){
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		teclado.close();
	}

}
