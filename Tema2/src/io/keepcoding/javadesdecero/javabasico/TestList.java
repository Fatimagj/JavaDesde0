package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
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
		 * print...
		 * i = 0 +1 : 1 => si
		 * print...
		 * 
		 */
		// Print de la lista completa
		System.out.println(list);
	}

}


