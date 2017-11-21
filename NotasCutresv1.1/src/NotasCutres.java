import java.util.Scanner;

public class NotasCutres {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int salida = 0;
		int opcion;
		boolean existe = false;
		System.out.println("- - - - - - - - - - - - - - - - -");
		System.out.println("Bienvenido a la configuración de Notas Cutres v1.1");
		System.out.println("- - - - - - - - - - - - - - - - -");
		System.out.print("Introduzca número de alumnos: ");
		int alumnos = teclado.nextInt()+1; 		// Sumo +1 porque en la matriz el [0][0] está ocupado entonces 2 alumnos = 1;
		System.out.print("Introduzca número de asignaturas: ");
		int asignaturas = teclado.nextInt()+1; // Sumo +1 porque en la matriz el [0][0] está ocupado entonces 2 asigaturas = 1; 
		System.out.println("- - - - - - - - - - - - - - - - -");
		String Datos[][] = new String[alumnos][asignaturas];	
		System.out.println("Introduzca "+(asignaturas-1)+ " nombres de Asignaturas:");
		for (int i = 1; i < asignaturas; i++) {
			Datos[0][i] = teclado.next();
		}
		System.out.println("- - - - - - - - - - - - - - - - -");
		for (int i = 1; i < alumnos; i++) {
			System.out.print(i+". Nombre de alumno: ");
			Datos[i][0] = teclado.next();
			for (int j = 1; j < asignaturas; j++) {
				System.out.print("   Notas de "+Datos[0][j]+": ");
				Datos[i][j] = teclado.next();
				while (Integer.parseInt(Datos[i][j])<0 || Integer.parseInt(Datos[i][j])>10) {
					System.out.println("");
					System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
					System.out.println("Introduzca un valor entre 0 y 10");
					System.out.println("¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡ ¡");
					System.out.println("");
					System.out.print("   Notas de "+Datos[0][j]+": ");
					Datos[i][j] = teclado.next();
				}
			}
			System.out.println("- - - - - - - - - - - - - - - - -");
		}
		Datos[0][0] = "Alumnos:";
		System.out.println("Configuracion lista.");
		
		while (salida==0) {
			System.out.println("- - - - - - - - - - - - - - - - -");
			System.out.println("Bienvenido a Notas Cutres v1.1");
			System.out.println("1. Lista de Alumnos");
			System.out.println("2. Lista de Asignaturas");
			System.out.println("3. Notas de Alumno");
			System.out.println("4. Salir");
			System.out.println("- - - - - - - - - - - - - - - - -");
			System.out.print("Introduzca opción: ");
			opcion = teclado.nextInt();
			System.out.println("- - - - - - - - - - - - - - - - -");
			
			if (opcion==1) {
				System.out.println(Datos[0][0]);
				System.out.println("");
				for (int i = 1; i < alumnos; i++) {
					System.out.println(Datos[i][0]);
					
				}
			}
			if (opcion==2) {
				System.out.println("Asignaturas: ");
				System.out.println("");
				for (int i = 1; i < asignaturas; i++) {
					System.out.println(Datos[0][i]);
				}
			}
			if (opcion==3) {
				System.out.print("Introduzca el nombre del alumno: ");
				String buscador = teclado.next();
				System.out.println("- - - - - - - - - - - - - - - - -");
				for (int i = 0; i < alumnos; i++) {
					if(buscador.compareToIgnoreCase(Datos[i][0])==0) {
						System.out.println("Notas de "+Datos[i][0]+":");
						System.out.println("");
						for (int j = 1; j < asignaturas; j++) {
							System.out.print(Datos[0][j]+": ");
							System.out.println(Datos[i][j]);
						}
					existe = true;
					}
				}
				if (existe == false) {
					System.out.println("Ese alumno no se encuentra en el registro");
				}
			}
			if (opcion==4) {
				salida = 1;
				
			}
		}
		System.out.print("¡Gracias por usar Notas Cutres v1.1!");
		teclado.close();
	}
}
