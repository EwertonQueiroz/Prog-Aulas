package POO;

public class Main {

	public static void main(String[] args) {
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
		
		System.out.println("Saldo após transferir 600 da conta1 para a conta2");
		System.out.println("Saldo conta1: " + conta1.getSaldo());
		System.out.println("Sando conta2: " + conta2.getSaldo() + "\n");
		
		conta2.transferir(conta1, 1000);
		
		System.out.println("Saldo após transferir 1000 da conta2 para a conta1");
		System.out.println("Saldo conta1: " + conta1.getSaldo());
		System.out.println("Sando conta2: " + conta2.getSaldo() + "\n");
	}

}
