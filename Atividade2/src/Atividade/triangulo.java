package Atividade;

public class triangulo {

	
		private double base;
		private double altura;
		double calcularArea;
		
		public double getBase(){
			return this.base;
		}
		
		public double getAltura() {
			return this.altura;
		}
		
		public void setBase(double Base) {
			this.base = Base;
		}
		public void setAltura(double Altura) {
			this.altura = Altura;
		}
		
		public double calcularArea() {
			return ((base*altura)/100);
		} 
		

	

}
