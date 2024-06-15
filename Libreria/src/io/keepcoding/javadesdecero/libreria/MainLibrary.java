package io.keepcoding.javadesdecero.libreria;

import io.keepcoding.javadesdecero.libreria.model.Person;
import io.keepcoding.javadesdecero.libreria.model.Libro;
import io.keepcoding.javadesdecero.libreria.model.Libreria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Pruebas, instanciar los modelos e inicializar
 **/
public class MainLibrary {

	public static void main(String[] args) {
		// Ejemplos
		Libreria libreria = new Libreria();
		libreria.addLibro(new Libro (
				"1",
				"La comunidad del anillo",
				"Tolkien",
				2
				));
		libreria.addLibro(new Libro (
				"2",
				"Las dos torres",
				"Tolkien",
				3
				));
		libreria.addLibro(new Libro (
				"3",
				"El retorno del rey",
				"Tolkien",
				2
				));
		
		Map<Integer,Libro> map = new HashMap<>();//diccionarios
		//key -> value
		//1 -> Sapiens...
		// tema -> estado (si ha ganado o no)
		map.put(Integer.valueOf(1), new Libro(
				"Sapiens: A Brief History of Humankind", 
				"Yuval Noah Harari",
				"123456789"
				));
		//para buscar dentro, iterar dentro de las llaves
		for (var key:map.keySet()) {
			System.out.println(map.get(key));
		}
		/*
		 * LIST OPTION
		 * 0. Salir
		 * 1. listar libros
		 * 2. Añadir libro
		 */
		int option = -1; // control opción vacia
		do {
			
			//muestro las opciones de menu
			System.out.println("#######");
			System.out.println("Selecciona una opción: ");
			System.out.println("0. Salir");
			System.out.println("1. Listar libros");
			System.out.println("2. Añadir libros");
			System.out.println("#######");
			
			//capturo la opción elegida y compruebo que sea correcta (excepciones)
			Scanner input = new Scanner(System.in);
			String optionStr = input.nextLine(); //obtener un string y luego va buscar una validación transformandolo para controlar los errores
			//excepciones
			//runtimeException.
			try {
				option = Integer.parseInt(optionStr); //clase envolotorio 
			} catch(Throwable e) {
				option = -1;
			}
			
			if (option < 0 || option > 2) {
				System.out.println("Introduce una opción correcta");
			}
			
			if (option ==1) {
				// List libros
				System.out.println("Colección de libros:");
				System.out.println(libreria);
			}
			//ejecutar la acción
			
		} while(option != 0); //Si salir -> salir dle bucle
		System.out.println("bye");
		//testPerson()
		//testLibrary()
	}
	
	/*public static void testLibrary() {
		Libreria libreria = new Libreria();
		libreria.addLibro(new Libro (
				"1",
				"La comunidad del anillo",
				"Tolkien",
				2
				));
		libreria.addLibro(new Libro (
				"2",
				"Las dos torres",
				"Tolkien",
				3
				));
		libreria.addLibro(new Libro (
				"3",
				"El retorno del rey",
				"Tolkien",
				2
				));
				*/
	
		//pequeña interfaz donde le pedimos al usuario datos y empezar a crear la libreria
		/*Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el isbn para buscar");
		String isbnInput = input.nextLine();
		
		System.out.println(libreria.findByIsbn(isbnInput));
	}
	*/
	public static void testPerson() {
		Person p =new Person();
	
		//si la propiedad fuera publica
		//p.samplePublic = null;
		//sample error accessing private property
		// p.age = 20;
		p.setName("Pedro Lopez");
		p.setAge(20);
		p.setAddress("C/ Lopez de Hoyos, 1");
	
		System.out.println(p.showInfo());
	
	}
}
