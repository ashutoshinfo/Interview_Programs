package info.ashutosh;

import java.util.function.Function;

public class ConutAndRemoveSpacesFromString {

	public static void main(String[] args) {
		String text = "a bb ccc dddd";
		Function<String, Integer> spaceCount = (s) -> s.length() - s.replaceAll(" ", "").length();
		Integer apply = spaceCount.apply(text);
		System.out.println("Total Spaces :"+apply);
		System.out.println("Original Test :"+text);
		System.out.println("String Without Spaces :"+text.replaceAll(" ", ""));

	}

}
