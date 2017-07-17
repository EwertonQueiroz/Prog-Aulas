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
				System.out.println("Conta já cadastrada!");
		else
			System.out.println("Conta inválida.");
	}

	public ContaAbstrata procurar (String numero) {
		return this.contas.procurar(numero);
	}

	public void remover (String numero) {
		if (this.contas.existe(numero))
			this.contas.remover(numero);
		else
			System.out.println("Conta não encontrada.");
	}

	public void atualizar (ContaAbstrata conta) {
		if (conta != null)
			if (this.contas.existe(conta.getNumero()))
				this.contas.atualizar(conta);
			else
				System.out.println("Conta não encontrada.");
		else
			System.out.println("Conta inválida.");
	}

}
