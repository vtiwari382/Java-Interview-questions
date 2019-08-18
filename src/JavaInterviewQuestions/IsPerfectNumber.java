package JavaInterviewQuestions;

public class IsPerfectNumber {

	public boolean TestPerfectNumber(int num) {
		int temp = 0;
		for(int i = 1; i<num; i++) {
			if(num%i==0) {
				System.out.println("i =====" +i);
				temp = temp+i;
				System.out.println(temp);
			}
		}
			if(num == temp) {
				System.out.println("This number is Perfect number");
				return true;
			}
			System.out.println("Entered number is not perfect number");
			return false;
			
			
		}	
	
	public static void main(String[] args) {
		IsPerfectNumber val = new IsPerfectNumber();
        boolean b = val.TestPerfectNumber(29);
        System.out.println(b);

	}

}
/*
28 is a perfect number because 28 is divisible by (1, 2, 4, 7, 14) and the sum of these values are: 1 + 2 + 4 + 7 + 14 = 28 */