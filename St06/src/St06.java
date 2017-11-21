import java.util.Scanner;

/**6. Leer una frase por teclado (máximo 80) y
a continuación escribir cuantas vocales, consonantes y caracteres numéricos posee.*/

public class St06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase;
		Scanner teclado = new Scanner(System.in);
		String VOCALES = "aiueoAIUEO";
		String NUMEROS = "0123456789";
		String CONSONANTES = "zxcvbnmsdfghjklñqwrtypZXCVBNMSDFGHJKLÑQWRTYP";
		System.out.print("introducir una frase de menos de 80 caracteres: ");
		Frase = teclado.nextLine();
		int vocales = 0;
		int consonantes = 0;
		int numeros = 0;
		int otros = 0;
		int activador=0;
		while (!(Frase.length() < 80)) {
			System.out.print("introducir una frase de menos de 80 caracteres: ");
			Frase = teclado.nextLine();

		}
		for (int i = 0; i < Frase.length(); i++) {
			if( VOCALES.indexOf(String.valueOf(Frase.charAt(i))) != -1){
				vocales++;
				activador=1;
			}
			if( CONSONANTES.indexOf(String.valueOf(Frase.charAt(i))) != -1){
				consonantes++;
				activador=1;
			}
			if ( NUMEROS.indexOf(String.valueOf(Frase.charAt(i))) != -1){
				numeros++;
				activador=1;
			}
			if (activador==0){
				otros++;
			}
			activador=0;
		}
		System.out.print("Hay "+vocales+" vocales");
		System.out.print(", "+consonantes+" consonantes, ");
		System.out.print(numeros+" números y ");
		System.out.println(otros+" otros.");
		teclado.close();
	}

}
