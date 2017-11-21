
public class Ejercicio37bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix1[][] = new int [4][5];
		int matrix2[][] = new int [5][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				matrix1[i][j]  = (int)(Math.random()*100+1);
				System.out.printf("%3d ", matrix1[i][j]);
				matrix2[j][i] = matrix1[i][j];
			}
			System.out.println("");
		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d ", matrix2[i][j]);
			}
			System.out.println("");
		}
	}

}
