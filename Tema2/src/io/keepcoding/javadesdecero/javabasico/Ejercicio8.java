package io.keepcoding.javadesdecero.javabasico;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		System.out.println(hasSuffix("Hola Mundo", "Hola"));
		System.out.println(hasSuffix("Hola Mundo", "Lola"));
		
		
		System.out.println(isSuffix("Hola Mundo", "Mundo"));
		
	}

	public static boolean hasSuffix(String cadena, String prefix) {
		
	        return cadena.startsWith(prefix); //comprueba si la primera cadena es un prefijo de la segunda(prefijo), nos ahorramos código
	}
	
	public static boolean isSuffix(String cadena, String suffix) {
	        return cadena.endsWith(suffix); //comprueba si la primera cadena es un sufijo de la segunda(sufijo)
	    }
}

/*
Crea la función has_suffix(string, prefix) que recibe dos cadenas y devuelve True la segunda es un prefijo de la primera.

Es decir has_suffix("hola mundo", "hola") devolvería True.

Pista Si prejijo es más largo que string, ¿hace falta comparar algo?

Crea la función is_suffix, que hace lo opuesto: comprueba si la segunda cadena es un sufijo de la primera
*/
