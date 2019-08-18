package JavaInterviewQuestions;

import java.util.Arrays;

public class SmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		int numbers[] = {-10, 24, 50, -88, 987656, -50, 987657};
		
		int largest = 0;
		int smallest = 0;

		for(int i:numbers) {
			if(i>largest) {
				largest=i;
				System.out.println("Printing largest number step by step " +largest);
			}
			else if(i<smallest) {
				smallest = i;
				System.out.println("Printing smallest number step by step " +smallest);
			}
		}
		
		System.out.println("\n given array is::" +Arrays.toString(numbers));
		System.out.println("Largest number is::" +largest);
		System.out.println("Smallest number is::" +smallest);

	}

}
