package array;

public class Main {

	public static void main(String[] args) {
		
		MeuArray a = new MeuArray(9, 3, 5, 3, 2);
		
		System.out.println("Contagem do elemento 3: " + a.countNumber(3) + "\n");
		
		System.out.println("Soma dos elementos: " + a.getSum() + "\n");
		
		System.out.println("Maior elemento do Array: " + a.getGreater() + "\n");
		
		System.out.println("Elementos do array:");
		a.print();
		
		System.out.println("\nArray invertido:");
		a.changePosition();		
		
	}

}
