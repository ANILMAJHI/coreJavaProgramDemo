import java.util.HashSet;
import java.util.Set;

public class AlphabetsCharacter {

	public static void main(String[] args) {

		String s = "THisis$#($&theSpecialCHar@";

		char[] c = s.toCharArray();
		StringBuffer alphabets = new StringBuffer();
		StringBuffer specialChars = new StringBuffer();
		for (int i = 0; i < c.length; i++) {

			if (Character.isAlphabetic(c[i]))

			{
				alphabets.append(c[i]);

			} else {
				specialChars.append(c[i]);
			}

		}
		System.out.println("alphabets :" + alphabets);
		System.out.println("specialChars :" + specialChars);
	}

}
