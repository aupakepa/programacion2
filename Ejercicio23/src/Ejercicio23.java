/** 23 hacer programa que imprima del 1 al 100 controlando filas y columnas
 */
public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String texto;
	int contador, veces;
	texto="";
	contador = veces = 1;
	for(contador=1;contador<=100;contador++) {
		texto= texto+"\t"+contador;
		if(veces==10) {
			System.out.println(texto);
			veces=0;
			texto="";
			}
		veces++;
		}
	}

}
