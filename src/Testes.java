import java.util.Scanner;

public class Testes {

	/** Exerc�cio 1: Escrever um programa que receba 2 n�meros como par�metros, realize a divis�o do primeiro pelo segundo e os imprima.
	 * Impedir divis�o por 0.
	 * @param x
	 * @param y
	 */
	void dividir (float x, float y) {
		if (y == 0) {
			System.out.println("Opera��o n�o permitida!");
		} else {
			System.out.printf("Resultado: %.2f\n\n", x / y); 
		}
	}
	
	/** Exerc�cio 2: Escreva um programa que leia tr�s n�meros inteiros do teclado e os imprima na tela em ordem ascendente.
	 * 
	 */
	void ler_ordenar () {
		int[] x = new int[3];
		int aux = 0;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero: ");
			x[i] = s.nextInt();
		}
		
		s.close();
		
		for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i] < x[j]) {
                    aux = x[i];
                    x[i] = x[j];
                    x[j] = aux;
                }
            }
        }

		System.out.println("[" + x[0] + ", " + x[1] + ", " + x[2] + "]");
	}
	
	void ler_ordenar2 () {
		int[] x = new int[2];
		
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero: ");
			x[i] = s.nextInt();
		}
		s.close();
//		
		
		System.out.println(x[0] > x[1] ? ("[" + x[1] + ", " + x[0] + "]") : ("[" + x[0] + ", " + x[1] + "]"));
	}
	
}
