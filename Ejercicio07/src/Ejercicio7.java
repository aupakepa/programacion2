import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Introducir frases como queramos y contarlas */
		Scanner teclado = new Scanner (System.in);
		String frases = "a";  
		System.out.println("Introducir Frases");
		int cuenta = -1; // Porque el ultimo intro cuenta como frase  cuenta ++ 
			while (!frases.equals("")){
				frases= teclado.nextLine();
				cuenta++;
		}
	System.out.println (cuenta); 
	teclado.close();
	}


}
