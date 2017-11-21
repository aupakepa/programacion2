/** imprmir los numeros primos hasta un numero que introducimos por teclado
 * 
 */
import java.util.Scanner;

public class Ejercicio24bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int contador, numero, primo, si;
		System.out.println("introducir un numero para saber si es primo");
		numero = teclado.nextInt();
		contador=2;
		si = 0;
		for (primo = 1; primo < numero; primo++) {
			for(contador=2;contador<primo;contador++){
				if (primo%contador==0) {
					si=1;
				}
			}
			if (si==0) {
				System.out.println(primo);
			}
			contador=2;
			si=0;
		}
		teclado.close();
	}

}
