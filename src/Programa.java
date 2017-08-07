import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Programa {

//	public static void caixaAlta(List<String> lista){
//		  for (int i = 0; i < lista.size(); i++) {
//		    String cor = lista.get(i);
//		    lista.set(i, cor.toUpperCase());
//		  }
//		}
//	
//	public static void caixaAlta2(List<String> lista){
//		  ListIterator<String> li = lista.listIterator();
//		  while(li.hasNext()){
//		    String cor = li.next();
//		    li.set(cor.toUpperCase());
//		  }
//		}


	public static void main(String[] args) {
		
//		String[] cores1 = {"Azul", "Vermelho", "Verde"};
//		List<String> listaRGB = new LinkedList<String>();
//		for (String cor : cores1) {
//		  listaRGB.add(cor);
//		}
//		listaRGB.sort(null);
//		System.out.println("-------- Imprimindo ListaRGB-------------");
//		for(int i=0; i< listaRGB.size();i++){
//			System.out.println(listaRGB.get(i));	     
//		}
//
//		String[] cores2 = {"Amarelo", "Margenta", "Ciano"};
//		List<String> listaMCY = new ArrayList<String>();
//
//		listaMCY.addAll(Arrays.asList(cores2));
//
//		System.out.println("-------- Imprimindo ListaMCY-------------");
//		for(int i=0; i< listaMCY.size();i++){
//			System.out.println(listaMCY.get(i));
//		}
//		
//		List<String> cores = new Vector<String>(listaRGB);
//		cores.addAll(listaMCY);
//
//		System.out.println("---------Imprimindo cores AULA------------");
//		for(int i=0; i< cores.size();i++){
//			System.out.println(cores.get(i).toString());
//		}
//		
//		System.out.println("---------Imprimindo cores------------");
//		caixaAlta(cores);
//		for(int i=0; i< cores.size();i++){
//			System.out.println(cores.get(i).toString());
//		}
//		
//		System.out.println("---------Utilizando alguns métodos------------");
//		System.out.println(listaRGB.size());
//		listaRGB.set(2, "amarelo");
//		System.out.println(listaRGB.get(2));
//		listaRGB.add(3, "preto" );
//		System.out.println(listaRGB.size());
//		listaRGB.remove(3);
//		System.out.println(listaRGB.size());
//		System.out.println("O indice do elemento VERMELHO:"+ listaRGB.indexOf("Vermelho") ); //deve ser escrito da mesma forma, é case sensitive
//        System.out.println("Sublist:" + listaRGB.subList(0, 2));
//        
//        
//        // CLASSE ARRAY
//        
//        System.out.println("");
//		System.out.println("---------CLASSE ARRAY-------------");
//		System.out.println("");
//		
//		String[] alunos = {"Fatima", "Antonio", "Maria"};
//		List<String> listaAlunos = new ArrayList<String>();
//		listaAlunos.addAll(Arrays.asList(alunos));
//		//Arrays.sort(alunos);
//		int i = Arrays.binarySearch(alunos, "Fatima"); //CUIDADO
//		System.out.println(i);
//		
//		Arrays.sort(alunos);
//		
//		for(int j = 0; j< alunos.length;j++){
//			System.out.println(alunos[j].toString());
//		}
//		
//		String[] alunos2 = Arrays.copyOf(alunos, 3);
//		for(int j = 0; j< alunos2.length;j++){
//			System.out.println(alunos2[j].toString());
//		}
//		
//		
//		// CLASSE COLLECTION
//		
//		System.out.println("");
//		System.out.println("---------CLASSE COLLECTION-------------");
//		System.out.println("");
//
//		List<String> nomes = new ArrayList<String>();
//		nomes.add("Pedro");
//		nomes.add("Adriano");
//		nomes.add("Carlos");
//
//		System.out.println(nomes);
//
//		Collections.sort(nomes);
//		
//
//		System.out.println(nomes);
//
//		System.out.println("Max:" + Collections.max(nomes));
//		System.out.println("Min:" + Collections.min(nomes));
//		Collections.reverse(nomes);
//		System.out.println(nomes);
//					   
//			
//		//Implementaçoes da Interface Set
//		System.out.println(" ");
//		System.out.println(" ----- Implementa��es da Interface Set -------");
//		System.out.println(" ");
//
//		Set<String> s = new HashSet<String>();
//		s.add("1");
//		if(s.add("1") == false) {
//			System.out.println("Elemento ja existe!");
//		}
//		s.add("2");
//
//		System.out.println(s);
//
//		System.out.println("REMOVENDO DUPLICACAO EM UMA LISTA");
//
//		List<String> lista = new ArrayList<String>();
//		lista.add("Android");
//		lista.add("Mac OS");
//		lista.add("Linux");
//		lista.add("Chrome");
//		lista.add("Linux");
//		lista.add("Android");
//
//		System.out.println(lista);
//
//		Set<String> conjunto = new HashSet<String>(lista);
//
//		System.out.println(conjunto);
//		
//		System.out.println("");
//		System.out.println("Inserindo elementos em um conjunto ordenado");
//		System.out.println("");
//
//		Set<String> conjunto2 = new TreeSet<String>(conjunto);
//		for (String nome : conjunto) {
//			conjunto2.add(nome);
//		}
//
//		System.out.println("ordenado:" + conjunto2); //note ordenacao 
//
//		
//		System.out.println("");
//		System.out.println("trabalhando com arvore ordenada");
//		System.out.println("");
//
//		Integer[] numeros = {50,-2,430,100};
//		TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(numeros));
//		System.out.println(ts);
//		System.out.println(ts.headSet(60)); // conjunto <= 60
//		System.out.println(ts.tailSet(100)); // conjunto >= 100
//		System.out.println(ts.first()); // menor elemento
//		System.out.println(ts.last()); // maior elemento
//		System.out.println(ts); // todos os elementos
//
//		
//
//		System.out.println("");
//		System.out.println("Interface Map<K,V>");
//		System.out.println("");
//
//		System.out.println("calculando a frequencia de palavras digitadas");

		
		
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> m = new HashMap<String, Integer>();

		String st = null;
		while(true){
			st = sc.next();
			if(st.equals("fim")) 
				break;
			if(m.containsKey(st)){
				int frequencia = m.get(st);
				m.put(st, frequencia+1);
			}else{
				m.put(st, 1);
			}
		}

		for (String chave : m.keySet()) {
			System.out.println("A chave: " + chave + " tem " + m.get(chave) + " ocorrencias");
		}

	}
}
