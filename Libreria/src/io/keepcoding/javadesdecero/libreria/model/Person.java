package io.keepcoding.javadesdecero.libreria.model;


/*
 * public -> publico
 * private -> privado
 * las propiedades son privadas
 * ESte tipo de clase son POJO, que solo guardan información:
 * Plain
 * Old
 * Java
 * Object
 * 
 * getters y setters gestiona el acceso. Get: consultar; set: modificar
 * */
public class Person {

	private String name;
	private int age;
	private String address;
	
	public String getName() { // en lo get no necesitamos poner parametros para que nos devuelvan el valor
		return name;
	}
	public void setName(String name) {
		if (name != null) {
			// contexto del propio objeto. HAce los mismo que SELF. asi nos referiaos al de arriba
			this.name = name;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
		public String showInfo() {
			String result = "Nommbre: " + name +" Edad: "+ age +" Dirección: "+ address;
			return result;
		}
		
		/*También se puede hacer con string interpolation:
		 * retunr String.format("%s | %d |%s", name, age, address);
		 * 
		 */
	/*
	 * Ejemplo de devolución del resultado de la asignación
	 * 
	 public bollean setName(String name) {
	 	
	 	 */

}
