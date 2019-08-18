package JavaInterviewQuestions;

public class CalculateSumOfArray {
	

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40};
		int	sum = 0;
		
//		for(int i=0; i<a.length; i++) {
//		 sum = sum+a[i];
		
//		use either above code or below code
		
		for(int i:a) {
			sum=sum+i;
			
			System.out.println("Storing the array addition value:" +sum);
		}
		System.out.println("Storing the final addition value of array :" +sum);
	}
	
		

	}



