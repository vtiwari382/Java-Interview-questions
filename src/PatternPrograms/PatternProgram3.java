package PatternPrograms;

import java.util.Scanner;

public class PatternProgram3 {

/*	
    1 2 3 4 5 6 7
    1 2 3 4 5 6
    1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1 
	
*/	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to print");
		int input = scan.nextInt();
		
		for(int i=input; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");       // to print in star use "*" in place of j
			}
			System.out.println("");
		}
		
		

	}

}
