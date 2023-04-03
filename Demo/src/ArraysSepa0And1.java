import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArraysSepa0And1 {

	public static void main(String[] args) {
		int no[] = { 1, 1, 0, 1, 0, 0, 1, 1, 0 };
		// System.out.print(Arrays.toString(no));
		ArraysSepa0And1.SeparateNo(no);
	}

	public static void SeparateNo(int arr[]) {

		/*
		 * int lenArray = arr.length; int temp, left = 0; int right = lenArray - 1;
		 * 
		 * if (lenArray <= 1) { return; } while (arr[left] %2 ==0 && left < right) {
		 * left++; } while (arr[right] %2 ==1 && left < right) { right--; } if (left <
		 * right) { temp = arr[left]; arr[left] = arr[right]; arr[right] = temp;
		 * 
		 * left++; right--;
		 * 
		 * } System.out.println(Arrays.toString(arr));
		 */

		/*
		 * int j = 0; for (int i = 0; i < arr.length; i++) { if (arr[i] == 0) { arr[j++]
		 * = arr[i]; } } while (j < arr.length) { arr[j++] = 1; } for (int k = 0; k <
		 * arr.length; k++) { System.out.print(arr[k] + " "); }
		 */

		List<Integer> num = Arrays.asList(1, 1, 0, 1, 0, 0, 1, 1, 0);
		LinkedList<Integer> l = new LinkedList<>();

		for (int val : num) {
			if (val == 0)
				l.addFirst(val);
			else
				l.addLast(val);
		}
		System.out.print(l);

	}

}
