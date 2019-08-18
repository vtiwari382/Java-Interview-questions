package JavaInterviewQuestions;

import java.util.Scanner;

public class Factorial {
	
	

	public static void main(String[] args) {
//		int num=5;
		int count = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		if(num==0) {    // we need to handle this because factorial of 0 is 1
//			System.out.println(count);
		}
		
		for(int i=1;i<=num;i++) {
			count=count*i;
			
		}
		
		System.out.println("factorial of number is:" +count);

	}

}
