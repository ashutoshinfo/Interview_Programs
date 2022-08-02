package info.ashutosh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SplitBySpace {
	public static void main(String[] args) {
		String input = "Ashutosh is Java Programmer, Ashutosh !";

		// String[] splited = input.split(" ");
		Set<String> items = new HashSet<>(Arrays.asList(input.split(" ")));

		for (String string : items) {
			System.out.println(string);
		}

	}

}
