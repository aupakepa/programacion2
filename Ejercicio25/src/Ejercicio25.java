import java.util.Scanner;

/**transformar un numero que introducimos menor que 5000 por teclado en Romano
 * 
 * @author jmonf
 *
 */
public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int numero =-1;
		String romano = "";
			while (numero>5000 || numero<0) {
				System.out.println("introduce un numero entre 1-5000");
				numero = teclado.nextInt();
			}
			
			i = numero / 1000;
			switch (i) {
			case 1: romano = romano +"M";
				break;
			case 2: romano = romano +"MM";
				break;
			case 3: romano = romano +"MMM";
				break;
			case 4: romano = romano +"MMMM";
				break;
			default:
				break;
			}
			numero=numero-i*1000;
			i=numero/100;
			switch (i) {
			case 1: romano = romano +"C";
			break;
			case 2: romano = romano +"CC";
			break;
			case 3: romano = romano +"CCC";
			break;
			case 4: romano = romano +"CD";
			break;
			case 5: romano = romano +"D";
			break;
			case 6: romano = romano +"DC";
			break;
			case 7: romano = romano +"DCC";
			break;
			case 8: romano = romano +"DCCC";
			break;
			case 9: romano = romano +"CM";
			break;
			};
			numero = numero-i*100;
			i= numero/10;
			switch (i) {
			case 1: romano = romano +"X";
			break;
			case 2: romano = romano +"XX";
			break;
			case 3: romano = romano +"XXX";
			break;
			case 4: romano = romano +"XL";
			break;
			case 5: romano = romano +"L";
			break;
			case 6: romano = romano +"LX";
			break;
			case 7: romano = romano +"LXX";
			break;
			case 8: romano = romano +"LXXX";
			break;
			case 9: romano = romano +"XC";
			break;
			};
			numero = numero-i*10;
			i= numero/1;
			switch (i) {
			case 1: romano = romano +"I";
			break;
			case 2: romano = romano +"II";
			break;
			case 3: romano = romano +"III";
			break;
			case 4: romano = romano +"IV";
			break;
			case 5: romano = romano +"V";
			break;
			case 6: romano = romano +"VI";
			break;
			case 7: romano = romano +"VII";
			break;
			case 8: romano = romano +"VIII";
			break;
			case 9: romano = romano +"IX";
			break;
			};
			System.out.println(romano);
			teclado.close();
		}
}

