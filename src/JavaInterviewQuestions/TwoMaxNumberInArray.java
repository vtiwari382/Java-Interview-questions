package JavaInterviewQuestions;

import java.util.Arrays;

public class TwoMaxNumberInArray {

	public static void main(String[] args) {
      int num[] = {-10, 24, 50, -88, 987650, 987657, 987656};
		
		int FirstlargestNum = 0;
		int SecondLargestNum = 0;
		
		for(int i:num) {
			if(FirstlargestNum < i) {
				SecondLargestNum = FirstlargestNum;
				FirstlargestNum = i;
			}
			
			else if(FirstlargestNum>i) {
				SecondLargestNum = i;
			}
			
			System.out.println("printing first Largest number is::" +FirstlargestNum);
			System.out.println("Printing second largest number is::" +SecondLargestNum);
		}
		
		/*System.out.println("Largest number is::" +FirstlargestNum);
		System.out.println("Smallest number is::" +SecondLargestNum);*/

	}

}
