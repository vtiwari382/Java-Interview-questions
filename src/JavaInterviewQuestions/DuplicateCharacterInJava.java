package JavaInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterInJava {

	// find middle index position where right sum = left sum
	
	public void DuplicateCharacter() {
		String str = "vivekPoonam";
		  int count = 0;
		  char[] inp = str.toCharArray();
//		  System.out.print("Duplicate Characters are: " );  
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
//			   System.out.println("Value of j after each iteration: " +j);
		    if (inp[i] == inp[j]) {	 
		     System.out.print(inp[j]+" " );
		     count++;	
		     break;
		    }
		   }
		  }

	}
	
//                     	OR
	
	public void DuplicateCharacternew() {
		String str = "vivekPoonam";
		  char[] inp = str.toCharArray();
		  Set<Object> st = new HashSet<Object>();
		  for(char test: inp) {
				  if(st.add(test)==false) {
					  System.out.println("duplicate data is " +test);
				  }
		  }
	}
	
	public static void main(String[] args) {
		DuplicateCharacterInJava dup = new DuplicateCharacterInJava();
//		dup.DuplicateCharacter();
		dup.DuplicateCharacternew();

	}

}
/*
toCharArray() method converts this string into character array.
*/