import java.util.Scanner;

/**1. Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir si la frase 
 * es: “ciervo”, 
 * el programa debe imprimir
c
ci
cie
cier
cierv
ciervo*/

public class St01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String frase = "";
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca una frase que no supere 80 caracteres: ");
		frase = teclado.nextLine();
		while (frase.length() >80){
			System.out.print("Introduzca una frase que no supere 80 caracteres: ");
			frase = teclado.nextLine();
		}
		for (int i = 0; i < frase.length(); i++) {
			Thread.sleep(100); //hemos decidido imprimirlo como
			System.out.print(frase.charAt(i));
		}
		teclado.close();
	}

}
