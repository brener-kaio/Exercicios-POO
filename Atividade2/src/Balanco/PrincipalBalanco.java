package Balanco;

public class PrincipalBalanco {

	public static void main(String[] args) {
		CalcularBalanco calculoTrimestre = new CalcularBalanco();
		
		calculoTrimestre.setMes1(5);
		calculoTrimestre.setMes2(5);
		calculoTrimestre.setMes3(5);
		calculoTrimestre.calculoBalanco();
		
		
		System.out.println("O gasto nesse Trimestre foi de:"+ calculoTrimestre.calculoBalanco());	

	}

}
