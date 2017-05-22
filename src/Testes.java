import java.util.Scanner;

public class Testes {

	/** Exercício 1: Escrever um programa que receba 2 números como parâmetros, realize a divisão do primeiro pelo segundo e os imprima.
	 * Impedir divisão por 0.
	 * @param x
	 * @param y
	 */
	void dividir (float x, float y) {
		if (y == 0) {
			System.out.println("Operação não permitida!");
		} else {
			System.out.printf("Resultado: %.2f\n\n", x / y); 
		}
	}
	
	/** Exercício 2: Escreva um programa que leia três números inteiros do teclado e os imprima na tela em ordem ascendente.
	 * 
	 */
	void ler_ordenar () {
		int[] x = new int[3];
		int aux = 0;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
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
			System.out.println("Digite o " + (i + 1) + "º número: ");
			x[i] = s.nextInt();
		}
		s.close();
//		
		
		System.out.println(x[0] > x[1] ? ("[" + x[1] + ", " + x[0] + "]") : ("[" + x[0] + ", " + x[1] + "]"));
	}
	
}
