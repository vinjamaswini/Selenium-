package com.firstPackage;

public class FirstClass {
	
	int a=10, b=20,c;
	
	public int add( int a, int b)
	{
		c=a+b;
		System.out.println("add is:"+c);
		return c;
		
	}
	public int sub(int a, int b)
	{
		c=a-b;
		System.out.println("sub is:"+c);
		return c;
	}
    public static void main(String[] args) {
    	FirstClass s=new FirstClass();
    	int x=s.add(50,20);
    	System.out.println(x);
    	 int y=s.sub(30,20);
        System.out.println(y);
        
    	
    	
  
  
    	 
    	 
    	
	}
	
	

}



