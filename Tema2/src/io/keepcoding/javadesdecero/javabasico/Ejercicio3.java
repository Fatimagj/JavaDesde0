package io.keepcoding.javadesdecero.javabasico;

public class Ejercicio3 {

	public static void main(String[] args) {
		double oldSalary = 950;
		double newSalary = newSalary(oldSalary);
		System.out.println("El nuevo salario es: " + newSalary);
	

	}

	public static double newSalary(double oldSalary) {
		if (oldSalary <= 1000) {
			return oldSalary * 1.08;
		}
		else {
			return oldSalary;
		}
		
	}
}

/*
En una empresa quieren subir el sueldo a todos los empleados cuyo sueldo sea inferior a un cierto nivel.

Crea la función new_salary que recibe el sueldo actual. Si dicho sueldo es inferior o igual a €1000, le aplica un incremento del 8%. Si no, se queda como está.
*/