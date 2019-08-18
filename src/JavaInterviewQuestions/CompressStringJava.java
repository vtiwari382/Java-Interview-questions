package JavaInterviewQuestions;

public class CompressStringJava {

	String s1 = "aaazzbbccde";
	
	// output should be a3z2b2c2d1e
	
	public void StringCount(String s1) {
	int count =0;
	char temp = s1.charAt(0);
	
	for(int i=0; i<s1.length(); i++) {
		if(s1.charAt(i) == temp) {
			count++;
		} 
		else {
			System.out.print(temp+""+count);
			count = 1;
			temp = s1.charAt(i);
			
		}
	}
	
	System.out.println(temp);
		
	}
	
	public static void main(String[] args) {
		
		CompressStringJava com = new CompressStringJava();
		com.StringCount(com.s1);
		

	}

}
