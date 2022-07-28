package Contador;

public class PrincipalContador {

	public static void main(String[] args) {
		Contador operacaoContador = new Contador();
		
		operacaoContador.setNumero(8);
		operacaoContador.incrementa();
		operacaoContador.desfaz();
		
		System.out.println(operacaoContador.incrementa());
		System.out.println(operacaoContador.desfaz());

	}

}
