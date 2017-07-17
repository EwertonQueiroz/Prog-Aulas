package model;

import aula15.br.ufrpe.deinfo.dados.ExceptionContaNaoEncontrada;
import controller.ContaAbstrata;

public interface RepositorioContas {
	
	public void inserir (ContaAbstrata conta);
	
	public ContaAbstrata procurar (String numero) throws ExceptionContaNaoEncontrada;
	
	public void remover (String numero) throws ExceptionContaNaoEncontrada;
	
	public void atualizar (ContaAbstrata conta) throws ExceptionContaNaoEncontrada;
	
	public boolean existe (String numero) throws ExceptionContaNaoEncontrada;
}
