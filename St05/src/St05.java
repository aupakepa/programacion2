import java.util.Scanner;

/**5. Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas de forma 
que una contenga los caracteres en posición par y la otra los caracteres en posición impar.
 */
public class St05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase;
		Scanner teclado = new Scanner(System.in);
		System.out.print("introducir una frase de menos de 80 caracteres: ");
		Frase = teclado.nextLine();
		while (!(Frase.length() < 80)) {
			System.out.print("introducir una frase de menos de 80 caracteres: ");
			Frase = teclado.nextLine();
		}
		String Par ="";
		String Impar="";
		for (int i = 0; i < Frase.length(); i++) {
			if(i%2 == 0){
				Par = Par.concat(String.valueOf(Frase.charAt(i)));
			}
			else {			
				Impar = Impar.concat(String.valueOf(Frase.charAt(i)));
			}
		}
		System.out.println(Par);
		System.out.println(Impar);
		teclado.close();
	}
}
