/*crear una tabla de 3 paginas, 4 filas y 5 columnas donde el primer elemento valga 1, el segundo 2 el tercero 3 y asi sucesivamente
 * 
 */
public class Ejercicio40 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][][] = new int [3][4][5];
		int contador = 1;
		for (int i = 0; i < 3; i++) {
			System.out.println("\n");
			System.out.println("imprimir pagina :"+i);
			for (int j = 0; j < 4; j++) {
				System.out.println();
				for (int k = 0; k < 5; k++) {
					matriz [i][j][k] = contador++;
					System.out.print(" ");
					System.out.printf("%03d",matriz[i][j][k]);
					
				}
				
			}
			
		}
	}

}
