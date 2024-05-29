package io.keepcoding.javadesdecero.javabasico;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int frecuencia = 150;
		System.out.println(tempGrillo(frecuencia));

}
	public static double tempGrillo(int frecuency) {
		double temp = 10+ ((frecuency - 40) / 7);
		return temp;
}
}