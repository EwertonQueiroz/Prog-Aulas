package poo;

public class Conta {
	private String numero;
	private double saldo;
	
	public String getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumero (String numero) {
		this.numero = numero;
	}
	
	public void setSaldo (double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			System.out.println("N�o � poss�vel saldo negativo!");
		}
	}
	
	public void sacar (double quantidade) {
		if (quantidade > this.saldo) {
			System.out.println("N�o posso sacar fora do limite!");
		} else {
			this.saldo -= quantidade;
		}
	}
	
	public void creditar (double quantidade) {
		this.saldo += quantidade;
	}
	
	public void transferir (Conta conta_destino, double qtd) {
		if (this.getSaldo() < qtd) {
			System.out.println("Saldo insuficiente!");
		} else {
			conta_destino.creditar(qtd);
			this.sacar(qtd);
		}
	}
}
