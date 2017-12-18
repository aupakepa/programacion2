
public class Hora {

	
	private int hora;
	private int minuto;
	private int segundo;
	
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
	public void imprimirHora(){
		System.out.printf("%02d:%02d:%02d\n",this.getHora(),this.getMinuto(),this.getSegundo());
	}
}


