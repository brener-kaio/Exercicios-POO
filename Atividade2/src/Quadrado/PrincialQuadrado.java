package Quadrado;

public class PrincialQuadrado {

	public static void main(String[] args) {
		Quadrado dadosQuadrado = new Quadrado();
		 
		dadosQuadrado.setLado(8);
		dadosQuadrado.calcularArea();
		
		System.out.println("Os lados do quadrado são "+dadosQuadrado.getLado());
		System.out.println("A area do quadrado é "+dadosQuadrado.calcularArea());
		

	}

}
