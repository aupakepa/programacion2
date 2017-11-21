import java.util.Scanner;
public class St27 {
	/**7. Escribe un programa que pida por teclado una palabra y muestre por pantalla cuál es
la vocal que más veces contiene la palabra junto al número de veces que la tiene.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		String VOCALES = "aeiou";
		int contvocales [] = new int [5];
		int frasebien = 0;

		do{ // Fuerza introducción de palabra.
			int hayespacio = 0;
			System.out.print("Introduzca una palabra: ");
			frase = teclado.nextLine();
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i)==' '){
					hayespacio = 1;
				}
			}
			if (hayespacio == 0){
				frasebien = 1;
			}
		}
		while(frasebien==0);

		for (int i = 0; i < frase.length(); i++) {
			int opcion = VOCALES.indexOf(String.valueOf(frase.charAt(i))); // Opcion tiene un valor entre 0 y 4
			if (opcion>=0){
				contvocales[opcion]++;
			}
		}
		System.out.println("- - - - - - - - -");
		for (int i = 0; i < contvocales.length; i++) {

			System.out.println("La vocal "+VOCALES.charAt(i)+" se repite "+contvocales[i]+" veces");

		}
	}
}
