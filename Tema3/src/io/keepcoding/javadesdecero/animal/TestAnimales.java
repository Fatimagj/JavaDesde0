package io.keepcoding.javadesdecero.animal;

public class TestAnimales {

	public static void main(String[] args) {
		Perro perro = new Perro();
		
		Animal animalRandom = new Perro();
		animalRandom = new Gato();
		animalRandom.hacerSonido();
		
		Mascota mascota = testMascota();
		mascota.jugarConElDueño();
		//NO se puede instanciar una clase abstracta
		//Animal animal = new Animal();
		//animal.hacerSonido();
		perro.hacerSonido();
		
		


	}

	private static Mascota testMascota() {
		// TODO Auto-generated method stub
		return null;
	}

}
