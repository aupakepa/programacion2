import java.util.Scanner;

/**27. Programa que realice la tabla de multiplicar de un numero entre 1 y diez
 * 
 * @author jmonf
 *
 */
public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
	while (numero<=0||numero>10) {
		System.out.println("introducir un numero del 1 al 10");
		numero = teclado.nextInt();
	}
	for (int i = 0; i <= 10; i++) {
		System.out.println(numero*i);
	}
	teclado.close();
	}

}
