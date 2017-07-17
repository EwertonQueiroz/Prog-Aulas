package controller;

import model.RepositorioContas;

public class CadastroConta {
	private RepositorioContas contas;
	
	public CadastroConta (RepositorioContas repositorio) {
		this.contas = repositorio;
	}

	public void inserir (ContaAbstrata conta) {
		if (conta != null)
			if (!(this.contas.existe(conta.getNumero())))
				this.contas.inserir(conta);
			else
				System.out.println("Conta j� cadastrada!");
		else
			System.out.println("Conta inv�lida.");
	}

	public ContaAbstrata procurar (String numero) {
		return this.contas.procurar(numero);
	}

	public void remover (String numero) {
		if (this.contas.existe(numero))
			this.contas.remover(numero);
		else
			System.out.println("Conta n�o encontrada.");
	}

	public void atualizar (ContaAbstrata conta) {
		if (conta != null)
			if (this.contas.existe(conta.getNumero()))
				this.contas.atualizar(conta);
			else
				System.out.println("Conta n�o encontrada.");
		else
			System.out.println("Conta inv�lida.");
	}

}
