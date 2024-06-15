package io.keepcoding.javadesdecero.model;

public class BankAccount {
	
	private String dni;
	private String name;
	private String surname;
	private int pass;
	private double balance;
	private boolean isLogged = false; // con los booleanos se pone is
	
	public BankAccount(
			String dni, 
			String name, 
			String surname, 
			int pass, 
			double balance
			) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.pass = pass;
		this.balance = balance;
		this.isLogged = false;
		
	}

	public boolean authenticate(String dni, int pass) {
		this.isLogged = this.dni.equals(dni) && this.pass == pass;
		return isLogged;
	}
	
	/* opción sin devolver el estado
	 * 	public void authenticate(String dni, int pass) {
		this.isLogged = this.dni == dni && this.pass == pass;
		}
	 */
	
	public boolean getCash(int quantity) {
		boolean hasSuccess = false;
		if (isLogged && (balance -quantity >=0)) {
			hasSuccess = true;
			balance -= quantity;
		}
		return hasSuccess;
	}
	
	public boolean income(int quantity) {
		boolean hasSuccess = false;
		if(isLogged) {
			hasSuccess = true;
			balance += quantity;
			
		}
		return hasSuccess;
	}
	//Getters y setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() { 
		return name;
	}
	private void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPass() { 
		return pass;
	}
	private void setPass(int pass) {
		if (pass >= 1000) {
			this.pass = pass;
		}
	}


	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public boolean isLogged() {
		return isLogged;
	}
	
	@Override
	public String toString() { //permite que el print llame a este metodo automaticamente sin decirlo
		return String.format(
				"DNI: %s, Name: %s, Surname: %s, Balance: %s",
				 dni, name, surname, Double.toString(balance));
	}
}
