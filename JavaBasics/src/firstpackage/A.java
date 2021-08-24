package firstpackage;

public class A {
	static int a = 100; // Global variable

	public static void main(String[] args) {

		int a=10,b = 200;
		b = 50;// Local variable
		System.out.println("value is" + a + b);
		b=5;

	}
}
