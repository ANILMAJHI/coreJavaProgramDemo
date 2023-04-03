
public class FindIndex {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 6, 7, 8, 9, 4 };
		int index = -1;
		int element = 2;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == element) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println("The index of " + element + " is " + index);
		} else {
			System.out.println("element is not available...");
		}

	}
}
