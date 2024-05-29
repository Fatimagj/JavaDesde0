package io.keepcoding.javadesdecero.javabasico;

public class TestIfElse {

	public static void main(String[] args) {
		//prueba
		float nota = 5.5f;
		
		// is_approved = nota >= 7
		//boolean isApproved = passesTest(nota); 
		
		System.out.println("Result: " + passesTest(nota));
	
	}
	public static boolean passesTest(float note) {
		return note >= 7;
	}
}
