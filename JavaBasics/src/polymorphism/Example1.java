package polymorphism;

public class Example1 {
	
	public void sub(int a)
	{
	System.out.println(a);
	
	}
	public void sub(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b,int c)
	{
		System.out.println(a-b-c);
	}
	public void sub(int a,int b,int c,int d)
	{
		System.out.println(a-b-c-d);
	}
	
public static void main(String[] args) {
	Example1 obj=new Example1();
	obj.sub(100);
	obj.sub(300,200);
	obj.sub(100, 50, 25);
	obj.sub(100, 50, 25,10);
			
	
}	

}
