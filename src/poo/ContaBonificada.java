package poo;

public class ContaBonificada extends Conta {
	private double bonus;
	
	public ContaBonificada () {}
	
	public ContaBonificada (String numero, double saldo) {
		super(numero, saldo);
		this.bonus = 0;
	}
	
	double getBonus () {
		return this.bonus;
	}

	public void creditar (double quantidade) {
		this.bonus += quantidade * 0.01;
		super.creditar(quantidade);
	}
	
	public void renderBonus () {
		super.creditar(getBonus());
		this.bonus = 0;
	}
	
	public String toString () {
		return "Conta Bonificada:\n\t[Número: " + super.getNumero() + ", Saldo: R$" + super.getSaldo() + ", Bônus: R$" + this.getBonus() + "]";
	}
}
