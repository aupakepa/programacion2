/**Realizamos la impresion de los numeros en formato LCD*/
/*participantes del ejercicio el equipo formnado por 
Ada
Javier
Juan
Pepe*/

package roles2;

import java.util.Scanner;

public class Roles2bis {

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
			
			switch (frase.charAt(i)) {
			case '1': tejado = tejado +"   ";
					cuerpo =cuerpo + "  |";
					pies = pies +"  |";
				
				break;
			case '2':tejado = tejado +" _ ";
			cuerpo =cuerpo + " _|";
			pies = pies +"|_ ";
				
				break;
			case '3':tejado = tejado +" _ ";
			cuerpo =cuerpo + " _|";
			pies = pies +" _|";
				
				break;
			case '4':tejado = tejado +"   ";
			cuerpo =cuerpo + "|_|";
			pies = pies +"  |";
				
				break;
			case '5':tejado = tejado +" _ ";
			cuerpo =cuerpo + "|_ ";
			pies = pies +" _|";
				
				break;
			case '6':tejado = tejado +" _ ";
			cuerpo =cuerpo + "|_ ";
			pies = pies +"|_|";
				
				break;
			case '7':tejado = tejado +" _ ";
			cuerpo =cuerpo + "  |";
			pies = pies +"  |";
				
				break;
			case '8':tejado = tejado +" _ ";
			cuerpo =cuerpo + "|_|";
			pies = pies +"|_|";
				
				break;
			case '9':tejado = tejado +" _ ";
			cuerpo =cuerpo + "|_|";
			pies = pies +"  |";
				
				break;
			case '0':tejado = tejado +" _ ";
			cuerpo =cuerpo + "| |";
			pies = pies +"|_|";
				
				break;


			default:
				break;
			}
			
			// TEJADO
			
		}
		System.out.println(tejado+'\n'+cuerpo+'\n'+pies); // Se imprime el resultado
		teclado.close();
	}
}