import java.util.Scanner;
public class Ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EmpresaCutre v1.0");
		System.out.println();
		String tabla_1[][][] = new String [3][13][5];
		for(int i = 0;i < 3;i++){
			for(int j = 1;j < 13;j++){
				for(int k = 0;k < 5;k++){
					if(k == 0){
						switch (j) {
						case 1:
							tabla_1[i][j][k] = "Enero";
							break;
						case 2:
							tabla_1[i][j][k] = "Febrero";
							break;
						case 3:
							tabla_1[i][j][k] = "Marzo";
							break;
						case 4:
							tabla_1[i][j][k] = "Abril";
							break;
						case 5:
							tabla_1[i][j][k] = "Mayo";
							break;
						case 6:
							tabla_1[i][j][k] = "Junio";
							break;
						case 7:
							tabla_1[i][j][k] = "Julio";
							break;
						case 8:
							tabla_1[i][j][k] = "Agosto";
							break;
						case 9:
							tabla_1[i][j][k] = "Octubre";
							break;
						case 10:
							tabla_1[i][j][k] = "Septiembre";
							break;
						case 11:
							tabla_1[i][j][k] = "Noviembre";
							break;
						case 12:
							tabla_1[i][j][k] = "Diciembre";
							break;
						}
					}
					else{
						tabla_1[i][j][k] = String.valueOf((int)(Math.random()*100));
					}
					if(i == 1 && j == 0 ){
						tabla_1[i][j][k] = "Producto "+(k+1);
					}
					if((i==0 || i==1 || i==2) && j==1 && k==0){
						System.out.println("Representante "+(i+1)+": ");
					}
					if(k==0){
						System.out.println();
						System.out.printf("| %10s | ", (tabla_1[i][j][k]));
					}
					else{
						System.out.printf(" | %3s | ", (tabla_1[i][j][k]));
					}
					if((i==0 || i==1) && j ==12  && k== 4 ){
						System.out.println();
						System.out.println();
					}
				}
			}
		}	
	}

}
