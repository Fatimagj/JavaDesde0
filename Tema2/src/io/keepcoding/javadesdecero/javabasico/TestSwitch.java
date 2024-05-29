package io.keepcoding.javadesdecero.javabasico;

public class TestSwitch {

	public static void main(String[] args) {
		// Simulando entrada de teclaso
		String option = "a";
		String res = "";
		
		// Expresiones equivalentes
		/*
		if (option == "a") {
			res = "Go to cinema";
		} else if (option == "b") {
			res = "Go to restaurant";	
		} else {
			res = "Stay at home";
		}
		*/
		
		switch(option) {
		case "a":
			res = "Go to cinema";
			break;
		case "b":
			res = "Go to restaurant";
		default:
			res = "Stay at home";
			break;
		}
		System.out.println(res);
			
	}

}
