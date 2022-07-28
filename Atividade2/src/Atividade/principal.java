package Atividade;

public class principal {

	public static void main(String[] args) {
		triangulo dadosTriangulo  = new triangulo();
		
		dadosTriangulo.setBase(5);
		dadosTriangulo.setAltura(10);
		dadosTriangulo.calcularArea();
		
		System.out.println("A base do trinagulo é "+dadosTriangulo.getBase());
		System.out.println("A Altura do trinagulo é "+dadosTriangulo.getAltura());
		System.out.println("A area do triangulo é "+dadosTriangulo.calcularArea());



	}

}
