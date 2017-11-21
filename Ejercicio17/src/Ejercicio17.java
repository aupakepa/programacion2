/** 17.- Imprimir contar y sumar los multiplos de dos que hay entre una serie de dos numeros 
 * tal que el segundo  sea mayor que el primero.
 */
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, sumaPares, cuentaPares, contador;
		sumaPares = cuentaPares = contador = 0;
		System.out.println("Introduce dos numeros");
		numero1 = teclado.nextInt(); 
		numero2 = teclado.nextInt();
		while (numero1>numero2) {
			System.out.println("El segundo debe ser mayor que el primero");
			numero1 = teclado.nextInt(); 
			numero2 = teclado.nextInt();
		}
		contador = numero1 + 1;
		while(contador<numero2) {
			if(contador%2 == 0) {
				System.out.println(contador);
				sumaPares = sumaPares + contador;
				cuentaPares++;
				contador++;	
			}
			else {
				contador++;	
			}
		}
		System.out.println("cuenta Pares="+cuentaPares);
		System.out.println("Suma Pares="+sumaPares);
		teclado.close();
	}
}