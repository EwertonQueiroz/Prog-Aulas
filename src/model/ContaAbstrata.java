package model;

public abstract class ContaAbstrata {
	private String numero;
	private double saldo;
	
	public ContaAbstrata (String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public ContaAbstrata () {}
	
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
	
	public void creditar (double quantidade) {
		this.saldo += quantidade;
	}
	
	public void transferir (ContaAbstrata conta_destino, double qtd) {
		if (this.getSaldo() < qtd) {
			System.out.println("Saldo insuficiente!");
		} else {
			conta_destino.creditar(qtd);
			this.sacar(qtd);
		}
	}
	
	public abstract void sacar (double quantidade);
}
