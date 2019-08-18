package JavaInterviewQuestions;

import java.util.Random;

public class GenerateRandomNumberInJava {
	
	public void RandomNumber() {
		Random ran = new Random();
		
		for(int i=0; i<15; i++) {
			int num = ran.nextInt(200);
			System.out.println("Random numbers between 1 - 200 are :" +num);
		}
	}

	public static void main(String[] args) {
		GenerateRandomNumberInJava random = new GenerateRandomNumberInJava();
		random.RandomNumber();

	}

}
