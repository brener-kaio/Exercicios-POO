package Trapezio;


public class principalTrapezio {

	public static void main(String[] args) {
		Trapezio dadosTrapezio  = new Trapezio();
		
		dadosTrapezio.setBaseMaior(15);
		dadosTrapezio.setBaseMenor(10);
		dadosTrapezio.setAltura(20);
		dadosTrapezio.calcularArea();
		
		System.out.println("A base maior do trapezio é "+dadosTrapezio.getBaseMaior());
		System.out.println("A base menor do trapezio é "+dadosTrapezio.getBaseMenor());
		System.out.println("A Altura do Trapezio é "+dadosTrapezio.getAltura());
		System.out.println("A area do Trapezio é "+dadosTrapezio.calcularArea());

		
	}

}
