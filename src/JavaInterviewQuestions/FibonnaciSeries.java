package JavaInterviewQuestions;

public class FibonnaciSeries {
	
	// Fibonnaci Series of first 10 number
	// 0 1 1 2 3 5 8 13 21 34 55 89

	public static void main(String[] args) {
		
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.print(firstNumber+" ");
		System.out.print(secondNumber+" ");
		
		for(int i=0; i<10; i++) {
			int thirdNumber = firstNumber+secondNumber;
			System.out.print(thirdNumber+" ");
			
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			
		}

	}

}
