import java.util.ArrayList;

public class IndexOfArrayListDemo {

	public static void main(String args[]) {
		// Creating an empty array list
		ArrayList al = new ArrayList();

		// Adding elements to the arraylist
		al.add("Element1");
		al.add("Element3");
		al.add("Element2");
		al.add("Element4");

		if (al.contains("Element2")) {
			System.out.println("Element2 is present at the index " + al.indexOf("Element21"));
		} else {
			System.out.println("Element2 is not present in the list");
		}
	}

}
