
public class Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int matriz [][] = new int [4][5];
	
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 5; j++) {
			matriz[i][j] =(int) (Math.random()*100+1);
		}
		
	}
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 5; j++) {
			System.out.printf("%02d ",matriz[i][j]);
		}
		System.out.println("\n");
	}
	}
}
