import java.util.Scanner;

/**8. Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, 
 * una vez filtrada y dado un numero entre 1 y 10 haga un cifrado de la frase 
 * (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3, 
 * transforme la frase de manera que cada carácter se transforme en 3 códigos ASCII mas es decir :
 * Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
 * Desarrollar los programas de codificar y descodificar mediante dos funciones.*/

public class St08tris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		do {//para que no salga del programa sino se le da la orden 3
		String Frase = "";
		String Traduccion = "";
		
		do {System.out.println("Introduzca 1 para codificar ");
		System.out.println("Introduzca 2 para descodificar ");
		System.out.println("Introduzca 3 para salir ");
		menu = teclado.nextInt();
		} while (menu != 1 && menu !=2 && menu !=3);
		
		int codigo = 0;
		switch (menu) {
		
		case 1:System.out.println("introduce una frase");
		teclado.nextLine();
		Frase = teclado.nextLine();
		Frase = Frase.toUpperCase();
		System.out.println("introducir un numero de uno a diez para codificar");
		codigo = teclado.nextInt();
		
		for (int i = 0; i < Frase.length(); i++) {
			if((((int)(Frase.charAt(i)))+codigo) > 90) {
			Traduccion = Traduccion+(char)(((int)Frase.charAt(i))+codigo-26);
			}
			else {
			Traduccion = Traduccion+(char)(((int)Frase.charAt(i))+codigo);
			}
		}	
		
		System.out.println("La Frase codificada es: "+Traduccion);
			
		break;
		
		case 2:System.out.println("introduce una frase para descodificar");
		teclado.nextLine();
		Frase = teclado.nextLine();
		Frase = Frase.toUpperCase();
		System.out.println("introducir un numero de uno a diez para descodificar");
		codigo = teclado.nextInt();
		for (int i = 0; i < Frase.length(); i++) {
			if(((((int)(Frase.charAt(i)))-codigo) < 65) && (((int)(Frase.charAt(i))) != (32+codigo))) {
			Traduccion = Traduccion+(char)(((int)Frase.charAt(i))-codigo+26);
			}
			else {
			Traduccion = Traduccion+(char)(((int)Frase.charAt(i))-codigo);
			}
		}
		System.out.println("La Frase descodificada es: "+Traduccion);

		
		break;		
		case 3:teclado.close();
		System.out.println("fin del programa");

		break;
			}
		} while (menu != 3);
	}
}
