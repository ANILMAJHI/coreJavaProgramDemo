import java.util.Arrays;

public class AlternateCase2 {

	public static void main(String[] args) {
		String input = "this is did HDG";
		String output = alternateCase(input);

		System.out.println("Original String: " + input);
		System.out.println("Alternate Case String: " + output);
	}

	public static String alternateCase(String input) {
		StringBuilder result = new StringBuilder();
		boolean upperCase = true;
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			if (Character.isWhitespace(currentChar)) {
                // Toggle the case for the next word
                upperCase = !upperCase;
            } else {
                // Alternate the case for each character within a word
                if (upperCase) {
                    result.append(Character.toUpperCase(currentChar));
                } else {
                    result.append(Character.toLowerCase(currentChar));
                }
            }
        }

		return result.toString();
	}
}
