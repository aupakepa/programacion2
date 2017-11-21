/** Ejercicio12.- Hacer un pseudo codigo que imprima los numeros del 1 al 100. 
 * Que calcule la suma de todos los numeros pares por un lado y por otro, la de todos los impares*/
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int contador, fin , sumaPares , sumaImpares;
	contador=1;
	fin=2;
	sumaPares=0;
	sumaImpares=0;
	while(contador <= 100) {
		fin--;
		if(fin==1) {
			sumaImpares=sumaImpares+contador;
			System.out.println(contador);
			contador++;
			
		}
		else {
			sumaPares=sumaPares+contador;
			System.out.println(contador);
			fin=2;
			contador++;
		}
		
	}
		System.out.println(sumaPares);
		System.out.println(sumaImpares);
			
	}

}
