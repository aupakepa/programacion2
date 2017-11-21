import java.util.Scanner;
public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;
		int salida = 0;
		int objetivo;
		String nombre[] = {"Nacho","Luis","Pedro","Manuel","Rodrigo","Manolo","Jose","Marta","Roberto","Pablo"};
		String asignaturas[][] = new String[10][4];
		for (int i = 0; i < asignaturas.length; i++) {
			
		}
		while (salida==0){
			System.out.println("");
			System.out.println("Bienvenido a Notas Cutres v1.1");
			System.out.println("1. Alumnos");
			System.out.println("2. Asignaturas");
			System.out.println("3. Buscar alumno");
			System.out.println("4. Salir");
			System.out.println("");
			System.out.print("Introduzca su opcion: ");
			opcion = teclado.nextInt();
			switch (opcion) {
				case 1:
					for (int i = 0; i < nombre.length; i++) {
						System.out.println(nombre[i]);
					}
					break;
				case 2:
					System.out.println("Programacion, Bases de Datos, Sistemas informáticos");
					
					break;
				case 3:
					System.out.println("Introduzca el nombre del alumno");
					String buscador = teclado.nextLine();
					for (int i = 0; i < nombre.length; i++) {
						if (buscador.equalsIgnoreCase(nombre[i])){
							System.out.println(nombre[i]);
							System.out.println("Ha suspendido");
						}
					}
					break;
				case 4:
					salida = 1;
					System.out.println("");
					System.out.println("Gracias por usar Notas Cutres v1.1");
					break;
			}
		}
	}
}

