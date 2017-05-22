
public class Main {
	
	static void divide (int x, int y) {
		if (y == 0) {
			System.out.println("Operação não permitida!");
		} else {
			System.out.println("Resultado: " + x / y); 
		}
	}
	
	public static void main (String[] args) {
		Testes t = new Testes();
		t.dividir(2, 3);
		divide (5, 3);
		t.ler_ordenar();
		t.ler_ordenar2();
	}
}