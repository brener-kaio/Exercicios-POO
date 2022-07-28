package Trapezio;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	double calcularArea;
	
	public double getBaseMaior() {
		return this.baseMaior;
	}
	
	public double getBaseMenor() {
		return this.baseMenor;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setBaseMaior(double Maior) {
		this.baseMaior = Maior;
	}
	public void setBaseMenor(double Menor) {
		this.baseMenor = Menor;
		}
	
	public void setAltura(double Altura) {
		this.altura = Altura;
		}

	double calcularArea() {
		return ((baseMaior+baseMenor)*altura)/2;
	}
}
