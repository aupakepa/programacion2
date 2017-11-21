import java.util.Scanner;

/**1. Escribir un programa que pida por teclado una cadena y una letra, de manera que
ponga en mayúsculas cada ocurrencia de la letra que haya en la cadena y lo
muestre por pantalla.*/

public class St21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String Frase = teclado.nextLine();
		String Letra;
		String Nueva = "";
		do { 
			System.out.println("introduce solo una letra");
			Letra = teclado.nextLine();
		} while (Letra.length() != 1);
		for (int i = 0; i < Frase.length(); i++) {
			if (Frase.charAt(i)==Letra.charAt(0)){
				Nueva = Nueva + Letra.toUpperCase();
			}
			else {
				Nueva = Nueva + Frase.charAt(i); 
			}
		}
		System.out.println(Nueva);
		teclado.close();
	}
}
