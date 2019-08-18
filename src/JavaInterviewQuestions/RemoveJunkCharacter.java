package JavaInterviewQuestions;

public class RemoveJunkCharacter {

	public static void main(String[] args) {
	String	s= " !@#$%Vivek )(*&^%$#@) TIWARI ";
	s= s.replaceAll("[^a-zA-Z0-9]", "");    // this line will replace all characters excluding ^a-zA-Z0-9. note "^" sign is most imp 
//	s=s.replaceAll("", " ");     // to get the space between every single alphabets
	System.out.println(s);

	}

}

// Note: "^" sign is must to include in bracket, as ^ sign will help to hold the only written character after this and exclude others.