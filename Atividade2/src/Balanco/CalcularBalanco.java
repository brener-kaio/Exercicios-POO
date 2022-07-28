package Balanco;

public class CalcularBalanco {
	private double mes1;
	private double mes2;
	private double mes3;
	double calculoBalanco;
	
		public double getMes1() {
		return mes1;
	}
		public void setMes1(double mes1) {
		this.mes1 = mes1;
	}
		public double getMes2() {
		return mes2;
	}
		public void setMes2(double mes2) {
		this.mes2 = mes2;
	}
		public double getMes3() {
		return mes3;
	}
		public void setMes3(double mes3) {
		this.mes3 = mes3;
	}
		public double calculoBalanco(){
			return (mes1 + mes2 + mes3);
			
		}

	

}
