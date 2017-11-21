/**Leer una frase por teclado y escribir a continuación cuantas mayúsculas, 
 * minúsculas y números contiene.
 */
import java.util.Scanner;
public class St07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase;
		Scanner teclado = new Scanner(System.in);
		String Mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String Numeros = "0123456789";
		String Minusculas = "zxcvbnmsdfghjklñqwrtypaeiou";
		System.out.print("introducir una frase de menos de 80 caracteres: ");
		Frase = teclado.nextLine();
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		int otros = 0;
		int activador=0;
		while (!(Frase.length() < 80)) {
			System.out.print("introducir una frase de menos de 80 caracteres: ");
			Frase = teclado.nextLine();

		}
		for (int i = 0; i < Frase.length(); i++) {
			if( Mayusculas.indexOf(String.valueOf(Frase.charAt(i))) != -1){
				mayusculas++;
				activador=1;
			}
			if( Minusculas.indexOf(String.valueOf(Frase.charAt(i))) != -1){
				minusculas++;
				activador=1;
			}
			if ( Numeros.indexOf(String.valueOf(Frase.charAt(i))) != -1){
				numeros++;
				activador=1;
			}
			if (activador==0){
				otros++;
			}
			activador=0;
		}
		System.out.print("Hay "+mayusculas+" mayusculas");
		System.out.print(", "+minusculas+" minusculas, ");
		System.out.print(numeros+" números y ");
		System.out.println(otros+" otros.");
		teclado.close();
	}
}