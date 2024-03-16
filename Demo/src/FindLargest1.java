
public class FindLargest1 {

	public static void main(String[] args) {

		int[] number = { -61, -33, -63, -66, -26, 10, -11,0,11 };
		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}

		}
		System.out.println(max);

	}

}
