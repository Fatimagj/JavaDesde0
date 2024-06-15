package io.keepcoding.javadesdecero.animal;

public abstract class Animal { // le decimos indirectamente que es la clase padre
	protected Long adn;
	public Animal(Long and) {
		this.adn = adn;
		
	}
	
	public abstract void hacerSonido();
	
	@Override
	public String toString() {
		return "Animal";
	}

	

}
