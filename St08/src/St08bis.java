import java.util.Scanner;

/**8. Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, 
 * una vez filtrada y dado un numero entre 1 y 10 haga un cifrado de la frase 
 * (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3, 
 * transforme la frase de manera que cada carácter se transforme en 3 códigos ASCII mas es decir :
 * Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
 * Desarrollar los programas de codificar y descodificar mediante dos funciones.*/

public class St08bis {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int salir=0;
		int opcion;
		int suma;
		String frasedesc="";
		String frasecod = "";
		while (salir==0){
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("Codificaciones Cutres v1.0");
			System.out.println("1. Codificar frase");
			System.out.println("2. Descodificar frase");
			System.out.println("3. Salir");
			System.out.println("- - - - - - - - - - - - -");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Introduzca la frase a codificar: ");
				teclado.nextLine();
				String frase = teclado.nextLine();
				System.out.print("Introduzca tipo de codificación (1-10): "); 
				suma = teclado.nextInt();
				for (int i = 0; i < frase.length(); i++) {
					char letra = frase.charAt(i);
					frasecod = frasecod + (char)(letra + suma);
				}
				System.out.println(frasecod);
				frasecod="";
				break;
			case 2:
				System.out.print("Introduzca la frase a descodificar: ");
				teclado.nextLine();
				String frase2 = teclado.nextLine();
				System.out.println("Introduzca tipo de codificación (1-10): "); 
				suma = teclado.nextInt();
				for (int i = 0; i < frase2.length(); i++) {
					char letra = frase2.charAt(i);
					frasedesc = frasedesc + (char)(letra - suma);
				}
				System.out.println(frasedesc);
				frasedesc="";
				break;
			case 3:
				System.out.println("Gracias por usar neustro programa");
				salir = 1;
				break;
			}
		}
		teclado.close();
	}
}
