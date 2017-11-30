/*4.Generar una matriz de 5x5  (num�rica entera entre -100 y 100) e
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
					primermenor=i+1; // Guarda la posici�n y activa el primer guardado
					pm2=j+1; // Guarda la posici�n [j] del n�mero m�s grande
				}
				if(matriz[i][j]>mayor || primermayor==0){
					mayor=matriz[i][j];
					primermayor=i+1; // Guarda la posici�n y activa el primer guardado
					pM2=j+1; // Guarda la posici�n [j] del n�mero m�s peque�o
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
		System.out.printf("El n�mero m�s grande  es el %3d (Posici�n %d,%d)\n",mayor,(pM2),primermayor); // Se resta -1 porque se ha guardado con +1 
		System.out.printf("El n�mero m�s peque�o es el %3d (Posici�n %d,%d)\n",menor,(pm2),primermenor); // Se resta -1 porque se ha guardado con +1
	}

}
