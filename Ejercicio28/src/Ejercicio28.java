/** 28. simular el lanzamiento de una moneda e imprimir si ha salido cara o cruz
 * 
 *
 */
public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int moneda = 0;
		System.out.println("lanza una moneda al aire");
		moneda = (int) (Math.random()*2)+1;
		if (moneda==1) {
			System.out.println("cruz");
		}
		if (moneda==2) {
			System.out.println("cara");	
		}

	}
}
