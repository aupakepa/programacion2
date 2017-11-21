/**16.-imprimir 10 veces la serie de numeros del uno al 10
 * 
 * @author jmonf
 *
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int veces, contador;
		contador = veces = 1;
		while (veces<=10) {
			while (contador<=10) {
				System.out.println(contador);
				contador++;	}
			contador=1;
			veces++;
		}
	}
}