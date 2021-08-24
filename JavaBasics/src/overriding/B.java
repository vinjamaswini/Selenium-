package overriding;

public class B extends A {
	int num=110;
	public void testB() {
		System.out.println("Test B class Test B");
	}
	
	
	public void test() {
		super.test();
		System.out.println("test method B class");
	}
	public void printNumber()
	{
		System.out.println(num);
		System.out.println(super.num);
	}
	public static void main(String[] args) {
		/*
		 * A a=new A(); a.testA(); a.test();
		 */
		
		B b=new B();
		//b.testB();
		//b.testA();
		
		b.test();
		b.printNumber();
		
	}

}
