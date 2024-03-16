import java.util.StringTokenizer;

public class ReverseWords  {

	public static void main(String[] args) {
		String input = "This is wordl";
		String reversedWords = reverseWords(input);
		System.out.println(reversedWords);
	}

	public static String reverseWords(String input) {
		// Split the input string into words using space as the delimiter
		String[] words = input.split(" ");

		// Create a StringBuilder to build the reversed string
		StringBuilder reversed = new StringBuilder();

		// Iterate through the words in reverse order and append them to the
		// StringBuilder
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if (i > 0) {
				reversed.append(" "); // Add a space between words
			}
		}

		return reversed.toString();
	}

}
