/* 2.Leer del teclado dos vectores de dimensión 10 y construir un tercer vector cuyos 
 * 	componentes sean la suma de los dos anteriores. Luego se imprime el tercer vector. 
 * 	A continuación se ordena y se vuelve a imprimir.
 * /
 */
public class Ar02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector1 [] = new int [10];
		int vector2 [] = new int [10];
		int vector3 [] = new int [10];
		for (int i = 0; i < vector3.length; i++) {
			vector1[i] = (int)(Math.random()*50)+1;
			vector2[i] = (int)(Math.random()*50)+1;
			vector3[i] = vector1[i] + vector2[i];
			System.out.printf("Posición %02d | (%02d) -> %02d+%02d\n" ,i+1,vector3[i],vector1[i],vector2[i]);
		}
	}
}
