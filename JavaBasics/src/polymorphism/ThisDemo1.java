package polymorphism;

public class ThisDemo1 {
	
		String name; // 

		public  void printName(String  name) {	
			this.name=name;
		System.out.println("Line No:6 ="+name); 

		}
		public static void main(String[] args) {
			
			ThisDemo1 obj = new ThisDemo1();
			obj.printName("aswini");
			obj.test("java");
		System.out.println("line No : 17 ="+obj.name); //0

		}
		public void test(String name) {
			this.name=name;
			System.out.println(name);
		}
		
		

		
}

