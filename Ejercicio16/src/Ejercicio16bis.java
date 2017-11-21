/**16.-imprimir 10 veces la serie de numeros del uno al 10
 * 
 * @author jmonf
 *
 */
public class Ejercicio16bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador, veces;
		String posicion;
		posicion = "\t";
		veces = 1;
		contador = 1;
		while (contador<=10) {
			while (veces<=10) {
				posicion= posicion+contador+"\t";
				veces++;	}
			System.out.println(posicion);
			veces=1;
			posicion = "\t";
			contador++;
		}
	}
}