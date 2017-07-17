package controller;

import aula15.br.ufrpe.deinfo.dados.ExceptionContaNaoEncontrada;
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

	public ContaAbstrata procurar (String numero) throws ExceptionContaNaoEncontrada {
		return this.contas.procurar(numero);
	}

	public void remover (String numero) throws ExceptionContaNaoEncontrada {
		this.contas.remover(numero);
			
	}

	public void atualizar (ContaAbstrata conta) throws ExceptionContaNaoEncontrada {
		if (conta != null)
			if (this.contas.existe(conta.getNumero()))
				this.contas.atualizar(conta);
			else
				System.out.println("Conta n�o encontrada.");
		else
			System.out.println("Conta inv�lida.");
	}

}
