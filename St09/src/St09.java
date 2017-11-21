import java.util.Scanner;

/**9. Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro primeros
 *  sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo (H ó M) sexo, 
 *  el sexto un numero que representa el curso 1 ó 2 y los caracteres 
 *  séptimo y octavo pueden tener cualquier valor.Ddeben rechazarse los códigos que no cumplan estas
 *condiciones, la finalización de entrada de códigos se produce cuando se introduce el código “00000000”.
 *Al final el programa debe sacar un informe indicando cuántos hombres y mujeres hay matriculados en primero 
 *y segundo y cuántos códigos correctos han sido leídos.*/
public class St09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n = 0;//numero de codigos introducidos
		int alum [][] = new int [2][2];
		System.out.println("introduzca codigos 199?????");
		String Codigo = "";
		while (Codigo.indexOf("00000000") == -1) {
			Codigo = teclado.nextLine();
			Codigo = Codigo.toUpperCase();
			if((Codigo.charAt(0) != '1') || (Codigo.charAt(1) != '9') || (Codigo.charAt(2) !='9') || (Codigo.charAt(4) != 'M' && (Codigo.charAt(4)!='H')) || ((Codigo.charAt(5) != '1') && (Codigo.charAt(5) != '2')) || (Codigo.length() != 8)) {
				if (Codigo.indexOf("00000000") != -1) {
					System.out.println("fin del programa");
					teclado.close();
					}
				if (Codigo.indexOf("00000000") == -1) {
					System.out.println("el codigo no es correcto vuelva a introducirlo ");
					System.out.println("introduzca un codigo 199?????");
					Codigo = teclado.nextLine();
					Codigo = Codigo.toUpperCase();
				}
			}
			else {
				n++;
				if((Codigo.charAt(4)=='H') && (Codigo.charAt(5)=='1')) {
					alum[0][0] =(alum[0][0])+1;
				}
				if((Codigo.charAt(4)=='M') && (Codigo.charAt(5)=='1')) {
					alum[0][1] =(alum[0][1])+1;

				}
				if((Codigo.charAt(4)=='H') && (Codigo.charAt(5)=='2')) {
					alum[1][0] =(alum[1][0])+1;

				}
				if((Codigo.charAt(4)=='M') && (Codigo.charAt(5)=='2')) {
					alum[1][1] =(alum[1][1])+1;
				}
			}
		}
		System.out.println("se han introducido "+n+" codigos");
		System.out.println("    HOMBRES    "+"    MUJERES   ");
		System.out.println("--------------  --------------");
		for (int i = 0; i < alum.length; i++) {
			System.out.println();
			for (int j = 0; j < alum[0].length; j++) {
				System.out.print("curso "+(i+1)+"  ");
				System.out.printf("%02d     ",alum[i][j]);
			}
		}
		teclado.close();
	}
}

