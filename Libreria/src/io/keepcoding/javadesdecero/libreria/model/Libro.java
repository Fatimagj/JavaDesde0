package io.keepcoding.javadesdecero.libreria.model;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;// codigo numero, es un identificador unico del libro
	private int existencias;
	
	 public Libro(String title,
	        String author,
	        String isbn) {
	        this(title, author, isbn, 0);
	    }
	  
	public Libro(
			String titulo,
			String autor,
			String isbn,
			int existencias
			) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.existencias = existencias;
	}
	
	
	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getExistencias() {
		return existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	
	//metodo para cerrar y tener una representación más ordenada, si no lo pones devuelve el espacio de meneria donde está 
	@Override
	public String toString() {
		return String.format(
				"Titulo: %s | IBAN: %s", 
				titulo, isbn);
	}

}
