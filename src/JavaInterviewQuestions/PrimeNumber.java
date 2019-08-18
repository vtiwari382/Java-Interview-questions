package JavaInterviewQuestions;


public class PrimeNumber {
	
	
	public static void main(String[] args) {
		int num = 100, count;
		
		for (int i = 1; i <= num; i++) {
			count = 0;                    // this line hold the initial count=0, in case i%j !=0 this count help to find NO. is prime
			for (int j = 2; j <= i / 2; j++) {     // j<=i/2 help will divide the initial number of i and iterate the loop for half value
			if (i % j == 0) {                     // this line will check if i%j==0 then it's not prime and count will not increase
			 count++;
//			 System.out.println("After iteration count is:: " +count);
			 break;      // this line will break the condition if i%j==0 is true and it will break the current loop and comes out
			}
			}

		   if (count == 0) {       // if i%j is !=0 then after break condition this line will execute and print the prime number
		    System.out.println(i);
		   }

		  }
		
	}

}
/*
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.*/