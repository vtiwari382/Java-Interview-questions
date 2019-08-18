package PatternPrograms;

import java.util.Scanner;

public class PatternProgram5 {

/*	
    
	7 6 5 4 3 2 1
	7 6 5 4 3 2
	7 6 5 4 3
	7 6 5 4
	7 6 5
	7 6
	7
	
*/	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
				
		for(int i=1; i<=number; i++) {
			for(int j=number; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		

	}

}
