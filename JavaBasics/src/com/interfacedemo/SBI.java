package com.interfacedemo;

public class SBI implements RBI {

	@Override
	public void createAccount() {
		System.out.println("create a SBI bank account");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAccount() {
		System.out.println(" save SBI account");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openAccount() {
		System.out.println("open SBI bank account");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		System.out.println("close SBI bank account");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		RBI sbi=new SBI();
		sbi.createAccount();
		sbi.saveAccount();
		sbi.openAccount();
		sbi.closeAccount();
		
	}

}
