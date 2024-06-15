package io.javadesdecero.Hospital;

public class Medica extends Enfermera {

	public Medica(String name, String surname, String dni) {
		super(name, surname, dni);
		
	}

	public void prescribirMedicamento() {
		System.out.println("prescribir medicamento");
	}
}
