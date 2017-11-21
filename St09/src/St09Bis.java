import java.util.Scanner;
public class St09Bis {
	/**9. Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro primeros
	 *  sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo (H ó M) sexo, 
	 *  el sexto un numero que representa el curso 1 ó 2 y los caracteres 
	 *  séptimo y octavo pueden tener cualquier valor.Ddeben rechazarse los códigos que no cumplan estas
	 *condiciones, la finalización de entrada de códigos se produce cuando se introduce el código “00000000”.
	 *Al final el programa debe sacar un informe indicando cuántos hombres y mujeres hay matriculados en primero 
	 *y segundo y cuántos códigos correctos han sido leídos.*/
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
				int año = Integer.valueOf(frase.substring(0,4));
				if (año <= 1995 && año >= 1990){
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
		System.out.println("Número mujeres primer curso: "+numm1);
		System.out.println("Número hombres primer curso: "+numh1);
		System.out.println("Número mujeres primer curso: "+numm2);
		System.out.println("Número hombres primer curso: "+numh2);
		System.out.println("Número de código correcto leído: "+numcd);
		
		teclado.close();
	}
}
