import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDuplicateAllowed {
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>(new MyComprator());
		s.add(1);// i2
		s.add(2);// i1
		s.add(3);
		s.add(3);
		s.add(2);
		System.out.println(s);
	}
}

class MyComprator implements Comparator<Integer> {
	@Override
	public int compare(Integer i1, Integer i2) {
		// System.out.println(i1 + " " + i2);
		if (i1 < i2) {
			return +1;
		} else if (i1 > i2) {
			return +1;
		} else {
			return -7;
		}
	}
}
