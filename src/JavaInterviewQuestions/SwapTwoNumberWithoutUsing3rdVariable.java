package JavaInterviewQuestions;

public class SwapTwoNumberWithoutUsing3rdVariable {

	public static void main(String[] args) {
		int x =5;
		int y = 10;   // Now Swap the value and print x = 10; and y = 5
 		
		// 1. Now swap the value Using 3rd Variable : t
		/*
		int t;
		t=x; // now t = 5
		x=y; // now x = 10
		y=t; // now y = 5
	*/
		
		// 2. swap without using 3rd variable: using + operator
		
		/*
		x = x+y;  // now x = (10+5)  = 15
		y = x-y;  // now y = (15-10) = 5
		x = x-y;  // now x = (15-5)  = 10
		*/
		
		// 3. swap without using 3rd variable: using * operator
		
		x = x*y;  // now x = (5*10) = 50
		y = x/y;  // now y = (50/10) = 5
		x = x/y;  // now x = (50/5) = 10
		
		
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
