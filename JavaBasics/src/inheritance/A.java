package inheritance;

public class A {
	int a=300,b=200;
	public void add()
	{
		int result = a+b;
		System.out.println("resultt is" + result);
	}
	//private void sub()
	protected  void sub()
	{
		int result =a-b;
		System.out.println( "result is " +result);
	}


}
