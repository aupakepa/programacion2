/**2. Dada una frase de no m�s de 80 caracteres hacer un programa que busque cu�ntas 
may�sculas y min�sculas tiene y lo imprima
 * 
 * @author usuario
 *
 */
import java.util.Scanner;
public class St02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase="";
		int may = 0;
		int min = 0;
		System.out.print("Introduzca una frase que no supere 80 caracteres: ");
		frase = teclado.nextLine();
		while (frase.length() >80){
			System.out.print("Introduzca una frase que no supere 80 caracteres: ");
			frase = teclado.nextLine();
			for (int i = 0;i < frase.length();i++){
				if (frase.charAt(i)>='a' && frase.charAt(i)<='z'){
					min++;
				}
				if (frase.charAt(i)>='A' && frase.charAt(i)<='Z'){
					may++;
				}
			}
			System.out.println("N� de May�sculas: "+may);
			System.out.println("N� de Min�sculas: "+min);
			teclado.close();
		}
	}
}
