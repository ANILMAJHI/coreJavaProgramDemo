
public class LowerCasaeUpperCase {

	public static void main(String[] args) {

		String str = "This is java coding, This is java coding";

		int mid = str.length() / 2;
		String lowercase = "";
		String upppercase = "";
		for (int i = 0; i < str.length(); i++) {

			if (i < mid) {
				lowercase = lowercase + Character.toLowerCase(str.charAt(i));
			} else {
				upppercase = upppercase + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(lowercase + upppercase);

	}

}
