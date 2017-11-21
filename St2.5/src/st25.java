import java.util.Scanner;

/*5. Escribe un programa que pida una palabra por teclado e intercambie la última y la
primera letra.*/
public class st25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una palabra");
		String Palabra = teclado.next();
		System.out.println((Palabra.charAt(Palabra.length()-1))+(Palabra.substring(1, Palabra.length()-1))+(Palabra.charAt(0))); 
		teclado.close();
	}
}
