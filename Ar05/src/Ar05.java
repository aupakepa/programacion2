/**5.	Generar  dos vectores de dimensi�n  10 (dar valores aleatorios
 *  entre 1 y 5 a cada elemento) y comprobar para cada uno de los elementos
 *    del primer vector cu�ntas veces est� en el segundo, es decir para
 * vector1= {3,7,2}
     vector2= {3,3,5}
     el resultado debe ser:
     elemento 1 : 2 veces
     elemento 2 : 0 veces
     elemento 3 : 0 veces
 */
public class Ar05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector1 [] = new int [10];
		int vector2 [] = new int [10];
		int contador [] = new int [10];
		System.out.println("vector 1");
		for (int i = 0; i < vector1.length; i++) {
			vector1[i] = (int)(Math.random()*5)+1;
			System.out.printf ("%1d ",vector1[i]);
		}
		System.out.println("\n");
		System.out.println("vector 2");
		for (int i = 0; i < vector2.length; i++) {
			vector2[i] = (int)(Math.random()*5)+1;
			System.out.printf ("%1d ",vector2[i]);
		}
		System.out.println("\n");
		
		for (int i = 0; i < vector1.length; i++) {
			for (int j = 0; j < vector2.length; j++) {
				if(vector1 [i] == vector2 [j])
				{contador[i]++;
				}
			}
			System.out.println(" El numero "+vector1[i]+" : "+contador[i]+" Veces");
		}
	}
}
