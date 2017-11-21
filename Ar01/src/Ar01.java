/*1.	Se generan 20 números aleatorios de tipo entero entre -10 y 10 almacenándolos en un vector. Hay que calcular y mostrar la media y, además, mostrar cuántos números hay:
-Superiores a la media
-Inferiores a la media
-Iguales a la media*/

public class Ar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros [] = new int [20];
		double media = 0;
		double suma = 0;
		for (int i = 0; i < numeros.length; i++) {
		numeros[i]= ((int)(Math.random()*21))-10;
		System.out.print(numeros[i]+" ");
		}
		for (int i = 0; i < numeros.length; i++) {
			suma =suma+ numeros[i];
		}
		int contsup = 0;
		int continf = 0;
		media= suma/20;
		for (int i = 0; i < numeros.length; i++) {
			if (media < numeros[i]) {
				contsup++;	
			}
			else if (media> numeros[i]) {
				continf++;
			}
			else{
				System.out.println("¡¡¡¡¡¡hay un numero igual a la media!!!!!");
			}
		}
		System.out.println("la media es igual a "+media);
		System.out.println("hay "+contsup+" superiores a la media");
		System.out.println("hay "+continf+" inferiores a la media");
	}
		
}
