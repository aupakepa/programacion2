/** Simular la carrera de caballos en que tengan la misma probabilidad de ganar
 * 
 * @author jmonf
 *
 */
public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int caballo[] = new int[10];
		int contador = 0;
		int ganador = 0;
		int carrera = 0;
		String recorrido[]= {"Caballo1","Caballo2","Caballo3","Caballo4","Caballo5","Caballo6","Caballo7","Caballo8","Caballo9","Caballo10"};
		contador = (int)(Math.random()*10);
		System.out.println("Sale primero el caballo numero : "+Math.addExact(contador, 1));
		while (contador <=9) {

			carrera = (int)((Math.random()*10)+1);
			caballo [contador] = caballo [contador] + carrera;
			for (int i = 1; i <= carrera; i++) {
				recorrido [contador] = recorrido [contador].concat("-");
			}
			recorrido[contador] = recorrido[contador].concat(" ");

			if (caballo [contador]>=50) {
				ganador=contador+1;
				contador=10;
			}
			if (contador == 9) {
				contador=-1;
			}
			contador++;
		}
		for (contador = 0; contador <= 9; contador++) {
			System.out.println(recorrido[contador]+caballo[contador]);
		}
		System.out.println("el ganador es el caballo numero "+ ganador);
	}
}
