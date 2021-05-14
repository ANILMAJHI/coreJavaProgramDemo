import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CountDuplicateList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");

		//System.out.println("\nExample 1 - Count 'a' with frequency");
		System.out.println("a : " + Collections.frequency(list, "a"));
	}
}
