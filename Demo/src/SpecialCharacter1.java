import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SpecialCharacter1 {

	public static void main(String[] args) {

		String s = "THisis$#($&theSpecialCharacter @";

		int count = 0;
		String specialCharRemove = "";
		for (int j = 0; j < s.length(); j++) {
			if (Character.isLetter(s.charAt(j))) {
				count++;
				specialCharRemove = specialCharRemove + s.charAt(j);

			} else {
//				//specialCharRemove = specialCharRemove + s.charAt(j);
			}
		}
		if (count == 0) {
			System.out.println("Special character not found...");
		} else {
			System.out.println(count + ": Special character is found");
		}
		System.out.println(specialCharRemove);

	}

}
