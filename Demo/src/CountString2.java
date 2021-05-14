import java.util.HashMap;
import java.util.Map;

public class CountString2 {

	static void countCharacter(String s) {
		Map<Character, Integer> m = new HashMap<>();
		char[] c = s.toCharArray();
		for (char c1 : c) {
			if (m.containsKey(c1)) {
				m.put(c1, m.get(c1) + 1);
			} else {
				m.put(c1, 1);
				//System.out.print(m);
				
			}
		}
		System.out.print(m);
	}
	public static void main(String[] args) {
		countCharacter("java is my good language");
	}
}
