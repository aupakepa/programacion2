/*6. Escribe un programa que pida por teclado una frase y cambie cada ocurrencia de la
palabra “si” por la palabra “no”. Después lo muestra por pantalla.*/
import java.util.Scanner;
public class st26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String resultado="";
		String frase="";
		do{
			System.out.println("Una frase pls(emoji de manitas), y que tenga sies");
			frase = teclado.nextLine();
			frase = frase.toLowerCase();
		}
		while(frase.indexOf("si")==-1); // Forzamos que la frase tenga Si
		
		int i = -2;
		int j = 0;
		while(i!=-1){
			i = frase.indexOf("si",i+2);
			if (i!=-1){
				resultado = resultado + frase.substring(j,i)+"no";
				j = i+2;
			}
		}
		System.out.println(resultado+frase.substring(j));
		teclado.close();
	}

}
