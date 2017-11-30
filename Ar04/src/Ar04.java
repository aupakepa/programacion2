/*4.Generar una matriz de 5x5  (numérica entera entre -100 y 100) e
 *  imprimir el valor mayor y el menor y los lugares donde se encuentran.
 */
public class Ar04 {
	public static void main(String[] args) {
		int matriz[][] = new int [5][5];
		int mayor=0,menor=0,primermenor=0,pm2=0,primermayor=0,pM2=0;
		// Damos valores[-100,100] a la4 matriz. 
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int)(Math.random()*201)-100;
				if(matriz[i][j]<menor || primermenor==0){
					menor=matriz[i][j];
					primermenor=i+1; // Guarda la posición y activa el primer guardado
					pm2=j+1; // Guarda la posición [j] del número más grande
				}
				if(matriz[i][j]>mayor || primermayor==0){
					mayor=matriz[i][j];
					primermayor=i+1; // Guarda la posición y activa el primer guardado
					pM2=j+1; // Guarda la posición [j] del número más pequeño
				}
				System.out.printf("%4d ",matriz[i][j]);
				if(j==4){
					System.out.println();
				}
				if(i==4 && j==4){
					System.out.println("- - - - - - - - - - - - -");
				}
			}
		}
		System.out.printf("El número más grande  es el %3d (Posición %d,%d)\n",mayor,(pM2),primermayor); // Se resta -1 porque se ha guardado con +1 
		System.out.printf("El número más pequeño es el %3d (Posición %d,%d)\n",menor,(pm2),primermenor); // Se resta -1 porque se ha guardado con +1
	}

}
