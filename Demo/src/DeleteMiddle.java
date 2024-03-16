import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DeleteMiddle {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(0, "1");
		linkedList.add(1, "2");
		linkedList.add(2, "3");
		linkedList.add(3, "4");
		linkedList.add(4, "58");
		System.out.println(linkedList); // [1, 2, 3, 4, 5] // Direct removal of element at index 2
		// linkedList.remove(2);
		System.out.println(linkedList); // [1, 2, 4, 5] // Iterate list and remove element containing String "4"
										//
		Iterator listIterator = linkedList.iterator();
		while (listIterator.hasNext())
			listIterator.hasNext();
		{
			if ("4".equals(listIterator.next())) {

				listIterator.remove();
			}
		}
		System.out.println(linkedList);
	}

	/*
	 * Integer num[] = { 7, 8, 5, 8, 9, 3 }; List <Integer>
	 * l=Arrays.asList(num);for( int a:l) { System.out.print("," + a);
	 * 
	 * 
	 * for (int i = 0; i < num.length; i++) { List l = Arrays.asList(num[i]);
	 * System.out.println(l.remove(2));
	 * 
	 * }
	 */
}
