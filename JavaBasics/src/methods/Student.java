package methods;


public class Student {
	int rollno;
	String name;
	String City;
Student(int rollno,String name,String City)
{
	this.rollno=rollno;
	this.name=name;
	this.City=City;
	
	
		
}
public String toString() {
	return rollno+" "+name+" "+City;  
}
public static void main(String[] args) {
	Student s=new Student(12,"aswini","hyderbad");
	Student s1=new Student(13,"bhavya","khammam");
	System.out.println(s);
	System.out.println(s1);
	

		
	
	
}

}
