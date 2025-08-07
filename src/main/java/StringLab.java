public class StringLab {

	public static void main(String[] args) {
//		findStringSize();
//		accessCharacter();
//		extractSubstring();
//		changeCase();
		findIndex();
	}

	//	Exercise 1: Finding the String's Size
	static void findStringSize() {
		String greeting = "Hello, Cadets!";
		int length = greeting.length();
		System.out.println("The length of the string is: " + length);
	}

	//	Exercise 2: Accessing a Character
	static void accessCharacter() {
		String message = "Keep learning!";
		char character = message.charAt(5);
		System.out.println("The character at index 5 is: " + character);
	}

	//	Exercise 3: Extracting a Part of a String
	static void extractSubstring() {
		String statement = "Java is powerful.";
		String part = statement.substring(5, 7);
		System.out.println("The extracted substring is: " + part);
	}

	//	Exercise 4: Changing Case
	static void changeCase() {
		String mixedCase = "This Is A Test";
		String upper = mixedCase.toUpperCase();
		String lower = mixedCase.toLowerCase();
		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);
	}

	//	Exercise 5: Finding a Character or Substring
	static void findIndex() {
		String sentence = "The quick brown fox jumps over the lazy dog.";
		int indexOfFox = sentence.indexOf("fox");
		int indexOfZ = sentence.indexOf('z');
		int indexOfCat = sentence.indexOf("cat");
		System.out.println("Index of 'fox': " + indexOfFox);
		System.out.println("Index of 'z': " + indexOfZ);
		System.out.println("Index of 'cat': " + indexOfCat);
	}

}