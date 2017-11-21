import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** hacer un pseudocodigo que solo te permita introducir S o N*/
		Scanner teclado = new Scanner (System.in); 
		String respuesta = "a";
		while(!respuesta.equals("s")&&!respuesta.equals("n")){
		respuesta = teclado.nextLine();
		}
		teclado.close();	
	}

}
