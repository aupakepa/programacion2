import java.util.Scanner;

/**2.- Programa que permita introducir un DNI hasta que sea correcto.1 (2,5 puntos)
“El artículo 11 del Real Decreto 1553/2005, de 23 de diciembre, establece que el 
Documento Nacional de Identidad recogerá el número personal del DNI y 
carácter de verificación correspondiente al número de Identificación Fiscal.
 Para verificar el NIF de españoles residentes mayores de edad, el algoritmo de cálculo
 de la letra de control es el siguiente:
Se divide el número del DNI -que será mayor que 0 y menor que 100.000.000-, 
entre 23 y el resto permite localizar la letra de control que se determina a
 través de la siguiente tabla:*/
public class Ex20162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String calculo ="TRWAGMYFPDXBNJZSQVHLCKE";
		int error = 0;
		String dni="";
		Scanner teclado = new Scanner(System.in);
		int resto = 0;
		do {
			do {

				error=0;
				System.out.println("introduzca dni con el formato correcto 12345678Y");
				dni = teclado.nextLine();
				dni = dni.toUpperCase();
				for (int i = 0; i < 8; i++) {
					if (dni.charAt(i) < '0' || dni.charAt(i)>'9') {
						error = -1;
					}
				} 
			} while (error == -1);

			if (dni.length() != 9) {
				System.out.println("el dni introducido no tiene la longitud correcta");
				error=-1;
			}
			if (dni.charAt(8)<'A' || dni.charAt(8)>'Z') {
				System.out.println("la letra no es una letra");
				error=-1;
			}
			resto = Integer.parseInt(dni.substring(0, 8))%23;
			if (dni.charAt(8) != calculo.charAt(resto)) {
				System.out.println("la letra no es correcta");
				error=-1;
			}

		} while (error == -1);

		System.out.println("No ha introducido el formato correcto");
		teclado.close();
	}
}