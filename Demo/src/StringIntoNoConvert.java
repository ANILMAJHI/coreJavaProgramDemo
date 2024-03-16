
public class StringIntoNoConvert {

	public static void main(String[] args) {

		stringNo("A1B2C3D4");
	}

	static void stringNo(String str) {

		StringBuffer sb = new StringBuffer();
		char chNo = 0;
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (Character.isLetter(c)) {
				chNo = c;
				//sb = sb.append(c);
			} else if (Character.isDigit(c)) {

				// count = count.append(c);
				int n = Character.getNumericValue(c);
				for (int i = 0; i < n; i++) {
					sb = sb.append(chNo);

				}
			}

		}
		System.out.println(sb.toString());
	}

}
