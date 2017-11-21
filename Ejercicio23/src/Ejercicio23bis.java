
public class Ejercicio23bis {

	public static void main(String[] args) {
		String texto;
		int contador, veces;
		texto="";
		contador = 1;
		veces = 1;
		do {
			texto= texto+"\t"+contador;
			if(veces==10) {
			System.out.println(texto);
			veces=1;
			texto="";
			}
			else {
			veces++;
			}
			contador++;
			
		} while (contador<=100);
		System.out.println(texto);//solo es necesaria si no acabamos justo cada diez
	}
}
