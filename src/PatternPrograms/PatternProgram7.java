package PatternPrograms;


public class PatternProgram7 {

/*	
    1 2 3 4 5 6 7
    1 2 3 4 5 6
    1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1 
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
	1 2 3 4 5 6
	1 2 3 4 5 6 7
	
	
*/	
	
	public static void main(String[] args) {
		
		for(int i=7; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");   // to print in star use "*" in place of j
			}
			System.out.println(" ");
			
		}
		
		for(int k=2; k<=7; k++) {
			for(int m=1; m<=k; m++) {
				System.out.print(m+" ");   // to print in star use "*" in place of m
			}
			System.out.println(" ");
		}
		

	}

}
