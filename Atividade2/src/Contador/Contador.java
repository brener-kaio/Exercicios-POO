package Contador;

public class Contador {
	private int numero;
	int incrementa;
	int desfaz;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int incrementa() {
		return (numero + 1);
	}
	
	public int desfaz () {
		return (incrementa() -1);
	}
	

}
