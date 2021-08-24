package com.interfacedemo;

public class ICICIBANK implements RBI{

	@Override
	public void createAccount() {
		System.out.println("create a ICICI bank account ");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAccount() {
		System.out.println("save ICICI bank account ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openAccount() {
		System.out.println("open ICICI bank account ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		System.out.println(" close ICICI bank account ");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		RBI icici=new ICICIBANK();
		icici.createAccount();
		icici.saveAccount();
		icici.openAccount();
		icici.closeAccount();
		
	}

}
