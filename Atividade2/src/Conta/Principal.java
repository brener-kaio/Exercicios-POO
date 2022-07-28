package Conta;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente operacoesConta = new ContaCorrente();
		
		operacoesConta.setSaldo(50);
		operacoesConta.depositar(10);
		System.out.println(operacoesConta.exibirExtrato());
		operacoesConta.sacar(20);
		
		System.out.println(operacoesConta.exibirExtrato());
		
		
		
		

	}

}
