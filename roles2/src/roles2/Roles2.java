/**Realizamos la impresion de los numeros en formato LCD*//
/*participantes del ejercicio el equipo formnado por 
Ada
Javier
Juan
Pepe*/
package roles2;
import java.util.Scanner;
//*
public class Roles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int error =0; // Activador para salir del do while
		String tejado = ""; //Aquí almacenaremos la parte superior de la impresion '_' o ' '
		String cuerpo ="";// Esta variable almacena el cuerpo de los numeros
		String pies = "";// Aqui imprimimos el pie
		String frase;
		
		// Forzamos que la entrada de un número
		do {	
			error=0;
			System.out.print("Introduzca un numero por teclado:");
			frase = teclado.nextLine();
			for (int i = 0; i < frase.length(); i++)  // comprobamos que no existen letras para la longitud de la cadena.
			{
				if (frase.charAt(i) <'0' || frase.charAt(i) > '9') {
					error=1;
				}

			}

		} while (error==1);
		
		// Se empieza a controlar la estructura.
		for (int i = 0; i < frase.length(); i++) {
			
			// TEJADO
			if(frase.charAt(i) == '1' || frase.charAt(i) == '4'){ // Se imprime techo
				tejado = tejado + "   ";
			}
			else{ // No se imprime techo
				tejado = tejado + " _ ";
			}
			
			// CUERPO
			if(frase.charAt(i) == '1' || frase.charAt(i)=='7'){ // Se controla la estructura cuerpo
				cuerpo = cuerpo + "  |";
			}
			if(frase.charAt(i) == '2' || frase.charAt(i)=='3'){
				cuerpo = cuerpo + " _|";
			}
			if(frase.charAt(i)== '4' || frase.charAt(i)=='8' || frase.charAt(i)=='9'){
				cuerpo = cuerpo + "|_|";
			}
			if(frase.charAt(i)== '0'){
				cuerpo = cuerpo + "| |";
			}
			if (frase.charAt(i) == '5' || frase.charAt(i)=='6'){ // Se controla la estructura cuerpo
				cuerpo = cuerpo + "|_ ";
			}
			
			// PIESES
			if (frase.charAt(i) == '1' || frase.charAt(i)=='7' || frase.charAt(i)=='4'){// Se controla la estructura pieses
				pies = pies + "  |";
			}
			if (frase.charAt(i) == '2'){
				pies = pies + "|_ ";
			}
			if (frase.charAt(i)=='3' || frase.charAt(i)=='5' || frase.charAt(i)=='9'){
				pies = pies + " _|";

			} 
			if (frase.charAt(i)=='6' || frase.charAt(i)=='8' || frase.charAt(i)=='0'){ // Se controla la estructura pieses
				pies = pies + "|_|";
			}
		}
		System.out.println(tejado+'\n'+cuerpo+'\n'+pies); // Se imprime el resultado
		teclado.close();
	}
}
