
/**6.	Generar una matriz de 10x10, asignarles n�mero reales aleatorios a cada elemento entre -5 y
 *  5. Calcular e imprimir la suma de cada una de sus 
	filas y de cada una de sus columnas junto con la matriz.*/

public class Ar06bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double matriz [][] = new double [11][11];
		double sumacolumna [] = new double [11]; //aqui no hay mas narices que usar un array 
		double sumafila = 0; //podria haber usado un array pero he decidido no hacerlo
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {//Matriz para recorrer las filas
				if(j<10) {
					matriz[i][j] = Math.random()*5+1;
					sumacolumna [j] = sumacolumna [j] + matriz[i][j];
					sumafila = sumafila + matriz[i][j];
				}
				if(j==10){
					matriz[i][j] = sumafila; //Almaceno la suma aunque no haria falta
					sumafila=0;
				}
			}
			if (i==10) {
				for (int j = 0; j < sumacolumna.length; j++) {
					matriz[i][j]= sumacolumna[j];
				}
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			if (i==matriz.length-1) {
				System.out.println("--------------------------------------------------------------------");
			}
			for (int j = 0; j < matriz[0].length; j++) {
				if (j==matriz[0].length-1) {
					System.out.printf("| %2.3f",matriz[i][j]);
					System.out.println();
				}
				else if(i== matriz.length-1){
					System.out.printf("%2.2f ",matriz[i][j]);
				}	
				else if(j == matriz[0].length-1 && i == matriz.length-1){
					System.out.println("    ");
					}
				else{
					System.out.printf("%2.3f ",matriz[i][j]);
				}	
			}
		}
	}
}
