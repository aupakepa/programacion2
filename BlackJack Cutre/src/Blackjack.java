import java.util.Scanner;
public class Blackjack {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int fondo=0; // Fichas iniciales
		int apuesta=0; // Fichas apostadas
		int fold = 0; // Cuando el jugador para
		int mano=0; // La mano que lleva el jugador
		int jugador=0; // Guardamos la pun
		String respuesta=""; // Respuesta del jugador
		System.out.println("♠ Bienvenido a Blackjack ♠");
		System.out.println("- - - - - - - - - - - - -");
		System.out.print("Introduzca fichas iniciales: ");
		fondo = teclado.nextInt(); // Damos valor a fichas iniciales
		while(fondo<100){
			System.out.print("Introduzca un valor mayor a 100: ");
			fondo = teclado.nextInt(); // Damos valor a fichas iniciales
			teclado.nextLine();
		}
		teclado.nextLine(); // Limpiamos buffer
		while (fondo>=100){
			System.out.print("Introduzca una apuesta: ");
			apuesta = teclado.nextInt();
			teclado.nextLine();
			while (apuesta<100){
				System.out.print("La apuesta mínima son 100 fichas, vuelva a introducir una cifra: ");
				apuesta = teclado.nextInt();
				teclado.nextLine();
			}
			for (int i = 0; i < 2; i++) {
				mano = mano + (int)( (Math.random()*12+1) );
			}
			while(fold==0 && mano<21){
				System.out.println("Tienes "+mano);
				System.out.println("¿Sigues o te plantas?");
				respuesta = teclado.nextLine();
				if ( respuesta.equalsIgnoreCase("sigo") ){
					mano = mano + (int)( (Math.random()*12+1) );
				}
				else if ( respuesta.equalsIgnoreCase("me planto")) {
					fold = 1;
				}
				else{
					System.out.println("No te he entendido");
				}
			}
			jugador = mano;
			mano = 0;
			if (jugador > 21){
				System.out.println("Tu mano es "+jugador);
				System.out.println("Has perdido");
				fondo = fondo - apuesta;
			}
			else{
				while(mano < 21){
					mano = mano + (int)( (Math.random()*12+1) );
				}
				if (mano>jugador && mano <= 21){
					System.out.println("Tu mano es "+jugador);
					System.out.println("La mesa es "+mano);
					System.out.println("Has perdido");
					fondo = fondo - apuesta;
				}
				else {
					System.out.println("Tu mano es "+jugador);
					System.out.println("La mesa es "+mano);
					System.out.println("Has ganado");
					fondo = fondo + apuesta*2;
				}
				mano=0;
				jugador = 0;
				fold = 0;
			}
			System.out.println("Fondo disponible: "+fondo);
		}
	}

}
