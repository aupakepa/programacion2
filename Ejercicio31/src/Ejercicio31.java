import java.util.Scanner;
public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero1;
		int numero2;
		int salida = 0;
		while (salida==0){
			System.out.println("Bienvenido a Calculadora Cutre v1.0");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Cerrar programa");
			System.out.print("Seleccione una opción: ");
			int opcion = teclado.nextInt();
			while (opcion>5 || opcion<1){
				System.out.print("Introduzca un número correcto: ");
				opcion = teclado.nextInt();
			}
			if (opcion==1){
				System.out.print("Introduzca un número: ");
				numero1 = teclado.nextInt();
				System.out.print("Introduzca otro número: ");
				numero2 = teclado.nextInt();
				System.out.println("El resultado de la suma es: "+(numero1+numero2));
			}
			if (opcion==2){
				System.out.print("Introduzca un número: ");
				numero1 = teclado.nextInt();
				System.out.print("Introduzca otro número: ");
				numero2 = teclado.nextInt();
				System.out.println("El resultado de la resta es: "+(numero1-numero2));
			}
			if (opcion==3){
				System.out.print("Introduzca un número: ");
				numero1 = teclado.nextInt();
				System.out.print("Introduzca otro número: ");
				numero2 = teclado.nextInt();
				System.out.println("El resultado de la multiplicación es: "+(numero1*numero2));
			}
			if (opcion==4){
				System.out.print("Introduzca un número: ");
				numero1 = teclado.nextInt();
				System.out.print("Introduzca otro número: ");
				numero2 = teclado.nextInt();
				while (numero2==0){
					System.out.println("Introduzca un número diferente a 0");
					numero2 = teclado.nextInt();
				}
				System.out.println("El resultado de la división es: "+(numero1/numero2));
			}
			if (opcion==5){
				salida=1;
				System.out.println(" ");
				System.out.println("Gracias por usar nuestra Calculadora Cutre v1.0");
			}
		}
	}
}
