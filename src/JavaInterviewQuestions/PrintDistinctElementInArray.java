package JavaInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PrintDistinctElementInArray {
	
	public static void main(String[] args) {
		int[] a = {2,3,4,5,6,7,8,2,4,9};	
		HashSet<Object> hash = new HashSet<Object>();
		for(int num:a) {
			if(hash.add(num)==true) {
				System.out.println("Using HashSet Non-Duplicate data is " +num);
			}
		}

	}

}
