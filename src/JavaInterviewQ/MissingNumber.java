package JavaInterviewQ;

public class MissingNumber {
	 private String function(String temp, int data) 
     { 
         return ("GFG"); 
     } 
     private String function(int data, String temp) 
     { 
         return ("GeeksforGeeks"); 
     } 


	public static void main(String[] args) {
		MissingNumber  obj = new MissingNumber();
		// 1+2+4+5=12
		/*
		 * int a[] = {1,2,4,5}; //1+2+3+4+5=15, 15-12=3 int sum = 0; for(int i=0;
		 * i<a.length; i++){ sum = sum + a[i];
		 * 
		 * } int sum1=0; System.out.println(sum); for(int j=1; j<=5; j++) { sum1 = sum1
		 * + j; } System.out.println(sum1); System.out.println("Missig Number is:::" +
		 * (sum1-sum));
		 */
		
		/*
		 * int arr[] = new int[5]; System.out.println(arr);
		 */
		/*int g = 3;
        System.out.print(++g * 8); */ 

       
	
            
            System.out.println(obj.function(4, "GFG"));     
	
	}
	

}
