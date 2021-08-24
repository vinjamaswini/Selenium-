package com.controlstatements;

public class EvenExample {
	
	public void even()
	{
		for(int i=2;i<=100;i=i+2) {
			System.out.print("i value : "+i);
		}
		
	}
	public void odd()
	{
		
		for(int i=1;i<=100;i=i+2) {
			System.out.println("i value : "+i);
		}
	}
	public static void main(String[] args) {
		
		EvenExample e=new EvenExample();
		e.even();
		e.odd();
		
		
		
		
		
		
	}
	
	

}
