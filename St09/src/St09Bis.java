import java.util.Scanner;
public class St09Bis {
	/**9. Escribir un programa que lea c�digos de personas de 8 caracteres de modo que los cuatro primeros
	 *  sean num�ricos y contenidos entre 1990-1995 (un a�o), el quinto car�cter sea solo (H � M) sexo, 
	 *  el sexto un numero que representa el curso 1 � 2 y los caracteres 
	 *  s�ptimo y octavo pueden tener cualquier valor.Ddeben rechazarse los c�digos que no cumplan estas
	 *condiciones, la finalizaci�n de entrada de c�digos se produce cuando se introduce el c�digo �00000000�.
	 *Al final el programa debe sacar un informe indicando cu�ntos hombres y mujeres hay matriculados en primero 
	 *y segundo y cu�ntos c�digos correctos han sido le�dos.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numh1 = 0;
		int numm1 = 0;
		int numh2 = 0;
		int numm2 = 0;
		int numcd = 0;
		String frase = "";
		while (!frase.equals("00000000")){
			frase = teclado.nextLine();
			frase = frase.toUpperCase();
			if (frase.length()==8){
				char curso = frase.charAt(5);
				int a�o = Integer.valueOf(frase.substring(0,4));
				if (a�o <= 1995 && a�o >= 1990){
					if (curso=='1'){
						if(frase.charAt(4)=='M'){
							numm1++;
							numcd++;
						}
						if(frase.charAt(4)=='H'){
							numh1++;
							numcd++;
						}
					}
					if (curso=='2'){
						if((char)(frase.charAt(4))=='M'){
							numm2++;
							numcd++;
						}
						if(frase.charAt(4)=='H'){
							numh2++;
							numcd++;
						}
					}	
				}
			}	
			else{
				System.out.println("8 caracteres hermano");
			}
		}
		System.out.println("N�mero mujeres primer curso: "+numm1);
		System.out.println("N�mero hombres primer curso: "+numh1);
		System.out.println("N�mero mujeres primer curso: "+numm2);
		System.out.println("N�mero hombres primer curso: "+numh2);
		System.out.println("N�mero de c�digo correcto le�do: "+numcd);
		
		teclado.close();
	}
}
