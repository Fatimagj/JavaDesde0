package io.keepcoding.javadesdecero.javabasico;

public class TestString {
	
	public static void main(String[] args) {
		String str = "My awesome String";
		
		System.out.println("Length: " + str.length()); //para la longitud de una cadena
		System.out.println("Contains: " + str.contains("aw")); //muy habitual usarlo en condicionales
		//Accedemos directamente a las posiciones desde el 0 hasta el length()-1
		System.out.println("substring solo begin: " + str.substring(11)); //sirve para cortar una cadena
		System.out.println("substring begin y end: " + str.substring(12, 13));
		System.out.println("CharAt a la última posición: " + str.charAt(str.length()-1)); //para decirte un caracter concreto, en este caso para decirle el ultimo hay que dar la longitud y de ahí el ultimo, no es como en python, la longitud desde atras no son numeros negativos
		System.out.println("CharAt a la primera popsición: " + str.charAt(0));
		
	}
}
