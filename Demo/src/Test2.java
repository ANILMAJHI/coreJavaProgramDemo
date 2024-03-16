import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) throws Exception {

		List<Integer> l = Arrays.asList(21, 1, 2, 4, 5, 6, 5);
		// List<Integer> li=l.stream().distinct().collect(Collectors.toList());
		// List<Integer>
		// li=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		// int li=l.stream().mapToInt(Integer::valueOf).sum();
		// l.stream().map(s->s+"").filter(s->s.startsWith("2")).forEach(System.out::println);
		Set<Integer> s1 = new HashSet<>();
		// l.stream().map(s->s).filter(s->!s1.add(s)).forEach(System.out::println);
		long li = l.stream().mapToInt(s -> s).count();
		System.out.println(li);

		int suma = l.stream().mapToInt(Integer::valueOf).sum();
		Optional<Integer> suma1 = l.stream().reduce((a,b)->a+b);
		System.out.println("sum is:"+suma);
		System.out.println("sum is:"+suma1);
	}

}
