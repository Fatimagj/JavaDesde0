package io.javadesdecero.Hospital;

public class HospitalMain {

	public static void main(String[] args) {
		Persona p = new Enfermera(
				"123456",
				"Lola", 
				"Lolita"
				);
		//esto es para verificar que el enfermero puede dar medicamento, ya que esto es seguro, el sigueinte solo es forzar y  no comprueba
		if (p instanceof Enfermera) {
			//casting -> forzado de tipo
			((Enfermera) p).suministrarMedicamento();
		}
		//Esto puede fallar, primero hay que hacer lo de arriba qeu es comprobar
		//((Enfermera) p).suministrarMedicamento();
	}

}
