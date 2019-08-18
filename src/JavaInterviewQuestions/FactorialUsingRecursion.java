package JavaInterviewQuestions;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	static	int count = 1;
	
	public static int calfact(int num) {
	
		if(num==0) 
			return 1;
		
			else
				return(num*calfact(num-1));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		

		FactorialUsingRecursion.calfact(num);
		
		System.out.println("factorial of number is:" +calfact(num));

	}

}
