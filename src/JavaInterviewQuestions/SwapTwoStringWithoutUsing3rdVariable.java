package JavaInterviewQuestions;

public class SwapTwoStringWithoutUsing3rdVariable {

	public static void main(String[] args) {
		// Swap two string without using 3rd variable or temp variable.
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("before Swapping");
		System.out.println("the Value of a is ::" +a);
		System.out.println("the value of b is ::" +b);
		
		// 1. Append a and b
		a= a+b;  // now a = HelloWorld
		
		// 2. Store initial String a in String b
		b = a.substring(0, a.length()-b.length()); // in this case a = "HelloWorld" and b = "World", so a-b = "Hello" store in b and 0 is beginning index value
		
		// 3. Store initial String b in String a
		a = a.substring(b.length()); // b.length is start index means 5(hello) so after excluding "hello" rest string will save in a 
		
		
		System.out.println("After Swapping");
		System.out.println("the Value of a is ::" +a);
		System.out.println("the value of b is ::" +b);
		
	}

}
