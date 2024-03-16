
public class CommonElementsInOneArray {

	public static void reverseString(int num[]) {
		int n = num.length;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (num[i] == num[j]) {
					System.out.print(" " + num[j]);
					break;
				}
			}

		}

	}

	public static void main(String[] args) {

		int[] num = { 8, 7, 5, 6, 2, 1, 5, 4, 9, 2, 3 };
		reverseString(num);

	}

}
