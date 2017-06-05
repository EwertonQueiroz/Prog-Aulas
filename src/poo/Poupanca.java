package poo;

public class Poupanca extends Conta {
	private final double rendimento = 0.006;
	
	public Poupanca () {}
	
	public Poupanca (String numero, double saldo) {
		super(numero, saldo);
	}
	
	public double getRendimento () {
		return this.rendimento;
	}
	
	public void renderJuros () {
		double valor = getSaldo() * this.rendimento;
		super.creditar(valor);
	}
	
	public String toString () {
		return "Conta Poupança:\n\t[Número: " + super.getNumero() + ", Saldo: R$" + super.getSaldo() + ", Rendimento: " + this.getRendimento() * 100 + "%]";
	}
}
