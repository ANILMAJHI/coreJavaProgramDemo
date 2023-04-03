
public class SpecialCharacter {

	public static void main(String[] args) {
		 String s = "THisis$#($&theSpecialCHar@";
		 //String s = "jdflajflkdjfl#kjsldfjl";

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))
					&& !Character.isLetter(s.charAt(i))) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Special Character is not found");
		} else
			System.out.println(count+" Special Charater is found");

	}

}
