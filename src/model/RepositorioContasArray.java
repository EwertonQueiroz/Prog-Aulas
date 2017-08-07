package model;

import aula15.br.ufrpe.deinfo.dados.ExceptionContaNaoEncontrada;
import controller.ContaAbstrata;

public class RepositorioContasArray implements RepositorioContas {
	
	private ContaAbstrata[] contas;
	private int indice;
	private static double saldo_total;
	private static RepositorioContasArray instance;
	
	private static final int TAMANHO = 100;
	
	public RepositorioContasArray () {
		this.contas = new ContaAbstrata[TAMANHO];
		this.indice = 0;
	}
	
	public static RepositorioContasArray getInstance () {
		if (RepositorioContasArray.instance == null)
			RepositorioContasArray.instance = new RepositorioContasArray();
		
		return RepositorioContasArray.instance;
	}
	
	private int getIndice (String numero) throws ExceptionContaNaoEncontrada {
		int aux = -1;
		
		for (int i = 0; i < this.indice; i++) { 
			if (this.contas[i].getNumero().equalsIgnoreCase(numero)) {
				aux = i;
				break;
			}
		}
		
		if (aux == -1) {
			ExceptionContaNaoEncontrada e = new ExceptionContaNaoEncontrada(numero);
			
			throw e;
		}
		
		return aux;
	}
	
	public static double getSaldo_total () {
		return RepositorioContasArray.saldo_total;
	}
	
	public void inserir (ContaAbstrata conta) {
		this.contas[this.indice++] = conta;
		RepositorioContasArray.saldo_total += conta.getSaldo();
	}
	
	public ContaAbstrata procurar (String numero) throws ExceptionContaNaoEncontrada {
		ContaAbstrata aux = null;
		
		for (int i = 0; i < this.indice; i++) {
			if (this.contas[i].getNumero().equalsIgnoreCase(numero)) {
				aux = this.contas[i];
				break;
			}
		}
		
		if (aux == null) {
			ExceptionContaNaoEncontrada e;
			e = new ExceptionContaNaoEncontrada(numero);
			
			throw e;
		}
		
		return aux;
	}
	
	public void remover (String numero) throws ExceptionContaNaoEncontrada {
		int aux = this.getIndice(numero);
		this.contas[aux] = null;
	}
	
	public void atualizar (ContaAbstrata conta) throws ExceptionContaNaoEncontrada {
		int aux = this.getIndice(conta.getNumero());
		if (aux != -1)
			this.contas[aux] = conta;
	}
	
	public boolean existe (String numero) throws ExceptionContaNaoEncontrada {
		if (this.procurar(numero) != null)
			return true;
		
		else
			return false;
	}
	
	// Construir toString por StringBuilder!!
	public String toString () {
		String s = "Repositório Contas Array:\n\t[";
		
		for (int i = 0; i < this.indice; i++) {
			s.concat(this.contas[i].toString());
			s.concat(", ");
		}
		
		s.concat("]");
		
		return s;
	}
}
