package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class ForTransformEjercicio6 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(toFloat(list));
	}
	public static ArrayList<Float> toFloat(ArrayList<Integer> list) {
		ArrayList<Float> listFloat = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			listFloat.add(list.get(i).floatValue());
		}
	return listFloat;
	}
	
}


/* 

Crea la función to_floats que recibe una lista de números y devuelve una nueva lista que contiene esos 
números convertidos en números decimales (float).

Por ejemplo:

[1.01, 8, 42] --> [1.01, 8.0, 42.0]

Recuerda que el tipo de destino es float.
 
*/