/** 21. Programa que calcule la suma de los pares e impares desde 1 al 1000 con un switch
 * 
 * @author jmonf
 *
 */
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumapares, sumaimpares, i, par;
		sumapares = sumaimpares = i = par = 0;
		for ( i = 0; i <= 1000 ; i++) {
		if (i % 2 == 0) {
			par=2;
		}
		else {
			par=1;
		}
		switch (par) {
		case 1: sumaimpares = sumaimpares + i;
			
			break;

		default: sumapares = sumapares + i;
			
			break;
		}

	}
		System.out.println("suma pares ="+ sumapares);
		System.out.println("suma impares = "+ sumaimpares);

}
}
