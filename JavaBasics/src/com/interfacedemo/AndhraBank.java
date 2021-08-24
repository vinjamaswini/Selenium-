package com.interfacedemo;

public class AndhraBank implements RBI {

	@Override
	public void createAccount() {
		System.out.println("create a Andhra bank account ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAccount() {
		System.out.println("save Andhra bank account ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openAccount() {
		System.out.println("open Andhra bank account ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		System.out.println("close Andhra bank account ");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		RBI andhrabank=new AndhraBank();
		andhrabank.createAccount();
		andhrabank.saveAccount();
		andhrabank.openAccount();
		andhrabank.closeAccount();
	}

}
