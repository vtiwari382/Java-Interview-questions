package JavaInterviewQuestions;

public class ReverseAnInteger {

	public static void main(String[] args) {
		
		// Using Algo
		long num = 12345;
		long rev =0;
		
		while(num !=0) {
			rev = rev*10;
			rev = rev + num%10;
			num = num / 10;
			System.out.println("value of reverse is: "+rev);
			System.out.println("value of number is: "+num);
		}
		System.out.println("Reverse Num is::" +rev);

		
		// Using StringBuffer
		
		long num1 = 123456789;
		StringBuffer sf = new StringBuffer(String.valueOf(num1));    //String.valueOf will convert integer(num1) into String to perform reverse method
		System.out.println("Reverse integer using string buffer is:" +sf.reverse());
//		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
/*
1. String valueOf() method to convert the integer, float, long, double, char and char array to the String.
2. Convertion of String.value is needed for all data types , bcoz reverse functionality is available in string
*/