package Conta;

public class ContaCorrente {
	private double saldo;
	double depositar;
	double sacar;
	double exibirExtrato;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double depositar){
		this.saldo += depositar;
		
	}
	
	public void sacar (double Saque) {
		this.saldo-=( Saque+ (Saque*0.5));
	}
	public double exibirExtrato() {
		return this.saldo;
	}

}
