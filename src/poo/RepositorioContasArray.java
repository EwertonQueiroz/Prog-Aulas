package poo;

public class RepositorioContasArray {
	
	private Conta[] contas;
	private int indice;
	
	private static final int TAMANHO = 100;
	
	public RepositorioContasArray () {
		this.contas = new Conta[TAMANHO];
		this.indice = 0;
	}
	
	private int getIndice (String numero) {
		int aux = -1;
		
		for (int i = 0; i < this.indice; i++) { 
			if (this.contas[i].getNumero().equalsIgnoreCase(numero)) {
				aux = i;
				break;
			}
		}
		
		return aux;
	}
	
	public void inserir (Conta conta) {
		this.contas[this.indice++] = conta;
	}
	
	public Conta procurar (String numero) {
		Conta aux = null;
		
		for (int i = 0; i < this.indice; i++) {
			//System.out.println(conta.getNumero());
			if (this.contas[i].getNumero().equalsIgnoreCase(numero)) {
				aux = this.contas[i];
				break;
			}
		}
		
		return aux;
	}
	
	public void remover (String numero) {
		int aux = this.getIndice(numero);
		this.contas[aux] = null;
	}
	
	public void atualizar (Conta conta) {
		int aux = this.getIndice(conta.getNumero());
		if (aux != -1)
			this.contas[aux] = conta;
	}
	
	public boolean existe (String numero) {
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