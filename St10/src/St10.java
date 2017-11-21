import java.util.Scanner;

/**10. Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras 
 * distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras 
 * debemos trabajar solo con mayúsculas.
 * @author jmonf
 *
 */
public class St10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String Frase = "";
		 
		do { System.out.println("introducir una frase de 60 caracteres como maximo");
			Frase = teclado.nextLine();
		} while (Frase.length() >= 60);
		Frase = Frase.toUpperCase();
		String Abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int numero [] = new int [26]; 
		int letra = 0;
			for (int j = 0; j < Abc.length(); j++) {
				for (int i = 0; i < Frase.length(); i++) {
				if((Frase.indexOf(Abc.charAt(j),i)) != -1) { 
				numero[j]++;
				i=1+(Frase.indexOf(Abc.charAt(j),i));
				}
			}
		}
		for (int i = 0; i < numero.length; i++) {
			if(numero[i] !=0) {
				letra++;
				System.out.println("la letra :"+Abc.charAt(i)+" se repite "+numero[i]+" veces");
			}
		}
		System.out.println("En la frase hay "+letra+" letras diferentes");
		teclado.close();
	}	
}

