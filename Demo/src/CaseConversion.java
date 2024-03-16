

public class CaseConversion {

	public static void main(String[] args) {

		String input = "Java LanguagGe";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				builder.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				builder.append(Character.toUpperCase(c));
			}else {
				builder.append(c);
			}
			
		}
		System.out.println("Input:"+input);
		System.out.println("Convert:"+builder);
	}

}
