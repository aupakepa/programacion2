import java.util.Scanner;

/**4.- Programa que permita la introducción de un correo electrónico hasta que sea válido. 
 (2,5 puntos)Las RFC 5322 y 5321 definen el formato de una dirección de correo como 
 parte_local@dominio 
donde la parte_local puede tener hasta un máximo de 64 caracteres y el dominio hasta 255 
pero por restricciones, la longitud total (de la dirección) no puede ser mayor de 254 caracteres.
Para la parte local, aunque puede utilizar cualquier carácter ASCII, las RFC marcan 
una serie de restricciones. Para simplificar, vamos a asumir que sólo pueden utilizar:
- letras de la A a la Z, en mayúsuculas y minúsculas, sin incluir la Ñ o vocales con tilde
- números del 0 al 9
- el punto (.) si no es el primer o el último carácter y siempre y cuando no se utilice dos veces
 consecutivas (..)
- el guión (-) y el carácter de subrayado (_)
La parte del nombre de dominio de una dirección de correo debe seguir los requisitos de un nombre 
de máquina DNS: una lista de etiquetas separadas por puntos, si aparece más de una, 
cada una de las cuales tiene una longitud máxima de 63 caracteres y que sigue la regla conocida
 como LDH (letters -letras-, digits -números-, hyphen -guión-).*/
public class Ex20164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int error = 0;
		String local = "";
		String dominio = "";
		String correo = "";
		Scanner teclado = new Scanner(System.in);
		int posicion = 0;
		String permitidos = ".-0123456789QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm_";
		String domperm = ".-0123456789QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm";
		do {
			System.out.println("introducir un correo electronico");
			correo = teclado.nextLine();
			if (correo.indexOf("@")==-1) {//si no hay @
				error= -1;
			}
			else {
			posicion = correo.indexOf("@");// si no divido el correo en dos
			local = correo.substring(0, posicion);
			dominio = correo.substring(posicion+1);
			}
			if (local.length() > 64) {//longitud local
				error = -1 ;
			}
			if(dominio.length()>255) {//longitu dominio
				error = -1;
			}
			if (correo.length()>254) {//longitud total
				error = -1;
			}
			for (int i = 0; i < local.length(); i++) {//si los caracteres de local son permitidos
				if (permitidos.indexOf(local.charAt(i)+"") == -1) {
				error = -1;	
				}
			}
			if (local.charAt(0)=='.') {//que no empiece por punto
				error = -1;
			}
			if (local.charAt(local.length()-1) == '.') {//que no acabe en punto
				error = -1;
			}
			if(local.indexOf("..") !=-1) {//que no haya dos puntos seguidos
				error = -1;
			}
			for (int j = 0; j < dominio.length()-1; j++) {//que los caracteres del dominio sean permitidos
				if (domperm.indexOf(dominio.charAt(j)+"") == -1) {
					error=-1;
				}
			}
			for (int i = 0; i < dominio.length(); i++) {
				if ((dominio.substring(1, dominio.length()-1)).indexOf(".") == -1) {
					error=-1;//que haya punto en el domino
				}
				else if ((dominio.substring(i, dominio.length())).indexOf(".") > 63) {
				error = -1;// que los caracteres entre puntos no sean mayor que 64
				}
				else {//avanzar el  comienzo de la busqueda
				i=i+dominio.indexOf(".")+1;
				}
			}
		} while (error == -1);
		System.out.println("El correo tiene el formato correcto");
		teclado.close();
	}



}