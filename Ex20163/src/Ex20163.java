import java.util.Scanner;

public class Ex20163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fechanac ="";
		String fechahoy ="";
		int mes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner teclado = new Scanner(System.in);
		int error = 0;
		do {
			System.out.println("introduzca una fecha de nacimiento ddmmaa");	
			fechanac = teclado.nextLine();
			System.out.println("introduzca la fecha de hoy ddmmaa");	
			fechahoy = teclado.nextLine();
			if (fechanac.length()!=6 || fechahoy.length() != 6 ) {
				error=-1;
			}
			for (int i = 0; i < fechahoy.length(); i++) {
				if (fechahoy.charAt(i) < '0' || fechahoy.charAt(i) > '9') {
					error = -1;
				}
			}
			for (int i = 0; i < fechanac.length(); i++) {
				if (fechanac.charAt(i) < '0' || fechanac.charAt(i) > '9') {
					error = -1;
				}
			}
		} while (error == -1);
		
		int añonac = Integer.parseInt(fechanac.substring(4, 6));
		int mesnac = Integer.parseInt(fechanac.substring(2, 4));
		int dianac = Integer.parseInt(fechanac.substring(0, 2));
		int añohoy = Integer.parseInt(fechahoy.substring(4, 6));
		int meshoy = Integer.parseInt(fechahoy.substring(2, 4));
		int diahoy = Integer.parseInt(fechahoy.substring(0, 2));
		int nacimiento = 0;
		int hoy = 0;
		if(añonac>añohoy) {//cambio de variable para los cambios de siglos
			añohoy = añohoy + 100;
		}
		//dias hasta principio de siglo desde nacimiento
		
		nacimiento = dianac;//sumo los dias del mes que llevamos
		for (int i = 0; i < mesnac - 1; i++) {
			nacimiento = nacimiento + mes[i];//sumo los dias de los meses que llevamos
		}
		
		nacimiento = nacimiento + 365*añonac;//sumo los dias de los años
		for (int i = 0; i < añonac ; i++) {
			if (i % 4 == 0) {
				nacimiento = nacimiento + 1;//añado los dias bisiestos
			}
		}
		if (añonac%4 == 0 && mesnac>2) {
			nacimiento = nacimiento+1;
		}
		
		//dias hasta principio de siglo desde hoy
		hoy = diahoy;//sumo los dias del mes que faltan
		for (int i = 0; i < meshoy-1; i++) {
			hoy = hoy + mes[i];//sumo los dias de los meses que faltan
		}
		hoy = hoy + 365 * añohoy;//sumo los dias de los años
		for (int i = 0; i < añohoy ; i++) {
			if (i % 4 == 0) {
				hoy = hoy + 1;//añado los dias bisiestos
			}	
		}
		if (añohoy % 4 == 0 && meshoy > 2) {
			hoy = hoy+1;
		}
		System.out.println("han pasado "+(hoy - nacimiento)+" dias desde tu nacimiento");
		teclado.close();
	}

}
