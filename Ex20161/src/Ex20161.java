import java.util.Scanner;

public class Ex20161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		do {
			System.out.println("introduzca un numero entero");
			numero = teclado.nextInt();
		} while (numero < 0);
		String impresion [] = new String[numero];
		for (int i = 0; i < numero; i++) {
			impresion[i] = "";
		}
		for (int j = 0; j < numero; j++) {	//un for por cada caracter de la impresion
			for (int i = 0; i < numero; i++) {//un for por cada numero
				if(j < numero-i-1) {
					impresion[i] = ' '+impresion[i];	
				}
				else {
					impresion[i] = impresion[i] + '*';	
				}
				System.out.println(impresion[i]);
			}
		}
		teclado.close();
	}
}