package JavaInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class HowToFindDuplicateElementInJavaArray {

	public static void main(String[] args) {
		String names[] = {"java", "javascript", "ruby", "python", "c", "c++", "java"};
		
		//1. compare each element
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("duplicate element is::" +names[i]);
					
				}
			}
		}
		System.out.println("Printing next solution of this question");
		
		
		//2. Using HashSet: java collection: it stores unique value
		
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name)==false) {
				System.out.println("using hashset Duplicate element is::" +name);
			}
		}
		

	}

}
