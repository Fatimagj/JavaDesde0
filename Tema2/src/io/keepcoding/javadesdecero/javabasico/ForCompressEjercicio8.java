package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class ForCompressEjercicio8 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        list.add("Hola");
        list.add(" ");
        list.add("Mundo");
		System.out.println(concatAll(list));
	}

	public static String concatAll(ArrayList<String> list) {
		String result = "";
		
		for (int i = 0; i<list.size();i++) {
			result += list.get(i);
		}
		return result;
	}
	
}


/*

Crea la función concat_all, 
que recibe una lista de cadenas y devuelve otra cadena, con todas ellas concatenadas.
Asegúrate de que funciona correctamente con la lista vacía.
*/