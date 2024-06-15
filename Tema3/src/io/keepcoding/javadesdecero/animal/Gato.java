package io.keepcoding.javadesdecero.animal;

public class Gato extends Animal implements Mascota { //solo se herada de un padre pero puedes tener múltiples interfaces
	
	// Todos los constructores deben llamar al contrcutor de la clase padre
	public Gato() {
		super(0L);
	}
	
	//estas obligado a implementar todos los métodos
	@Override //qeu estas herendao de la case padre
	public void hacerSonido() {
		//acceso a una propiedad protected
		System.out.println(adn);
		System.out.println("silencio");
	}

	@Override
	public void jugarConElDueño() {
		System.out.println("Ronronear");
		
	}
}
