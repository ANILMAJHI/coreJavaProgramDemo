
public class StringPadindrom {

	public static boolean isPalindrom(String str) {
		int length = str.length();

		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) == str.charAt(length - i - 1)) {
				
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		String s = "madam";
		boolean pal = isPalindrom(s);
		if (pal) {
			System.out.println(s + ": Is Palindrom");
		} else {
			System.out.println(s + ": Is not Palindrom");
		}

	}
}
