package Numero;

public class PrincipalNumero {

	public static void main(String[] args) {
		inverter trocaValores = new inverter();
		
		trocaValores.setNum1(6);
		trocaValores.setNum2(2);
		System.out.println(trocaValores.getNum1()+"/"+trocaValores.getNum2());
		trocaValores.troca(0);
		
		System.out.println(trocaValores.getNum1()+"/"+trocaValores.getNum2());

	}

}
