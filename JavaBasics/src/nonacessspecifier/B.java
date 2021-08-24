package nonacessspecifier;

public class B extends FinalExample {
	
	public  static void test()
	{
		System.out.println( "  test b class method");
	}
	
	public static void main(String[] args) {
		//B b=new B();
		B.test();
	}
	

}
