import java.util.Scanner;

/**3. Escribe un programa que pida por teclado una palabra y diga si es un palíndromo
o no. Una palabra es un palíndromo si se lee igual de izquierda a derecha que de
derecha a izquierda.*/
public class St23bis {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);	
		System.out.println("Introduzca una palabra que crea se palindromo");
		String Frase = teclado.nextLine();
		int palindromo = 1;
		for (int i = 0; i < (Frase.length()-i); i++) {
			if (Frase.charAt(i) != Frase.charAt(Frase.length()-i-1)) {
				palindromo = 0;
			}	
		} 
		if (palindromo == 1) {
			System.out.println("la cadena introducida es palindromo");		
		}
		else{
			System.out.println("la cadena introducida no es un palindromo");		
		}
	teclado.close();
	}
}
