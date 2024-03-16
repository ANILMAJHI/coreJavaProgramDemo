
public class capitalizeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java is a good languLage";

		char[] ch = str.toCharArray();
		ch[0] = Character.toUpperCase(ch[0]);
		
		for (int i = 1; i < ch.length; i++) {
			if (Character.isWhitespace(ch[i - 1])) {
				ch[i] = Character.toUpperCase(ch[i]);
			}else {
				ch[i]=Character.toLowerCase(ch[i]);
			}

		}
		String s = new String(ch);
		System.out.println(s);
	}

}
