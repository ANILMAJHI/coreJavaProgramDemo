import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDupliElement {
	public static void main(String[] args) {
		int[] array = { 3, 2, 1, 2, 5, 4,  2, 3, 6, 7, 8, 9,6 };
		//List<Integer> l = Arrays.asList(3, 2, 1, 2, 5, 2, 4, 3, 2, 3, 6, 7, 8, 9);

		Set<Integer> set = new HashSet<Integer>();
		//Set<Integer> set1 = new HashSet<Integer>();

		// l.stream().filter(x -> !set1.add(x)).collect(Collectors.toSet()).forEach(x ->
		// System.out.println(x));

		for (int i = 0; i < array.length; i++) {
			// If same integer is already present then add method will return FALSE
			if (set.add(array[i]) == false) {
				
					System.out.println("Duplicate element found : " + array[i]);
				}
		}

	}
}