package poo;

public class Fachada {
	private CadastroConta contas;
	private static Fachada instance;
	
	public Fachada () {
		RepositorioContas repositorioContas = new RepositorioContasArray();
		contas = new CadastroConta(repositorioContas);
	}
	
	public static Fachada getInstance () {
		if (Fachada.instance == null)
			Fachada.instance = new Fachada();
		
		return Fachada.instance;
	}
	
	public void inserir (ContaAbstrata conta) {
		this.contas.inserir(conta);
	}
	
	public ContaAbstrata procurar (String numero) {
		return this.contas.procurar(numero);
	}
	
	public void remover (String numero) {
		this.contas.remover(numero);
	}
	
}
