import java.util.Scanner;

/**3. Programa que lea una frase y una palabra y que nos diga 
 * la posición de dicha palabra en la frase y si no la encuentra devuelva un cero.
 * 
 * @author usuario
 *
 */
public class St03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "";
		String palabra = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca una frase: ");
		frase = teclado.nextLine();
		System.out.println(" introduzca una palabra y la buscara en la frase");
		palabra = teclado.nextLine();
		String buscar = "";
		int contador = 0;
		frase=frase+" ";
		for (int i = 0; i < frase.length(); i++) {
			if (!String.valueOf(frase.charAt(i)).equals(" ")){
				buscar = buscar.concat(String.valueOf(frase.charAt(i)));
			}
			if((String.valueOf(frase.charAt(i))).equals(" ")){
				contador++;
				if(buscar.compareToIgnoreCase(palabra)==0){
					System.out.println("La palabra "+palabra+"  comienza en la posicion "+(i-palabra.length()));
					System.out.println("Y es la palabara numero: "+contador);
				}
			buscar = "";
			}
		}
		teclado.close();
	}

	
}
