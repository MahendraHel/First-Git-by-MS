package JavaInterviewQ;

public class JavaString {

	public static void main(String[] args) {
		// Reverse a String
		// Diff btw String and StringBuffer
		// Do we have Reverse Function in String
	String s = "Jayshree";
		//using for loop
	int len = s.length();
	String rev = "";	
	for(int i =len-1; i>=0; i--){
		rev = rev + s.charAt(i);	
		}
	System.out.println(rev);
	// using StringBuffer class
	StringBuffer sf = new StringBuffer(s);
	System.out.println(sf.reverse());
	}

	
}
