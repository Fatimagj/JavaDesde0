package io.keepcoding.javadesdecero.javabasico;

public class Ejercicio4 {

	public static void main(String[] args) {
		
			double n = 3500;
			n = inversion(n);
			System.out.println(n);
	}
		public static double inversion(double n) {
			return (n * 0.03) + n;
			
			
			
		}


}


/* package io.keepcoding.javadesdecero.javabasico;

public class Ejercicio4 {
	public static float INTEREST = 1.03f;

	public static void main(String[] args) {
		float testValue = 5000f;
		double result = investment(testValue);
		
		System.out.println("Ganarás: " + result);
		
	}
	
	public static double investment(float money) {
		return money * INTEREST;
	}
	
	public static double credit(float money) {
		return money * (1 -INTEREST);
	}

}	
*/