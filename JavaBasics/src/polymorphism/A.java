package polymorphism;

public class A {
	int a=100,b=200;
	public int add(int a,int b)
	{
		int result=a+b;
		System.out.println(result);
		return result;
		
	}
	public String test(String a)
	{
		String result="java";
		System.out.println(result);
		return result ;
		
	}
	public static void main(String[] args) {
		A a=new A();
		a.add(20, 30);
		a.test(" ");
		
	}

}
