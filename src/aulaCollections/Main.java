package aulaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		String[] array0 = {"A", "B", "C"};
		String[] array1 = {"D", "E", "F"};
		
		List<String> lista = new LinkedList<String>();
		lista.addAll(Arrays.asList(array0));
		
		List<String> array = new ArrayList<String>();
		array.addAll(Arrays.asList(array1));
		
		List<String> vetor = new Vector<String>(lista);
		vetor.addAll(array);
		
		System.out.println("------- Utilizando alguns métodos ----------");
		
		System.out.println("Tamanho: " + lista.size());
		
		lista.set(2, "B");
		System.out.println("Indice 2: " + lista.get(2));
		
		lista.add(3, "K");
		System.out.println("Tamanho: " + lista.size());
		
		lista.remove("A");
		System.out.println("Tamanho: " + lista.size());
		
		System.out.println("Indice de C: " + lista.indexOf("C"));
		System.out.println("Sublista: " + lista.subList(0, 3));
	}

}
