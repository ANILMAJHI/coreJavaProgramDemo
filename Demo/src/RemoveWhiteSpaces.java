
class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str=null;
		
		str = "  This is a good 	boy and i live in india";
		//str="3,44,55,12,43";

		// 1. Using replaceAll() Method
	/*	System.out.println(str);

		String strWithoutSpace = str.replaceAll(",", "");

		System.out.println(strWithoutSpace); // Output :
												// CoreJavajspservletsjdbcstrutshibernatespring
*/
		// 2. Without Using replaceAll() Method

		char[] strArray = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
				
			}
		}

		System.out.println(sb); // Output :
								// CoreJavajspservletsjdbcstrutshibernatespring

	}
}
