import java.util.Arrays;
import java.util.Collections;

public class LargestNo {
	public static void main(String[] args) {

		String[] str = { "11", "8", "16", "4", "23", };// 84231611

		{
			Arrays.sort(str, Collections.reverseOrder((s1, s2) -> s1.compareTo(s2)));
			StringBuffer sb = new StringBuffer();
			for (String s : str) {
				sb.append(s);
			}
			System.out.println(sb.toString());
		}
	}

}
