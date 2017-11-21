import java.util.Scanner;
public class St10bis {
	public static void main(String[] args) {
		/**10. Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras 
		 * distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras 
		 * debemos trabajar solo con mayúsculas.
		 * @author el otro
		 *
		 */
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Inotroduzca una frase que tenga como máximo 60 carácteres: ");
		String letras = "ZXCVBNMASDFGHJKLÑÇQWERTYUIOP";
		String frase= teclado.nextLine();
		while (frase.length()>=60){
			System.out.print("Inotroduzca una frase que tenga como máximo 60 carácteres: ");
			frase = teclado.nextLine();
		}
		frase=frase.toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			int cont = 0;
			int posicion = 0;
			int salida = 0;
			while (salida == 0){
				if(String.valueOf(frase.charAt(i)).indexOf(letras,posicion+1)!=-1){
					cont++;
				}
				if(String.valueOf(frase.charAt(i)).indexOf(letras)==-1){
					salida = 1;
				}
			}
			System.out.println(frase.charAt(i)+": "+cont+" veces");
		}
	}
}
