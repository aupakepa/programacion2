import java.util.Scanner;

public class Ex20161bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero por teclado");
		numero = teclado.nextInt();
		for (int i = 1; i < numero; i++) {
			
			for (int j = 0; j < numero-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");;
			}
			System.out.print("\n");
		}
		
	}

}
