import java.util.Arrays;

public class PairOfElements {

	public static void findElements(int arr[], int no)

	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == no) {
					System.out.println(arr[i] + "+" + arr[j] + "=" + no);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findElements(new int[]{ 9, 6, 4, 12, 7, 10, 5 }, 16);

	}

}
