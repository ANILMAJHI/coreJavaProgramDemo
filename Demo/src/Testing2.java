import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testing2 {

	static void caseConversion(List<Integer> l) {
		
		Map<Integer, Long> ls=l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("ls :"+ls);
		
		String str="java is a good langualge is a the";
	Map<String, Long> stri=	Arrays.stream(str.split("\\s")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println("stri: "+stri);

		Map<Integer, Integer> m = new HashMap<>();
		for (int i : l) {

			if (m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else {

				m.put(i, 1);
			}

		}
		System.out.println(m);

	}

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(2, 3, 4, 1, 5, 7, 4, 3, 2,4, 1, 2, 6);
		caseConversion(l);

	}

}
