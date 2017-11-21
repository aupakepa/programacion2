import java.util.Scanner;

/** 18. Programa que cuente una letra determinada en un frase que introducimos por teclado
 * import java.util.Scanner;
 * @author jmonf
 *
 */
public class Ejercicio18 {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("introducir una frase");
		String frase;
		frase = teclado.nextLine();
		char letra;
		System.out.println("introducir una letra");
		letra = teclado.next().charAt(0);
		int contador, cuenta;
		contador = 0;
		cuenta=0;
			for(contador=0; contador<frase.length(); contador++){
				if(frase.charAt(contador) == letra) {
					cuenta++;
				}
			}
		System.out.println(cuenta);
		teclado.close();
	}
}