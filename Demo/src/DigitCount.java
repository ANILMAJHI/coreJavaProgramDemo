public class DigitCount {

	public static void main(String[] args) {

		int i = 12345;
		
		int count1 = 0;
		while (i > 0) {
			count1++;
			i = i / 10;

		}
		System.out.println(count1);

		/*
		 * int count = 0; String str = Integer.toString(i); for (int j = 0; j <
		 * str.length(); j++) { count++; } System.out.println(count);
		 */

	}
}
