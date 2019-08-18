package JavaInterviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "The rains have started here ";
		String str1 = "The rains Have started here ";
		
		
		System.out.println("Length of string is " +str.length());     // this will return the total length of string
		System.out.println("Character at position 5 is " +str.charAt(5));    // this will return the character at position 5th, use for the string
		System.out.println("position of s in string is " +str.indexOf("s")); // this will return the position of 1st character s in string
		System.out.println("Position of 2nd S in string is " +str.indexOf("s", str.indexOf("s")+1));  // this will find the 2nd position of character s in string
		System.out.println("Index position of have is " +str.indexOf("have"));  // this will return the index position of have.
		System.out.println("This will return the index position of hello " +str.indexOf("Hello")); // this will return -1 because hello is not present in str
		System.out.println("comparision of two string including Upper and lower case and space is "+str.equals(str1));    // this will compare the string including space and upper lower case and return the true.
		System.out.println("Comaparision of two string excluding space and upper lower case " +str.equalsIgnoreCase(str1));  // this will compare the string excluding space and upper lower case.
		System.out.println("fetching string range 0-9 " +str.substring(0, 9));  // this will return subString from the original string
		
		// TRim Method
		String s = "  Hello World  ";
		System.out.println("using the trim method removing the space " +s.trim());  // this will remove the before and after space after the character
		
		// Replace Method
		String date = "01-01-2018";
		System.out.println("replacing the defined old character with new character " +date.replace("-", "/"));  // this method will replace the old symble or space with new
		
		// SPlit Method
		String test = "Hello_World_Test_Selenium"; 
		String testval[] = test.split("_");   // this method will split the each string from "_" and saves them in testval[] array form
		for(int i=0; i<testval.length; i++) {  // using loop to get total size of string
			System.out.println(testval[i]);    // printing all values one by one
		}
		
		// concat method
		String s2 = "cares";   
		System.out.println("Adding two Strings " +s2.concat("s"));  // this method will add the two string
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);  // output will be "HelloWorld".
		System.out.println(a+b);      // output will be "300".
		System.out.println(x+y+a+b);  // output will be "HelloWorld100200".
		System.out.println(a+b+x+y);  // Output will be "300HelloWorld".
		System.out.println(x+y+(a+b)); // Output will be "HelloWorld300".
		

	}

}
