package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class ForCompressEjercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(multiplayAll(list));

	}
	public static int multiplayAll(ArrayList<Integer> list) {
		int total = 1;
		for (int i = 0; i < list.size(); i++) {
			total *= list.get(i);
			
		}
		return total;
			
	}
	
}
