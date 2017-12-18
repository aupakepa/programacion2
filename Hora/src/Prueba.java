import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		// holiquiss
		int horas, minutos, segundos;
		horas  = minutos = segundos = 0;
		Scanner teclado = new Scanner(System.in);
		Hora reloj = new Hora(segundos,minutos,segundos);
		
		System.out.println("introduzca horas");
		reloj.setHora(teclado.nextInt());
		
		System.out.println("introduzca minutos");
		reloj.setMinuto(teclado.nextInt());
		
		System.out.println("introduzca segundos");
		reloj.setSegundo(teclado.nextInt());
		
		reloj.imprimirHora();
		
		System.out.println("Insertar hora");
	    reloj.setHora(teclado.nextInt());
	    
	    reloj.imprimirHora();
	}
	
}
