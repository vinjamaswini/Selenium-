package firstpackage;

public class C {
	static int  a=40;
	static int  b=30;
	public static void main(String[] args) {
		
	add();
	sub();
	}
	public  static void add()
	{
		int result = a+b;
		System.out.println(result);
		
	}
	public static void sub()
	{
		int result=a-b;
		System.out.println(result);
	}
	
}
