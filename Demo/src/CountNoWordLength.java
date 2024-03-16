import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.print.StreamPrintService;

public class CountNoWordLength {
	public static void main(String[] args) {

		String str = "this is a good boys";
		List<String> t = Arrays.asList("this", "is", "a", "good", "boys");
		List<String> words = Arrays.asList(str.split("\\s+"));
		
		// "\\s" represents any whitespace character (space, tab, newline).
		// + denotes one or more occurrences of the preceding element, which is
		// whitespace in this case.

		Map<Integer, List<String>> map1 = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map1);
		Map<Integer, List<String>> map = t.stream().collect(Collectors.groupingBy(String::length));
		/* System.out.println(map); */
	}
}
