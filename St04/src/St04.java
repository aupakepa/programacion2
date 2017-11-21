import java.util.Scanner;

/**4. Leer una cadena de hasta 80 caracteres y pasarla en función de una variable
de opción a mayúsculas ó a minúsculas e imprimir la cadena resultante*/
public class St04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introducir una frase de menos de 80 caracteres");
		frase = teclado.nextLine();
		while (frase.length()>80) {
			System.out.println("introducir una frase de menos de 80 caracteres");
			frase = teclado.nextLine();
		}
		
		String dibujo;
		int opcion = 0;
		while (opcion != 3) {
			System.out.println("\n"+"Introduce una opcion");
			System.out.println("1. Para transcribir la frase en mayusculas");
			System.out.println("2. Para transcribir la frase en minusculas");
			System.out.println("3. Fin del Programa");
			opcion = teclado.nextInt();
			if (opcion < 1 && opcion > 3) {
				System.out.println("\n"+"Introduce una opcion");
				System.out.println("1. Para transcribir la frase en mayusculas");
				System.out.println("2. Para transcribir la frase en minusculas");
				System.out.println("3. Fin del Programa"+"\n");
				opcion = teclado.nextInt();
			}
			switch (opcion) {
			case 1: dibujo = frase.toUpperCase();
			System.out.println(dibujo);
			break;
			case 2: dibujo = frase.toLowerCase();
			System.out.println(dibujo);
			break;
			case 3: System.out.println("fin de programa");
			teclado.close();
			break;
			}
		}
		
	}
}
