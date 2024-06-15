package io.keepcoding.javadesdecero.banco;

import java.util.Scanner;
import io.keepcoding.javadesdecero.model.BankAccount;
public class MainBank {

	public static void main(String[] args) {
		/* PAra llamar sin parámetros
		BankAccount account = new BankAccount();
		*/
		
		BankAccount account = new BankAccount("12345678X", 
				"Pedro", 
				"Martinez",
				1234,
				100.0);
		
		System.out.println();
		//Pruebas de uso
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el DNI");
		String dniInput = input.nextLine(); //se espera hasta que introduces algo en el teclado y das a intro
		
		System.out.println("Introduce el password");
		Integer passInput = input.nextInt();
		
		
		//String dniInput = "";
		//int passInput = 1234;
		
		//authenticate
		account.authenticate(dniInput, passInput);
		
		//GetCash 
		account.getCash(50);	
		System.out.println("Current balance: " +  account.getBalance());
		//Get Data -> showInfo()
		System.out.println(account.toString());

		//income
		account.income(20);	
		System.out.println("Current balance: " +  account.getBalance());
	}

}
