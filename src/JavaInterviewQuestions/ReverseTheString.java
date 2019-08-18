package JavaInterviewQuestions;

public class ReverseTheString {

	public static void main(String[] args) {
		String s = "selenium is automation tool";
// Using for loop method
		
		int len = s.length();  // this line will give the total length of character
		System.out.println(len);  // this line is optional to print the length of character.
		String rev = "";
		for(int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);  //muineles
		}
		System.out.println(rev);
		
		
		// Using StringBuffer Class
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}

/*// Note: 1. String is Immutable class so reverse method is not available in it and StringBuffer is Mutable.
         Interview Questions:
1. Reverse a String.
2. Diff b/w String and StringBuffer.
3. do we have reverse function in String?  Ans is NO, it's available in StringBuffer*/