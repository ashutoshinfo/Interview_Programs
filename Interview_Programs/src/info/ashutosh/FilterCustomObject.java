package info.ashutosh;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterCustomObject {
	public static void main(String[] args) {

		List<String> genderList = List.of("male", "female", "female", "male", "male", "male");
		List<String> collectOfMale = genderList.stream().filter(s -> s.equalsIgnoreCase("Male")).limit(100)
			.collect(Collectors.toList());

		Map<String, Long> sMap = genderList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (String string : collectOfMale) {
			System.out.println(string);
		}

		System.err.println(sMap.get("female"));
		System.err.println(sMap.get("male"));
		System.err.println(sMap.values());
		int size = sMap.values().size();
		System.err.println(size);

	}

}
