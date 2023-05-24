// Aaron Prince Anu

public class Palindrome {

	// global vars
	static int exit = 1;

	public static void main(String[] args) {

		while (exit == 1) {
			System.out.println("\nPlease select your choice\n");
			System.out.print("1. Check if entered String is a palindrome\n");
			System.out.print("2. Exit.\n");
			System.out.println("\nEnter Your Choice: ");
			System.out.print("   >  ");

			int choice = In.getInt();
			if (choice == 1) {
				System.out.println("\nEnter the string: ");
				System.out.print("   >  ");
				String enteredValue = In.getString();
				if (isPalindrome(enteredValue)) {
					System.out.println("\n--> The string " + enteredValue + " is a palindrome\n");
				} else {
					System.out.println("\n--> The string " + enteredValue + " is not a palindrome\n");
				}
			} else {
				System.out.println("\nExiting...\n");
				exit = 0;
			}
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