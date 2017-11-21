import java.util.Scanner;

public class St22bis {

	/**Escribe un programa que pida por teclado una cadena y una letra, de manera que
	elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
	por pantalla.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una cadena de bicicleta");
		String Frase = teclado.nextLine();
		String Letra="";
		do {
			System.out.println("Introduce una sola letra");
			Letra = teclado.nextLine();
		} while (Letra.length() != 1);
		String Resultado="";
		int j = 0;
		for (int i = 0; i < Frase.length(); i++) {
			if (Frase.charAt(i) != Letra.charAt(0) || j>=3) {
				Resultado = Resultado + Frase.charAt(i);
			}
			else{
				j++;
			}
		}
		System.out.println(Resultado);
		teclado.close();
	}
}