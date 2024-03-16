
public class MissingNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 6, 7 };
		int n = arr.length + 1;
		int missNo = 0;
		int expSum = (n * (n + 1)) / 2;
		int actSum = 0;
		for (int no : arr) {
			actSum = actSum + no;
		}
		missNo = expSum - actSum;

		System.out.println(missNo);
	}
}
