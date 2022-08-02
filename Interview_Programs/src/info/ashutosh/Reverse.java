package info.ashutosh;

public class Reverse {
	public static void main(String[] args) {
		String inputString = "1212";
		String reversed = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
			reversed = reversed + inputString.charAt(i);
		}

		System.out.println(reversed);
	}

}
