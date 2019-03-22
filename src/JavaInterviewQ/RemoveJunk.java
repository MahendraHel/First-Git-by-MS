package JavaInterviewQ;

public class RemoveJunk {

	public static void main(String[] args) {
		// Regular Expression:[^a-zA-Z0-9]
  String s = "!@##$$%^&&**(()) latin string 0123456789"; 
  s = s.replaceAll("[^a-zA-Z0-9]", "");
  System.out.println(s);
	}

}
