package inheritance;

public class AutomaticPromations {
	public void test(double num) {
		System.out.println("num" +num);
	}
	
	
	public static void main(String[] args) {
		AutomaticPromations a=new AutomaticPromations();
		a.test(100);
		a.test('c');
		a.test(1.2);
		a.test(12.346576);
		
		
	}

}
