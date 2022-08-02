package info.ashutosh;

public class Palindrom {

	private static boolean isPalindrom(String input) {

		int startCursor = 0;
		int endCursor = input.length() - 1;

		while (startCursor < endCursor) {
			if (input.charAt(startCursor) != input.charAt(endCursor)) {
				System.out.println("Not Palindrom !");
				return false;
			}
			startCursor++;
			endCursor--;
		}

		System.out.println("Palindrom !");
		return true;

	}

	public static void main(String[] args) {
		Palindrom.isPalindrom("madam");
	}

}
