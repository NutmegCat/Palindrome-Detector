public class Palindrome {

	//initialize vars
	static String enteredValue;
	
	public static void main(String[] args) {

		// get word
		System.out.println("\nWhat is the word you'd like to use? 0 to quit");
		enteredValue = In.getString();

		if (isPalindrome(enteredValue)) {
			System.out.println("\nThe word " + enteredValue + " is palindrome\n");
		} else {
			System.out.println("\nThe word " + enteredValue + " is not a palindrome\n");
		}
	}

	// The method does a char by char comparison from front and backwards
	private static boolean isPalindrome(String original) {
		int length = original.length();
		int i = 0;
		while (i < length / 2) {
			char fromFront = original.charAt(i);
			char fromLast = original.charAt(length - 1 - i);
			if (fromFront == fromLast) {
				++i;
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}