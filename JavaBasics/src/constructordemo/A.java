package constructordemo;

public class A {

	public A() {
		this(10);
		System.out.println(" default constructor");
	}

	public A(int a) {
		this(10, 20);
		System.out.println("single parameterized constructor");
	}

	public A(int a, int b) {
		System.out.println("double parameterized constructor");

	}

	/*
	 * public static void main(String[] args) { A a = new A();
	 * 
	 * A a1=new A(10); A a2=new A(10,20);
	 * 
	 * }
	 */
}
