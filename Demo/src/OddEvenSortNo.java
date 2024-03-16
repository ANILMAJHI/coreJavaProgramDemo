import java.util.Arrays;

public class OddEvenSortNo {

	static void oddEven(int[] num)

	{
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0 ) {
				System.out.print(num[i] + ",");
			}

		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + ",");
			}

		}
	}

	public static void main(String[] args) {

		int[] n = { 5, 3, 4, 1, 6, 8, 9, 2 };
		oddEven(n);
	}

}
