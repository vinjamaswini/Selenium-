package stringclass;

public class Test {
	public static void main(String[] args) {
		
	   String s1="JAVA";
	   String s2=new String("JAVA");
	   StringBuffer s3= new StringBuffer("welcome to the  world");
	   System.out.println(s3.substring(9,12));
		/*
		 * StringBuffer s3= new StringBuffer("java"); s3.append("session");
		 * System.out.println("String Buffer:"+s3);
		 */
	  // System.out.println();
	   System.out.println(s2.indexOf('J'));
	   System.out.println(s2.startsWith("w"));
		/*
		 * String [] substrings=s3.split(" "); for(String subs:substrings) {
		 * System.out.println(subs); }
		 */
		 boolean presence=s2.contains("java");
		    System.out.println(presence);
		  System.out.println(s3.length());
		 // System.out.println(s3.UpperCase());
		 // System.out.println(s3.trim());
		  char charecter=s3.charAt(0);
			System.out.println(charecter);
			
			StringBuffer replaced=s3.replace(8,14,"java");
System.out.println("replaced string :"  +s3);

boolean p=s2.equalsIgnoreCase("java");
System.out.println(p); 
/*
String [] substrings=s2.split(" ");
for(String subs:substrings) {
	System.out.println(subs);
*/	
	
    }
}










		  
		  


	
	



