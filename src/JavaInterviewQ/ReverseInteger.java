package JavaInterviewQ;

public class ReverseInteger {

	public static void main(String[] args) {
		// 1. using algo
		int num = 123456; // long num = 123456789;
		int rev = 0;      // long rev = 0;
		while(num!=0) {
		rev = rev*10+num%10;
		num = num/10;
		}
		System.out.println("Reverse num is  "+ rev);
		//2.StringBuffer rev mathod
		long num1 = 123456789;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
