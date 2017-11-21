
public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][] = new int [4][5];
		int trans [][] = new int [5][4];
		System.out.println("matriz original");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] =(int) (Math.random()*100+1);
				System.out.printf("%02d ",matriz[i][j]);
				trans[j][i] = matriz[i][j];
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("matriz transpuesta");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%02d ",trans[i][j]);
			}
			System.out.println();
		}
		
	}
}
