package polymorphism;

public class ThisDemo {
	
	public void add()
	{
		this.add(10);
		System.out.println();
	}
	public void add(int a)
	{
		this.add(56,30);
	}
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
	}
	public static void main(String[] args) {
		ThisDemo a=new ThisDemo();
		a.add();
}
}