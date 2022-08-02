package info.ashutosh;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceofInstance {
	public static void main(String[] args) {
		List<Integer> sList = List.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6, 6, 6);
		Map<Integer, Long> collect = sList.stream()
				.collect(Collectors.groupingBy(Function.<Integer>identity(), Collectors.<Integer>counting()));
		System.out.println(collect);
		//Collector<Integer, ?, Map<Integer, Long>> groupingBy = Collectors.groupingBy(Function.<Integer>identity(),
		//		Collectors.<Integer>counting());

	}
}
