package firstpackage;

public class D {
	static int a=70;
	static int b=20;
	
	public static void main(String[] args) {
		D obj=new D();
		obj.add();
		sub();
		obj.testA();
	
	
		
	}
	public void add()
	{
		int result=a+b;
		System.out.println(result);
	}
	public  static void sub() {
		int result=a-b;
		System.out.println(result);
	}
	public void testA()
	{
		System.out.println(" D class method");
	
	

}
}
