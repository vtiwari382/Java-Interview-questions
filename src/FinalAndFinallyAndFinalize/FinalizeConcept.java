package FinalAndFinallyAndFinalize;

public class FinalizeConcept {
	
	public void finalize() {
		System.out.println("Finalize method");
	}

	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();

	}

}
