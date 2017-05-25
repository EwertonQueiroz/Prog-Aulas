package array;

public class MeuArray {
	
	MeuArray(int a, int b, int c, int d, int e) {
		this.array = new int[5];
		
		array[0] = a;
		array[1] = b;
		array[2] = c;
		array[3] = d;
		array[4] = e;
	}
	
	private int[] array;
	
	int getSum () {
		int sum = 0;
		
		for (int i = 0; i < this.array.length; i++) {
			sum += this.array[i];
		}
		
		return sum;
	}
	
	int getGreater () {
		int aux;
		int[] v = new int[this.array.length];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = this.array[i];
		}
		
		
		for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i] < v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
		
		return v[v.length - 1];
	}
	
	int countNumber (int x) {
		int count = 0;
		
		for (int i = 0; i < this.array.length; i++) {
			if (x == this.array[i])
				count++;
		}
		
		return count;
	}
	
	void changePosition () {
		int[] aux = new int[this.array.length];
		int a = 0;

		for (int j = aux.length - 1; j >= 0; j--) {
			aux[a++] = this.array[j];
		}
		
		System.out.print("[");
		
		for (int i = 0; i < aux.length; i++) {
			System.out.print(aux[i]);
			
			if (i != aux.length - 1)
				System.out.print(", ");
		}
		
		System.out.println("]");
	}
	
	void print () {
		System.out.print("[");
		
		for (int i = 0; i < this.array.length; i++) {
			System.out.print(array[i]);
			
			if (i != this.array.length - 1)
				System.out.print(", ");
		}
		
		System.out.println("]");
	}
}
