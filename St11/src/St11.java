import java.util.Scanner;

/**11. Hacer un programa para que pida una palabra de no más de 20 caracteres
 *  y efectúe todas las rotaciones posibles de dicha palabra de forma que el último carácter pase 
 *  al primero y los demás corran un espacio, es decir si la palabra fuera “HOLA” el resultado debe ser :
HOLA
AHOL
LAHO
OLAH
Observar que una palabra de n caracteres tiene n rotaciones*/
public class St11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String Combinacion = "";
		String Inicio ="";
		String Palabra;
		do {
			System.out.println("introduzca una palabra de menos de 20 caracteres");
			Palabra = teclado.next();//probando esta que debe cortar al introducir espacio
			Palabra = Palabra.toUpperCase();
		} while (Palabra.length() > 20);
		for (int i = 0; i < Palabra.length(); i++) {//este es desde donde tiene que empezar
			for (int j = 0; j < Palabra.length(); j++) {//este el numero de letras que tiene que imprimir
				if(j+i < Palabra.length()) {
					Combinacion = Combinacion + Palabra.charAt(j);
				}
				if(j+i>= Palabra.length()) { 
					Inicio = Inicio+(Palabra.charAt(j));
				}	
			}
			System.out.print(Inicio+Combinacion);
			System.out.println();
			Combinacion ="";
			Inicio ="";
		}
		teclado.close();
	}
}