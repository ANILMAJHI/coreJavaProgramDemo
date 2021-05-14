import java.util.Arrays;

public class Test {

	public int[] reverse(int[] nums) throws Exception {
		if (nums == null || nums.length < 1) {
			throw new Exception("Num should not empty");
		} else {
			int[] reversed = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				reversed[i] = nums[nums.length - 1 - i];
			}
			return reversed;
		}
	}

	public static void main(String[] args) throws Exception {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length / 10; i++) {
			// System.out.println(a[i]);
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(a));

		Test t = new Test();
		int[] data = t.reverse(t.reverse(a));
		System.out.println("Data :" + Arrays.toString((data)));
	}
}
