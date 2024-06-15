package io.javadesdecero.Hospital;

public class Enfermera extends Auxiliar {
	
	public Enfermera(String name, String surname, String dni) {
		super(name, surname, dni);
	}

	
		public void suministrarMedicamento() {
			System.out.println("Suministrar medicamento");
		}

	}


