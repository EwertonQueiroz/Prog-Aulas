package controller;

public class ContaImposto extends ContaAbstrata{
	private static final double TAXA = 0.001;
	
	public ContaImposto (String numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void sacar(double quantidade) {
		double saque = quantidade + (quantidade * ContaImposto.TAXA);
		if (super.getSaldo() < saque) {
			System.out.println("Não é possível sacar!");
		} else {
			super.setSaldo(super.getSaldo() - saque);
		}
	}

}
