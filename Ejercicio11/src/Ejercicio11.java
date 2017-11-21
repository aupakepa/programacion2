/** 11.imprimir y contar los multiplos de 3 desde la unidad hasta un numero que introducimos por teclado*/
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("introducir un numero");
		int numero = teclado.nextInt();
		int cuenta = 0;
		int contador = 3;
		while(contador <= numero){
			System.out.println(contador);
			cuenta++;
			contador = contador + 3;
		}
		System.out.println("cuenta="+cuenta);
		teclado.close();		
	}

}
