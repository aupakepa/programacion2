/**3. Escribe un programa que pida por teclado una palabra y diga si es un palíndromo
o no. Una palabra es un palíndromo si se lee igual de izquierda a derecha que de
derecha a izquierda.*/
import java.util.Scanner;
public class St23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String Palabra = teclado.nextLine();
		Palabra = Palabra.trim();
		String Final = "";
		int palindromo = 0;
		if(Palabra.length()%2!=0){ // Para las palabras impares
			int Medio = (Palabra.length()-1)/2+1;
			String Principio = Palabra.trim().substring(0, Medio);
			for (int i = Palabra.length(); i >= Medio; i--) {
				Final = Final + Palabra.charAt(i-1);
			}
			if(Principio.compareToIgnoreCase(Final)==0){
				palindromo = 1; // Cuando es cierto
			}
		}
		else{ // Para palabras pares
			int Medio = (Palabra.length()-1)/2+1;
			String Principio = Palabra.substring(0, Medio);
			for (int i = Palabra.length(); i > Medio; i--) {
				Final = Final + Palabra.charAt(i-1);
			}
			if(Principio.compareToIgnoreCase(Final)==0){
				palindromo = 1; // Cuando es cierto
			}
		}
		if (palindromo==1) {
			System.out.println("Es palindromo");
		}
		else{
			System.out.println("No lo es co");
		}
	}
}
