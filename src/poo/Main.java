package poo;

public class Main {

	public static void main(String[] args) {
		RepositorioContasArray repo = new RepositorioContasArray();
		
		ContaAbstrata conta1 = new ContaBonificada("123456", 0);
		ContaAbstrata conta2 = new Poupanca("654321", 0);
		ContaAbstrata conta3 = new Conta("123456", 200);
		ContaAbstrata conta5, conta6;
		
		repo.inserir(conta1);
		repo.inserir(conta2);
		
		System.out.println("A conta 123456 existe?\n\t" + repo.existe("123456"));
		System.out.println("A conta 542671 existe?\n\t" + repo.existe("542671"));
		
		conta5 = repo.procurar("654321");
		conta6 = repo.procurar("542671");
		
		System.out.println("Conta 5:\n\t" + conta5);
		System.out.println("Conta 6:\n\t" + conta6);
		
		repo.atualizar(conta3);
		System.out.println("Atualizar:\n\t" + repo.procurar("123456"));
		
		System.out.println(repo);
		
		
/** //	Aula 2 - Repositórios
 * 		Conta cb, cp;
		
		cb = new ContaBonificada("123.45-6", 0);
		cp = new Poupanca("654.32-1", 0);
		
		cb.creditar(500);
		cp.creditar(200);
		
		System.out.println(cb);
		System.out.println(cp + "\n");
		
		((ContaBonificada) cb).renderBonus();
		((Poupanca) cp).renderJuros();
		
		System.out.println(cb);
		System.out.println(cp + "\n");
*/		
		
/** //	Aula 1 - Herança/Polimorfismo
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.setNumero("123546");
		conta1.setSaldo(3000);
		
		conta2.setNumero("564546");
		conta2.setSaldo(8000);
		
//		conta1.sacar(500);
		
		System.out.println("Saldo antes da transferencia");
		System.out.println("Saldo conta1: " + conta1.getSaldo());
		System.out.println("Sando conta2: " + conta2.getSaldo() + "\n");
		
		conta1.transferir (conta2, 600);
		
		System.out.println("Saldo ap�s transferir 600 da conta1 para a conta2");
		System.out.println("Saldo conta1: " + conta1.getSaldo());
		System.out.println("Sando conta2: " + conta2.getSaldo() + "\n");
		
		conta2.transferir(conta1, 1000);
		
		System.out.println("Saldo ap�s transferir 1000 da conta2 para a conta1");
		System.out.println("Saldo conta1: " + conta1.getSaldo());
		System.out.println("Sando conta2: " + conta2.getSaldo() + "\n");
*/
	}

}
