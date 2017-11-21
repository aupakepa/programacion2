
public class Ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double matriz [][][] = new double [5][10][20];
		double sumacursos [][]= new double [5][10];
		double notamediacursos [][] = new double [5][10];
		double max= 0;
		int curso [] = new int [2];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				sumacursos [i][j] = 0;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 20; k++) {
					matriz [i][j][k] = (int) (Math.random()*11);
					sumacursos [i][j] = sumacursos [i][j] + matriz[i][j][k];	
				}
			}			
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Imprimir nota media centro: "+i);
			System.out.println();
			for (int j = 0; j < 10; j++) {
				notamediacursos [i][j] = (sumacursos [i][j])/matriz[0][1].length;
				System.out.printf("Curso nº %d : %.2f - \n",j, notamediacursos[i][j]);
			}
			System.out.println();
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  ");
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (notamediacursos[i][j]>max) {
					max = notamediacursos [i][j];
					curso [0] = i;
					curso [1] = j;

				}
			}
		}
		System.out.println("la media mas alta pertenece al centro "+curso[0]+" y al curso "+curso[1]+" con una nota de: "+max);	
	}
}
