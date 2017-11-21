/**14.Imprimir el mayor y el menor de 5 numeros que introducimos por teclado*/
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
int contador, mayor , menor , numero;
contador=1;
mayor=0;
menor=0;
numero=0;
	while(contador<=5) {
		if (contador==1) {
			System.out.println("introducir 5 numeros");
			numero = teclado.nextInt();
			mayor=numero;
			menor=numero;
		}
		else {
			numero = teclado.nextInt();

			if (numero>mayor) {
				mayor=numero;
			}
			if (numero<menor) {
				menor=numero;
			}		
		}			
		contador++;
	}
	System.out.println("mayor="+mayor);
	System.out.println("menor="+menor);
teclado.close();
	}
}
