import java.util.Scanner;
public class St10bis {
	public static void main(String[] args) {
		/**10. Escribir un programa que lea una frase (m�ximo 60 caracteres) y diga cu�ntas letras 
		 * distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras 
		 * debemos trabajar solo con may�sculas.
		 * @author el otro
		 *
		 */
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Inotroduzca una frase que tenga como m�ximo 60 car�cteres: ");
		String letras = "ZXCVBNMASDFGHJKL��QWERTYUIOP";
		String frase= teclado.nextLine();
		while (frase.length()>=60){
			System.out.print("Inotroduzca una frase que tenga como m�ximo 60 car�cteres: ");
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
