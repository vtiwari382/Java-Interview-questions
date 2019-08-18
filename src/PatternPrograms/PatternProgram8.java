package PatternPrograms;

public class PatternProgram8 {
	/*
	1
	2 3
	4 5 6
	7 8 9 10
	11 12 13 14 15
	16 17 18 19 20 21
	22 23 24 25 26 27 28
*/
	static int k=1;
	public static void main(String[] args) {
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		

	}

}
