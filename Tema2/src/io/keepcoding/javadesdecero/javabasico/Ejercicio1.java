package io.keepcoding.javadesdecero.javabasico;

public class Ejercicio1 { // clase principal para que podamos ejecutar

		public static void main(String [] args) {
			int test = 5;
			System.out.println(test); // para el print, se añade el ln mete un salto de linea
			test = decrement(test);
			System.out.println(test);
		}
		
		public static int decrement(int a) { // siempre hay que tipar las variables
			return a -1; 
		}
}

