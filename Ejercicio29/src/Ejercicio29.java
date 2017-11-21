/** Lanzar 100 dados y contar las q suman 10
 * 
 * @author jmonf
 *
 */
public class Ejercicio29 {

	public static void main(String[] args) {
		int dado1, dado2, cuenta;
		cuenta = 0;
		for (int i = 0; i < 100; i++) {//son 100 veces
			dado1 = (int) (Math.random()*6+1);
			dado2 = (int) (Math.random()*6+1);
			System.out.println(dado1+" + "+ dado2);
			if (dado1+dado2 == 10) {
				cuenta++;
			}
		}
		System.out.println("dados que suman 100: "+cuenta);
	}
}
