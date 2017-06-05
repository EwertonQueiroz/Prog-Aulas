package poo;

public class Main {

	public static void main(String[] args) {
		Conta cb, cp;
		
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
		
		
/** //	Aula 1
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
