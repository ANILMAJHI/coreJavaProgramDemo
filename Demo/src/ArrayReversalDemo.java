import java.util.Arrays;

public class ArrayReversalDemo {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3,9,4, 5, 6, 7,8 };
		reverse(numbers);
	}

	/** * reverse the given array in place * @param input */
	public static void reverse(int[] input) {
		
		for (int i = 0; i < input.length / 2; i++) {
			
			int temp = input[i];
			// swap numbers
			input[i] = input[input.length - 1 - i];
			input[input.length - 1 - i] = temp;
		}
		System.out.println("reversed array : " + Arrays.toString(input));
	}

}
