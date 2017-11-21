import java.util.Scanner;

/**4. Escribe un programa que pida por teclado dos nombres con su apellido cada uno del
siguiente modo:

Introduce un nombre y un apellido:
Manuel García

Introduce otro nombre y apellido:
Jimena Pérez

Después debe intercambiar los apellidos a los nombres y mostrarlos:
Jimena García
Manuel Pérez*/
public class St24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un nombre y un apellido:");
		String Nombre1 = teclado.nextLine();
		System.out.println("Introduce un nombre y un apellido:");
		String Nombre2 = teclado.nextLine();
		String Pila1 = "";
		String Pila2 = "";
		String Apellido1 = "";
		String Apellido2 = "";
		for (int i = 0; i < Nombre1.length(); i++) {
			if (Nombre1.charAt(i)==' '){
				Pila1 = Nombre1.substring(0, i);
				Apellido1 = Nombre1.substring(i+1);
			}
			
		}
		for (int i = 0; i < Nombre2.length(); i++) {
			if (Nombre2.charAt(i)==' '){
				Pila2 = Nombre2.substring(0, i);
				Apellido2 = Nombre2.substring(i+1);
			}
			
		}
		System.out.println(Pila1+" "+Apellido2);
		System.out.println(Pila2+" "+Apellido1);
		teclado.close();
	}

}
