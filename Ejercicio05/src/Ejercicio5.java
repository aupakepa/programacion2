/**5.programa q imprima los impares hasta 100 y que imprima cuantos impares
 * 
 * @author jmonf
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1 ;
		int cuenta = 0 ;
		while(contador < 100) {
			System.out.println (contador);
			cuenta++;
			contador = contador + 2;
			
		}
		System.out.println("cuenta de los numeros impares");
		System.out.println(cuenta);
	}

}
