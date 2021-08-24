package stringclass;

public class SubString {
	public static void main(String[] args) {
		
	
	String s="wellcome to the world"; 
	System.out.println(	s.substring(9,12));
	
    boolean presence=s.contains("java");
    System.out.println(presence);
     
    System.out.println(s.startsWith("a"));
    
    String [] substrings=s.split(" ");
	for(String subs:substrings) {
		System.out.println(subs);
	}
	
	 System.out.println(s.indexOf('w'));
	 System.out.println(s.startsWith("w"));


	}
}
