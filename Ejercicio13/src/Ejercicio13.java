/**Imprimir y contar los numeros que son multiplos de 2 o de 3 y contarlos*/
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador , multiplo2 , multiplo3 , multiplo2y3;
		contador = 1;
		multiplo2 = 0 ;
		multiplo3 = 0;
		multiplo2y3 = 0;
		while(contador<=100)// he querido y tener en cuenta el 100
		{			

			if (contador % 3==0 && contador%2 ==0) {
				System.out.println(contador);
				multiplo2y3++;
				contador++;
			}

			if (contador%2==0) {
				System.out.println(contador);
				multiplo2++;
				contador++;
			}
			if (contador % 3 ==0) {
				System.out.println(contador);
				multiplo3++;
				contador++;
			}

			else {
				contador++;
			}
		}
		System.out.println("multiplos de 2="+multiplo2);
		System.out.println("multiplos de 3="+multiplo3);
		System.out.println("multiplos de 2 y 3="+multiplo2y3);
		}
}