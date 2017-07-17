package aula15.br.ufrpe.deinfo.dados;

public class ExceptionContaNaoEncontrada extends Exception {
	
	private String numero;
	
	public ExceptionContaNaoEncontrada (String numero) {
		super("Conta não encontrada.");
		this.numero = numero;
	}
	
	public String getNumero () {
		return this.numero;
	}
}
