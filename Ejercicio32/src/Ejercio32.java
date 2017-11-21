import java.util.Scanner;

/**32-programa que por un numero de teclado nos devuelva si es primo su factorial y su tabla de multiplicar
 * 
 * @author usuario
 *
 */
public class Ejercio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		int numero, factorial;
		factorial = 1;
		String primo ="es primo";
		System.out.println("Introducir un numero");
		numero = teclado.nextInt();
		for (int j = 2; j <numero; j++) {
			if (numero%j==0) {
				primo="no es primo";
			}
		}
		System.out.println("El numero: "+numero+" "+primo);
		for (int i = 1; i <=numero; i++) {
			factorial=factorial*i;
		} 
		System.out.println("El factorial del numero es:" +factorial);
		System.out.println("Su tabla de multiplicar hasta 10 es");
		for (int i = 1; i < 10; i++) {
			System.out.println(Math.multiplyExact(i, numero));
		}
		teclado.close();
	}

}
