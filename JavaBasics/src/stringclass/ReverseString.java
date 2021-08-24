package stringclass;

public class ReverseString {
	public static void main(String[] args) {
		String s=" hello world"; 
		char [] charecters=s.toCharArray();
		
		
		for(int i=charecters.length-1;i>=0;i--) {
			System.out.print(charecters[i]); //EMOCLEW
		}	
	}

}
