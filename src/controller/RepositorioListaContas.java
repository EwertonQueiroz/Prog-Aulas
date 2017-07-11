package controller;

import model.Conta;
import model.ContaAbstrata;

public class RepositorioListaContas implements RepositorioContas {
	
	private ContaAbstrata conta;
	private RepositorioListaContas proximo;
	
	public RepositorioListaContas getProximo () {
		return this.proximo;
	}
	
	@Override
	public void inserir (ContaAbstrata conta) {
		if (this.conta == null) {
			this.conta = conta;
			proximo = new RepositorioListaContas();
		}
		
		else {
			this.proximo.inserir(conta);
		}
	}

	@Override
	public ContaAbstrata procurar (String numero) {
		ContaAbstrata aux = null;
		
		while (this.getProximo().conta != null) {
			if (this.conta.getNumero() == numero) {
				aux = this.conta;
				break;
			}
		}
		
		return aux;
		
//		if (this.proximo.getProximo().conta == null)
//		return null;
//	
//	else if (this.conta.getNumero() == numero)
//		return this.conta;
//	
//	return this.procurar(numero);
	}

	@Override
	public void remover (String numero) {
		while (this.getProximo().conta != null) {
			if (this.conta.getNumero() == numero) {
				this.conta = null;
			}
		}
	}

	@Override
	public void atualizar (ContaAbstrata conta) {
		if (this.proximo.existe(conta.getNumero())) {
			ContaAbstrata aux = this.proximo.procurar(conta.getNumero());
			this.remover(conta.getNumero());
			this.proximo.inserir(aux);
		}
	}

	@Override
	public boolean existe(String numero) {
		if (this.conta == null)
			return false;

		if (this.conta.getNumero() == numero)
			return true;
		
		if (this.getProximo().conta != null)
			return this.getProximo().existe(numero);
		
		return false;
	}
	
}
