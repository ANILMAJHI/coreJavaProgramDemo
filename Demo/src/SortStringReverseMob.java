import java.util.ArrayList;
import java.util.List;

public class SortStringReverseMob {

	
	/*public static String reverseSort(String Input) {
		char[] ch = Input.toCharArray();
		List<Character> l = new ArrayList<>();
		for (char c : ch) {
			l.add(c);
		}
		Collections.sort(l);
		Collections.reverse(l);
		return l.toString();
	}
*/
	public static void reverseSort2(String input) {
		List<Character> l = new ArrayList<>();
		char[] ch = input.toCharArray();
		int n = ch.length;
		int temp = 0;
		for (int i = 0; i <= n - 1; i++) {
			for (int j = i + 1; j <= n - 1; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = (char) temp;
				}
			}
			l.add(ch[i]);
		}
		for (int i = l.size() - 1; i >= 0; i--) {
			System.out.print(l.get(i));
		}
	}

	public static void main(String[] args) {
		// System.out.println(reverseSort("9467823015"));
		reverseSort2("9467823015");
	}
}
