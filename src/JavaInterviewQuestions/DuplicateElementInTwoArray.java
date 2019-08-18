package JavaInterviewQuestions;

import java.util.Arrays;

public class DuplicateElementInTwoArray {
	
	public void ComparingTwoArray() {
	
	int[] one = {3,4,5,6,7};
	int[] two = {9,3,4,2,5,1,6,12,7};
	
	/*for(int i=0; i<one.length; i++) {
		for(int j=0; j<two.length; j++) {
			if(one[i]==two[j]) {
			System.out.print(one[i]+", ");
*/      
	//use above code or below code
	
	for(int first:one) {
		for(int second:two) {
			if(first==second) {
				System.out.println("Matching Array data in one int is " +first);
				
			}
		}
	}
	
	}

	public static void main(String[] args) {
		DuplicateElementInTwoArray dup = new DuplicateElementInTwoArray();
		dup.ComparingTwoArray();
		
	}

}
