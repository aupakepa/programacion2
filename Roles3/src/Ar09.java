import java.util.Scanner;

public class Ar09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String carta [] = {	"|2 ♥|","|3 ♥|","|4 ♥|","|5 ♥|","|6 ♥|","|7 ♥|","|8 ♥|","|9 ♥|","|10♥|","|J ♥|","|Q ♥|","|K ♥|","|A ♥|",
				"|2 ♦|","|3 ♦|","|4 ♦|","|5 ♦|","|6 ♦|","|7 ♦|","|8 ♦|","|9 ♦|","|10♦|","|J ♦|","|Q ♦|","|K ♦|","|A ♦|",
				"|2 ♣|","|3 ♣|","|4 ♣|","|5 ♣|","|6 ♣|","|7 ♣|","|8 ♣|","|9 ♣|","|10♣|","|J ♣|","|Q ♣|","|K ♣|","|A ♣|",
				"|2 ♠|","|3 ♠|","|4 ♠|","|5 ♠|","|6 ♠|","|7 ♠|","|8 ♠|","|9 ♠|","|10♠|","|J ♠|","|Q ♠|","|K ♠|","|A ♠|"};
		String ordenadas[] = new String[52];
		for (int j = 0; j < carta.length; j++) {
			ordenadas[j] = carta [j];
		}
		int posicion = 0,opcion=0,salir=0;
		String comodin = "";

		while(salir==0){
			System.out.println("\n- - - - - - - - - - - ");
			System.out.println("♥♦♣♠ Bienvenido a Cartas Cutres v1 ♠♣♦♥");
			System.out.println();
			System.out.println("1. Cartas ordenadas");
			System.out.println("2. Baraja las Cartas");
			System.out.println("3. Buscar una carta");
			System.out.println("4. Repartir con solapamiento");
			System.out.println("5. Repetir sin solapamiento");
			System.out.println("6. Jugar al Poker");
			System.out.println("7. Salir");
			System.out.println("- - - - - - - - - - - ");
			System.out.print("Introduzca opcion: ");
			opcion=teclado.nextInt();
			//Opcion 1 - Ordenadas
			if(opcion==1){
				System.out.println(" ___    ___    ___    ___    ___    ___    ___    ___    ___    ___    ___    ___    ___    ");
				for (int j = 0; j < carta.length; j++) {
					if(j%13==0 && j!=0 && j<52){
						System.out.println("");
						System.out.println("|___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|");
					}
					System.out.printf("%5s  ", ordenadas[j]);
				}
				System.out.println("\n|   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |");
				System.out.println("|___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|");
			}
			//Opcion 2 - Barajear
			if(opcion==2){
				for (int i = 0; i < carta.length; i++) {
					posicion = (int)(Math.random()*52);
					comodin = carta[posicion];
					carta[posicion] = carta[i];
					carta[i] = comodin;
				}
				System.out.println(" ___    ___    ___    ___    ___    ___    ___    ___    ___    ___    ___    ___    ___    ");
				for (int j = 0; j < carta.length; j++) {
					if(j%13==0 && j!=0 && j<52){
						System.out.println("");
						System.out.println("|___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|");
					}
					System.out.printf("%5s  ", carta[j]);		
				}
				System.out.println("\n|   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |  |   |");
				System.out.println("|___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|  |___|");
			}
			//Opcion 3 - Buscar una Carta

			if (opcion==3){
				System.out.println();
				System.out.print("Introducir exactamente la carta a buscar: ");
				teclado.nextLine();// Para evitar problema buffer de java
				String buscar ="";

				buscar = teclado.nextLine();
				for (int i = 0; i < carta.length; i++) {
					if (carta[i].equals(buscar)) {
						String diseño="\n"+" ___"+"\n"+carta[i]+"\n"+"|   |"+"\n"+"|___|";
						System.out.println(diseño+" está en la posicion "+(i+1));					
					}
				}
			}
			if (opcion==4){ 
				int numero;
				do {
					System.out.println("¿Cuantas cartas quiere?");
					numero = teclado.nextInt();	
					teclado.nextLine();
				}  while (numero < 0 || numero > 52);
				String mano [] = new String [numero];
				for (int i = 0; i < numero; i++) {
					mano[i]= ordenadas[(int)(Math.random()*52)];
				}
				for (int i = 0; i < numero; i++) {
					System.out.printf(" ___  ");
				}
				System.out.println();
				for (int i = 0; i < mano.length; i++) {
					System.out.printf("%5s ",mano[i]);
				}
				System.out.println();
				for (int i = 0; i < numero; i++) {
					System.out.printf("|   | ");	
				}
				System.out.println();
				for (int i = 0; i < numero; i++) {
					System.out.printf("|___| ");	
				}
			}
			if (opcion==5){ 
				int numero;
				do {
					System.out.println("¿Cuantas cartas quiere?");
					numero = teclado.nextInt();	
					teclado.nextLine();
				}  while (numero < 0 || numero > 52);
				for (int i = 0; i < carta.length; i++) {
					posicion = (int)(Math.random()*52);
					comodin = carta[posicion];
					carta[posicion] = carta[i];
					carta[i] = comodin;
				}
				for (int i = 0; i < numero; i++) {
					System.out.printf(" ___  ");
				}
				System.out.println();
				for (int i = 0; i < numero; i++) {
					System.out.printf("%5s ",carta[i]);	
				}
				System.out.println();
				for (int i = 0; i < numero; i++) {
					System.out.printf("|   | ");	
				}
				System.out.println();
				for (int i = 0; i < numero; i++) {
					System.out.printf("|___| ");	
				}
			}
			//Opcion 6 - Poker
			if(opcion==6){
				int cont=1,cartaimpr=0,numeromanos=0;
				System.out.println();
				System.out.println(" ♥♦♣♠ Bienvenido a Poker Texas Hold'em ♠♣♦♥");
				System.out.println();
				System.out.print("Indique cuántas manos se van a jugar: ");
				numeromanos = teclado.nextInt();
				while(numeromanos>9 || numeromanos<=0){
					System.out.print("Número de manos permitido es menor a 10 y mayor a 0: ");
					numeromanos = teclado.nextInt();
				}
				for (int i = 0; i < carta.length; i++) { // Baraja las cartas
					posicion = (int)(Math.random()*52);
					comodin = carta[posicion];
					carta[posicion] = carta[i];
					carta[i] = comodin;
				}
				for (int i = 0; i < numeromanos*2; i++) {
					if (i%2==0){
						System.out.println("         ___  ___");
						System.out.print("Mano "+cont+": ");
						cont++;
					}
					System.out.print(carta[i]);
					cartaimpr++;
					if (cartaimpr==2){
						System.out.println("\n        |   ||   |");
						System.out.println("        |___||___|");
						cartaimpr=0;
					}
				}
				System.out.println("\n         - - - Table - - -");
				for (int i = numeromanos*2; i < (numeromanos*2)+5; i++) {
					if (i==numeromanos*2){
						System.out.println("      ___  ___  ___  ___ ___");
						System.out.print("     ");
					}
					System.out.print(carta[i]);
					if (i==((numeromanos*2)+5)-1){
					System.out.println("\n     |   ||   ||   ||   ||   |");
					System.out.println("     |___||___||___||___||___|");
					}
				}
			}
			//Opcion 7 - Salir
			if(opcion==8){
				salir = 1;
				teclado.close();
			}
		}
	}
}
