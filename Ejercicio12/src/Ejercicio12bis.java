/** Ejercicio12.- Hacer un pseudo codigo que imprima los numeros del 1 al 100. 
 * Que calcule la suma de todos os numeros pares por un lado y por otro, la de todos los impares*/
public class Ejercicio12bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador , sumaPares , sumaImpares;
		contador=1;
		sumaPares=0;
		sumaImpares=0;
		while(contador <= 100) {
			if (contador%2 != 0) {
				sumaImpares=sumaImpares+contador;
				System.out.println(contador);
				contador++;
			}	
			else {
				sumaPares=sumaPares+contador;
				System.out.println(contador);
				contador++;
			}
		}
		System.out.println("suma Pares="+sumaPares);
		System.out.println("suma Impares="+sumaImpares);
	}

}
