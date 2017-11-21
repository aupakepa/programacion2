import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int contador, numero;
		System.out.println("introducir un numero para saber si es primo");
		numero = teclado.nextInt();
		String primo;
		primo="El numero es primo";
		contador=2;
		for(contador=2;contador<=numero/2;contador++)// Solo es necesario mirarlo hasta la mitad
		{
			if (numero%contador==0) {
				System.out.println("es divisible por "+contador);
				primo="el numero no es primo";
			}
		}
		System.out.println(primo);
		teclado.close();
	}

}
