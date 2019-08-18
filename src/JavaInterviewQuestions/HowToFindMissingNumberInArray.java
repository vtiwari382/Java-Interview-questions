package JavaInterviewQuestions;

public class HowToFindMissingNumberInArray {

	public static void main(String[] args) {
		
		//int a[] = {1,2,3,4,5}
		//1+2+4+5= 12
		//1+2+3+4+5 = 15
		// 15-12 = 3 is missing number
		
	int a[] = {1,2,4,5};
	int sum = 0;
	
	for(int total:a) {
		sum=sum+total;
//	for(int i=0; i<a.length; i++) {
//		sum = sum+a[i]; //12
	}
	System.out.println("Missing number's sum is::"+sum);
	
	int sum1=0;
	for(int j=1; j<=5; j++) {
		sum1 = sum1+j; //15
	}
	System.out.println("Actual sum of number is::"+sum1);
	
	System.out.println("missing number is::" +(sum1-sum));
		

	}

}
