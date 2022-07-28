package Relogio;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	String mostrarHora = "";
	
	public int getHora() {
		return this.hora;
	}
	
	public int getMinuto() {
		return this.minuto;
	}
	
	public int getSegundo() {
		return this.segundo;
	}
	
	public void setHora(int Hora) {
		this.hora  = Hora;
	}
	
	public void setMinuto(int Minuto) {
		this.minuto  = Minuto;
	}
	
	public void setSegundo(int Segundo) {
		this.segundo  = Segundo;
	}
	
	public String mostrarHora() {
		return this.hora + ":"+ this.minuto + ":"+ this.segundo;
	}



}
