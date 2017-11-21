import java.util.Scanner;
public class Ejercicio35bis {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
			int notas [][] = new int [7][6];
			String asignaturas [] = {"--sistemas--","----BBDD","Programacion","Entornos---","-----Fol-----","---Marcas----","---Ingles----"};
			String alumnos [] = {"Alumno1","Alumno2","Alumno3","Alumno4","Alumno5","Alumno6"};
			for (int k = 0; k < 7; k++) {
				for (int j = 0; j < 6; j++) {
					int i = (int) (Math.random()*11);
					notas[k][j]=i;
				}	
			}
			int menu = 0;
			while (menu<1||menu>=5 ) {
				System.out.println("introduzca una opcion");
				System.out.println("Pulse 1 saber notas por Asignatura");
				System.out.println("Pulse 2 saber notas por alumno");
				System.out.println("Pulse 3 Encontrar un nota en alumnos y asignaturas");
				System.out.println("Pulse 4 Imprimir notas");
				System.out.println("Pulse 5 Salir programa");
				menu =sc.nextInt();
				switch (menu) {
				case 1: System.out.println("introduzca el numero de la asignatura");
				System.out.println("1.sistemas");
				System.out.println("2.BBDD");
				System.out.println("3.Programacion");
				System.out.println("4.entornos");
				System.out.println("5.fol");
				System.out.println("6.marcas");
				System.out.println("7.Ingles");

				int asig = 0 ;
				asig = sc.nextInt();
				System.out.println("En la asignatura de "+asignaturas[asig-1]+"   las notas han sido");
				for (int j = 0; j < 6; j++) {
					System.out.println(alumnos[j]+" "+notas[asig-1][j]);
					menu=-1;
				}
				break;
				case 2: System.out.println("introduzca el numero de alumno del 1 al 6");
				int alu = sc.nextInt();
				System.out.println(" el "+alumnos[alu-1]+"  ha sacado las siguientes notas");
				for (int j = 0; j < 7; j++) {
					System.out.println(asignaturas[j]+" "+notas[j][alu-1]);
					menu=-1;
				}	
				break;
				case 3: System.out.println("introducir una nota para saber que alumno en que asignatura lo ha sacado");
				int not = sc.nextInt();
				for (int i = 0; i < 7; i++) {
					for (int j = 0; j < 6; j++) {
						if (notas[i][j] == not) {
							System.out.println(alumnos[j]+" "+ asignaturas[i]+" "+notas[i][j]);	
						}
						menu=-1;
					}
				}
				break;
				case 4:for (int j = 0; j < 7; j++) {
					System.out.printf("%-13s   ",asignaturas[j]);
				}
				System.out.println("\n");
					for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 7; j++) {
						System.out.printf("%-10s%02d    ",alumnos[i],notas[j][i]);
					}
					System.out.println("\n");
				}
				menu=-1;

				break;			

				case 5:menu=1;
				sc.close();

				break;
				}
			}
		}
	}


