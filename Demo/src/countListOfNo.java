import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class countListOfNo {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 2, 1, 5, 2, 3, 4, 5);

		// using java8
		// Map<Object, Long> m
		// =numberList.stream().collect(Collectors.groupingBy(Integer::valueOf,
		// Collectors.counting()));

		// System.out.println(m);

		Map<Integer, Integer> map = new HashMap<>();

		// Object[] numArr=numberList.toArray();
		for (Integer n : numberList) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);

			} else {
				map.put(n, 1);
			}
		}
		System.out.println(map);
	}
}
