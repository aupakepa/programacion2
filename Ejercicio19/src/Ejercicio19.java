/**19.-Hacer un pseudocodigo que simule el funcionamiento de un reloj digital 
 * y que permita ponerlo en hora*/
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int hora=introduccionHoras();
		int minutos=introduccionMinutos();
		int segundos=introduccionMinutos();
		escribirHora(hora,minutos,segundos);

	}
	public static void escribirHora (int hora, int minutos, int segundos){
		while(segundos<=60) {
			if (segundos==60) {
				segundos = 0;
				minutos++;
			}
			if (minutos==60){
				minutos=0;
				hora++;
			}
			if (hora==24) {
				hora = 0;
			}
			System.out.printf("%02d:%02d:%02d\n",hora,minutos,segundos);
			segundos++;
		}
	}
	public static int introduccionHoras (){
		Scanner teclado = new Scanner(System.in);

		int hora=-1;
		while(hora>=24 || hora<0){
			System.out.println("introducir horas");
			hora = teclado.nextInt();
		}
		return(hora);
	}
	public static int introduccionMinutos(){
		Scanner teclado = new Scanner(System.in);
		int minutos=-1;
		while(minutos>=60 || minutos<0){
			System.out.println("introducir minutos");
			minutos = teclado.nextInt();
		}
		return(minutos);
		
	}
}

