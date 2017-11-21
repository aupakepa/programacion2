import java.util.Scanner;
public class Roles1 { 
	/** Programa para comprobar si la letra del DNI/NIE es corrrecta
	 * 
	 * @EQUIPO A
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
		String Resultado = "";
		String Frase = "";
		int error = 1;
		int resto = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			error = 0;
			System.out.println("Introduce un DNI/NIE en el formato correcto con letra.");
			Frase = teclado.nextLine();
			Frase = Frase.trim();
			Frase = Frase.toUpperCase();
			if(Frase.length() != 9) {//para que la longitud sea la correcta
				error = -1;
			}
			for (int i = 1; i < Frase.length()-1; i++) {//para evitar que se meta una letra en un campo numerico
<<<<<<< HEAD
				if ((Frase.charAt(i)) < '0' || (Frase.charAt(i) > '9'))
=======
				if (((int)Frase.charAt(i)) < 48 || ((int)Frase.charAt(i) > 57))
>>>>>>> 5792d99be99045ba7b20a2dac54c67b5c929132e
				error = -1;
			}
		} while (error == -1);
		error = 1;
		if (Frase.charAt(0)=='X'){ // Modificamos el valor de la letra inicial del NIE.
			error = 0;
			Resultado = "0" + Frase.substring(1, Frase.length()-1); 
		}
		if (Frase.charAt(0)=='Y'){ // Modificamos el valor de la letra inicial del NIE.
			error = 0;
			Resultado = "1" + Frase.substring(1, Frase.length()-1);
		}
		if (Frase.charAt(0)=='Z'){ // Modificamos el valor de la letra inicial del NIE.
			error = 0;
			Resultado = "2" + Frase.substring(1, Frase.length()-1);
		}
		if (Frase.charAt(0) >= '0' && Frase.charAt(0)<='9'){
			error = 0;
			Resultado = Frase.substring(0, Frase.length()-1);}
		if (error == 1) {
			System.out.println("El dni no tiene el formato adecuado");
		}
		if (error == 0){
			resto = Integer.valueOf(Resultado)%23;
			if(Frase.charAt(8)==Tabla.charAt(resto)){
				System.out.println("La letra es correcta.");
			}
			else{
				System.out.println("La letra es incorrecta");
			}
		}
		teclado.close();
	}
}