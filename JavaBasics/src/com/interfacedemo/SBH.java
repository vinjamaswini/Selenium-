package com.interfacedemo;

public class SBH implements RBI {

	@Override
	public void createAccount() {
		System.out.println("create a SBH bank account ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAccount() {
		System.out.println("save SBH bank account ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openAccount() {
		System.out.println("open SBH bank account ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		System.out.println("close SBH bank account ");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		RBI sbh=new SBH();
		sbh.createAccount();
		sbh.saveAccount();
		sbh.openAccount();
		sbh.closeAccount();
	}

}
