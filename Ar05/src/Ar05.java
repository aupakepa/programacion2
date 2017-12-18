/**5.	Generar  dos vectores de dimensión  10 (dar valores aleatorios
 *  entre 1 y 5 a cada elemento) y comprobar para cada uno de los elementos
 *    del primer vector cuántas veces está en el segundo, es decir para
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
		for (int i = 0; i < vector1.length; i++) {// rellenar e imprinir el primer vector
			vector1[i] = (int)(Math.random()*5)+1;
			System.out.printf ("%1d ",vector1[i]);
		}
		System.out.println("\n");
		System.out.println("vector 2");
		for (int i = 0; i < vector2.length; i++) {// rellenar e imprimir el segungo vector
			vector2[i] = (int)(Math.random()*5)+1;
			System.out.printf ("%1d ",vector2[i]);
		}
		System.out.println("\n");
		
		for (int i = 0; i < vector1.length; i++) {// revisar un elemento del vector 1 y 
			for (int j = 0; j < vector2.length; j++) {
				if(vector1 [i] == vector2 [j])//compararlo con cada elemento del vector dos
				{contador[i]++; // sumarlo a un vector contador
				}
			}
			System.out.println(" La posicion "+i+" con valor "+vector1[i]+" : "+contador[i]+" Veces");
		}
	}
}
