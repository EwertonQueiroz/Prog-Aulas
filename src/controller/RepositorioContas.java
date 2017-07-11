package controller;

import model.ContaAbstrata;

public interface RepositorioContas {
	
	public void inserir (ContaAbstrata conta);
	
	public ContaAbstrata procurar (String numero);
	
	public void remover (String numero);
	
	public void atualizar (ContaAbstrata conta);
	
	public boolean existe (String numero);
}
