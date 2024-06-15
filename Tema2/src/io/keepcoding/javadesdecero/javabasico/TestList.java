package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		testArrayList();
		testWhile();
		testDoWhile();
	}
	public static void testWhile() {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		/*pseudocodigo
		 * [0, n-1] -> i < size || i <= (size-1)
		 * contador = 0
		 * mientras contador <= (longitud-1) de la lista
		 * get elemento[contador]
		 * incrementar contador
		 */
		
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		//es equivalente al de arriba, distinta forma de ahcerlo
		i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i++)); //se evalua antes de realizaar el incremento
			
		}
	}
	public static void testDoWhile() {
		ArrayList<Integer> list = new ArrayList <>();
		
		list.add(1);
		list.add(2);
		
		int i = 0;
		
		do {
			System.out.println(list.get(i));
			i++;
		} while(i < list.size());
		
		
	}
	public static void testArrayList() {
		
	
		// Aqui va clases y no tipos basicos. Hay que hacer la clase envoltoria
		ArrayList<String> list = new ArrayList<>(); //en ArrayList<AQUI> solo tipos envoltorio(clases)
		
		list.add("Uno");
		list.add("Dos");
		list.add("Tres");
		System.out.println(list);
		
		//iterador. ambos iteradores son equivalentes
		// hya una gestion de indice pero lo hace java
		for (String str: list) {
			System.out.println(str);
		}
		// aqui se maneja el iterador manualmente, el indice lo hacemos manual
		for(int i = 0; i<list.size(); i++) // el i++ se ejecuta antes de que vuelva a pasar por la condición
			System.out.println(list.get(i));
		
		/*
		 * i = 0
		 * 0 < 1 => si
		 * print... dek numero que ocupe la posición i_> posición 0-> 1
		 * i = 0 +1 : 1 => si
		 * print...
		 * 
		 */
		// Print de la lista completa
		System.out.println(list);
	}

}


