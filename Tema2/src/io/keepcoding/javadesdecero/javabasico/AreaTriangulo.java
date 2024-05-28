package io.keepcoding.javadesdecero.javabasico;

public class AreaTriangulo {
	public static void main(String [] args) {
		double a= 5;
		double b= 7;
		double c = 9;
		System.out.println("El área de " + a + ", " + b + ", " + c + " es: " + triangle_area(a, b, c));
		
		}
		public static double triangle_area(double side1, double side2, double side3) {
		    double perimeter = (side1 + side2 + side3) / 2;
		    
		    return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
		}

	
}
