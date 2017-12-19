import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) throws InterruptedException {
		// holiquiss
		int horas, minutos, segundos , menu;
		horas  = minutos = segundos = 0;
		Scanner teclado = new Scanner(System.in);
		Hora reloj = new Hora(segundos,minutos,segundos);
		do {
			System.out.println("1. Poner el Reloj en Hora");
			System.out.println("2. Funcionamiento del Reloj");
			System.out.println("3. Sumar horas al reloj");
			System.out.println("5. Salir del menu");
			menu = teclado.nextInt();
			switch (menu) {
			case 1:
				reloj.introducirHora(teclado, reloj);
				reloj.imprimirHora();
				break;
			case 2:
				reloj.funcionReloj();
				break;
			case 3:
				reloj.suma(mhora, mminuto, msegundo);
				break;
			default:
				System.out.println("Para todo lo demas Mastercard");
				break;
			}			
		} while (menu != 5);
	}	
}
