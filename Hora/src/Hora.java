import java.util.Scanner;

public class Hora {

	
	private int hora = 0;
	private int minuto = 0;
	private int segundo = 0;
	
	public Hora(int mhora, int mminuto, int msegundo) {
		if (mhora >= 0 && mhora < 24){
			this.hora = mhora;
		}
		else{
			this.hora = 0;
		}
		if (mminuto >= 0 && mminuto < 60){
			this.minuto = mminuto;
		}
		else{
			this.minuto = 0;
		}
		if (msegundo >= 0 && msegundo < 60){
			this.segundo = msegundo;
		}
		else{
			this.segundo = 0;
		}
	}

	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if (hora < 24 && hora >= 0){
			this.hora = hora;
		}
		else{
			System.out.println("la hora introducida no es correcta");
			hora = 0;
		}
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if (minuto < 60 && minuto >= 0){
			this.minuto = minuto;
		}
		else{
	System.out.println("los minutos introducidos no son correctos");
			minuto = 0;
		}
	}	
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if (segundo < 60 && segundo >= 0){
			this.segundo = segundo;
		}
		else{
			System.out.println("los segundos introducidos no son correctos");
			segundo = 0;
		}
	}
	public int segundosHora(int hora) {
		int segundos=0;
		while (hora > 0){
			hora--;
			segundos=segundos+3600;
		}
		return segundos;
	}
	public void suma (int mhora, int mminuto, int msegundo){
	
		this.segundo = this.segundo + msegundo;
		if (this.segundo >= 60){
			this.minuto = this.minuto + 1;
			this.segundo = this.segundo -60;
		}
		this.minuto = this.minuto + mminuto;
		if (this.minuto >= 60){
			this.hora= this.hora + 1;
			this.minuto = this.minuto - 60;
		}
		this.hora = this.hora + mhora;
		if (this.hora >= 24){
			this.hora = this.hora - 24;
		}
	}
	public void imprimirHora(){
		System.out.printf("%02d:%02d:%02d\n",this.getHora(),this.getMinuto(),this.getSegundo());
	}
	public void introducirHora(Scanner teclado, Hora reloj) {
		System.out.println("introduzca horas");
		reloj.setHora(teclado.nextInt());
		
		System.out.println("introduzca minutos");
		reloj.setMinuto(teclado.nextInt());
		
		System.out.println("introduzca segundos");
		reloj.setSegundo(teclado.nextInt());
	}
	public void funcionReloj() throws InterruptedException{
		int hora= this.hora;
		int minutos=this.minuto;
		int segundos=this.segundo;
		while(segundos<=60) {
			if (segundos==60) {
				segundos = 0;
				minutos++;
			}
			if (minutos==60){
				minutos=0;
				hora++;
			}
			if (hora==24) {
				hora = 0;
			}
			System.out.printf("%02d:%02d:%02d\n",hora,minutos,segundos);
			segundos++;
			Thread.sleep(1000);
		}
	}
}


