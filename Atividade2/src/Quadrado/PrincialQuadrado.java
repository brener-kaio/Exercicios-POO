package Quadrado;

public class PrincialQuadrado {

	public static void main(String[] args) {
		Quadrado dadosQuadrado = new Quadrado();
		 
		dadosQuadrado.setLado(8);
		dadosQuadrado.calcularArea();
		
		System.out.println("Os lados do quadrado s�o "+dadosQuadrado.getLado());
		System.out.println("A area do quadrado � "+dadosQuadrado.calcularArea());
		

	}

}
