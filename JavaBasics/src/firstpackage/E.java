package firstpackage;

public class E {
	int a=40;
	int b=20;
	
	public static void main(String[] args) {
		//add();//directly
		E obj=new E();
		obj.add();
		D.sub();//Executing another class method in static way
		D obj1=new D();
		obj1.testA();//Executing another class method in memory allocation
		
		
		
	}
	public  void add()
	{
		int result=a+b;
		System.out.println(result);

}
}
