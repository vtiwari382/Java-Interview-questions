package FinalAndFinallyAndFinalize;

public class FinallyConcept {
	
	public static void division() {
		
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		}
		
		finally {
			System.out.println("execute this code even after any execution");
		}
	}

	public static void main(String[] args) {
		division();
		}
		
	}

// Note: Finally block must execute if it is define in program


