public class AlternateCase {

	public static void main(String[] args) {
//		alternateCase("this is did HDG");
		alternateCase("THIS IS DID HDG");

	}

	public static void alternateCase(String input) {
		StringBuilder output = new StringBuilder();
		boolean toUpperCase = true;

		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				if (toUpperCase) {
					output.append(Character.toUpperCase(c));
				} else {
					output.append(Character.toLowerCase(c));
				}
				toUpperCase = !toUpperCase;
			} else {
				output.append(c);
			}
		}
		System.out.println(output.toString());
		// return output.toString();
	}
}
