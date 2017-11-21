/**15.- 
 * Imprimir los números naturales que hay entre ambos empezando por el mas pequeño,
 * contar cuantos hay y cuantos son pares
 * Calcular la suma de los impares.
 * @author jmonf
 *
 */
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumaImpares, cuentaPares, contador, cuenta, numero1, numero2 ,auxiliar;
		cuenta = sumaImpares = cuentaPares = numero1 = numero2 = auxiliar =  0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introducir dos numeros");
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		teclado.close();
		if (numero1>numero2) {//El numero2 tiene que ser mayor que el nuumero1 sino los intercambiamos
			auxiliar = numero2;
			numero2 = numero1;
			numero1 = auxiliar;	
			contador = numero1 + 1;}
		else {
			contador = numero1 + 1;
		}
		while (contador<numero2) {
			System.out.println(contador);
			cuenta++;
			if (contador%2!=0) {
				sumaImpares=sumaImpares+contador;
			}
			else {
				cuentaPares++;
			}
			contador++;
		}
		System.out.println("Cuenta de los Pares="+cuentaPares);
		System.out.println("Suma de los Impares="+sumaImpares);
		System.out.println("Cuenta="+cuenta);

	}
}
