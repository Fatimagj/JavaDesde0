package io.keepcoding.javadesdecero.libreria.model;

import java.util.ArrayList;

public class Libreria {
	private ArrayList<Libro> catalog; //como se crea una lista, colección de libros
	
	public Libreria() {
		//catalog = new ArrayList<>();
		this(new ArrayList<>());
		
	}
	public Libreria(ArrayList<Libro> catalog) {
		this.catalog = catalog;
	}
	public void addLibro(Libro libro) { //
		catalog.add(libro);
	}
	
	//para borrar un libro
	public void removeLibro(Libro libro) {
		removeLibro(libro.getIsbn());
	}
	public void removeLibro(String isbn) {
		Integer pos = getPositionByIsbn(isbn);
		if (pos != null) {
			catalog.remove(pos);
		}
	}
	
	//para buscar un libro a través del ibsn
	public Libro findByIsbn(String isbn) {
		Integer pos = getPositionByIsbn(isbn);
		if (pos != null) {
			return catalog.get(pos);
		} else {
			return  null;
		}
	}
	
	// para iterar la lista, buscar para el resto de funcionalidades que hemos puesto arriba
	private Integer getPositionByIsbn(String isbn) {
		for (int i=0; i<catalog.size(); i++) {
			Libro libro = catalog.get(i);
			if (isbn.equals(libro.getIsbn())) {
				return i;
			}
		}
		return null;
		
	}
	
	@Override
	public String toString() {
		String res = "";
		for (Libro libro: catalog) {
			res += libro + "\n";
		}
		return res;
		}
	
}
