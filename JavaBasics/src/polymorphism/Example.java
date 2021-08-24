package polymorphism;

import inheritance.A;

public class Example {
	public void printNumber(int num) {
		System.out.println("num="+num);
	}
	
public static void main(String[] args) {
	Example b= new Example();
	b.printNumber(100);
	b.printNumber('A'); 
	//b.printNumber(1.2);
	A a=new A();
	a.add();
	
}	

}
