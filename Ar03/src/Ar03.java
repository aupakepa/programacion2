/*3.Leer un vector de 20 enteros. Encontrar el mayor y el menor de ellos y
 *  los lugares donde se encuentran.
 */
public class Ar03 {
	public static void main(String[] args) {
		int vector[] = new int [20];
		int mayor=0,menor=0,primermenor=0,primermayor=0;
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int)(Math.random()*50)+1;
			if(vector[i]<menor || primermenor==0){
				menor=vector[i];
				primermenor=i+1; // Guarda la posición y activa el primer guardado
			}
			if(vector[i]>mayor || primermayor==0){
				mayor=vector[i];
				primermayor=i+1; // Guarda la posición y activa el primer guardado
			}
		}
		System.out.printf("El número más grande  es el %2d (Posición %02d)\n",mayor,(primermayor)); // Se resta -1 porque se ha guardado con +1
		System.out.printf("El número más pequeño es el %2d (Posición %02d)\n",menor,(primermenor)); // Se resta -1 porque se ha guardado con +1
	}

}
