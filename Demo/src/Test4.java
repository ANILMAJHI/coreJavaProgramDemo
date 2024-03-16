
public class Test4 {

	public static void main(String[] args) {
		String input = "ABBCCCDDDD";
		String output = reverseTransform(input);
		System.out.println(output);
	}

	private static String reverseTransform(String input) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			if (Character.isLetter(currentChar)) {
				result.append(currentChar);

				if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
					int repeatCount = Character.getNumericValue(input.charAt(++i));
					for (int j = 1; j < repeatCount; j++) {
						result.append(currentChar);
					}
				}
			}
		}

		return result.toString();
	}
}
