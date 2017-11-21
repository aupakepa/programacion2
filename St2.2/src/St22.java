import java.util.Scanner;
public class St22 {
	/**Escribe un programa que pida por teclado una cadena y una letra, de manera que
	elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
	por pantalla.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una cadena de bicicelta");
		String Frase = teclado.nextLine();
		String Letra;
		String Resultado="";
		int j = -1;
		int k = -1;
		do {
			System.out.println("Introduzca una letra");
			Letra = teclado.nextLine();
		} while (Letra.length()!=1);
		for (int i = 0; i < 4; i++) {
			j = Frase.indexOf(Letra,j+1);
			Resultado = Resultado + Frase.substring(k+1,j);
			k = j;
		}
		System.out.println(Resultado+Frase.substring(j,Frase.length()));
		teclado.close();
	}
}
