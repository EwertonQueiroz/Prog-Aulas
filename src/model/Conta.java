package model;

public class Conta extends ContaAbstrata {
	
	public Conta () {}
	
	public Conta (String numero, double saldo) {
		super(numero, saldo);
	}
	
	public void sacar (double quantidade) {
		if (quantidade > super.getSaldo()) {
			System.out.println("N�o posso sacar fora do limite!");
		} else {
			super.setSaldo(super.getSaldo() - quantidade);
		}
	}
	
	public String toString () {
		return "Conta Poupança:\n\t[Número: " + this.getNumero() + ", Saldo: R$" + this.getSaldo() + "]";
	}
}
