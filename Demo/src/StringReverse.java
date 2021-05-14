public class StringReverse {
	// static int i;
	static void stringreverse(String s) {

	/*	char ch[] = new char[s.length()];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = s.charAt(i);
			for (int j = s.length() - 1; j > 0; j--){
				System.out.println(ch[j]);
		}
		}*/
		
//		String[] splitStr=s.split(" ");
//		for(String text : splitStr)
//		{
//			//System.out.println("Text : "+text);
//			char[] ch1=text.toCharArray();
//			for (int i = ch1.length-1; i >= 0; i--) {
//				 System.out.print(ch1[i]);
//				 }
//			System.out.print(" ");
//		}

		char[] ch = s.toCharArray();
		 for (int i = ch.length-1; i >= 0; i--) {
			 System.out.print(ch[i]);
		 }
		/*String[] splitStr=s.split(" ");
		String rev=" ";
		
		for(String text : splitStr){
			//System.out.println("text :"+text);
			char[] ch1=text.toCharArray();
			for (int i = ch1.length-1; i >= 0; i--) {
				rev+=ch1[i];
			}
			System.out.print(" ");
			}
		System.out.print(rev);
		System.out.println( "  ");
		String[] splitStr1=rev.split(" ");
		String rev1=" ";
		for(String text : splitStr1){
			char[] ch1=text.toCharArray();
			for (int i = ch1.length-1; i >= 0; i--) {
				rev1+=ch1[i];
				
			}
			}
		System.out.print(rev1);*/
	}
	public static void main(String args[]) {
		// System.out.println("Original String is : ");
		// System.out.println("my name is lakhan ");
		stringreverse("Anil Kumar Majhi"); 						//ihjaM ramuK linA
	}
}