package controller;

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
			this.proximo = new RepositorioListaContas();
		}
		
		else
			this.proximo.inserir(conta);
	}

	@Override
	public ContaAbstrata procurar (String numero) {
		if (this.conta == null)
			return null;
		
		else if (this.conta.getNumero() == numero)
			return this.conta;
		
		return this.proximo.procurar(numero);
	}

	@Override
	public void remover (String numero) {
		if (this.existe(numero))
			if (this.conta == null)
				return;
			
			/** Aqui vai dar erro quando tiver numa lista grande pois o "proximo" do anterior não está sendo atualizado,
			 *  logo, após uma remoção, haverá um elemento nulo no meio da lista, dando origem a uma lista que pode
			 *  ser acessada pela cabeça e outra que está inacessível.
			 */
			else if (this.conta.getNumero() == numero) {
				this.conta = this.proximo.conta;
//				this.conta = null;
			}
		
		else
			this.proximo.remover(numero);
	}

	@Override
	public void atualizar (ContaAbstrata conta) {
		if (conta != null)
			if (this.existe(conta.getNumero())) {
				ContaAbstrata aux = this.procurar(conta.getNumero());
				this.remover(conta.getNumero());
				this.proximo.inserir(aux);
			}
		
		else
			System.out.println("Conta inválida.");
	}

	@Override
	public boolean existe(String numero) {
		
		if (this.conta == null)
			return false;

		else if (this.conta.getNumero() == numero)
			return true;
		
		return this.proximo.existe(numero);
	}
	
}
