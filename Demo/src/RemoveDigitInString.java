
public class RemoveDigitInString {

	public static void main(String[] args) {

		String str = "this is 12 java33";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}

		// str.chars().mapToObj(ch -> (char) ch).filter(ch ->
		// !Character.isDigit(ch)).forEach(System.out::print);
	}

}
