

import java.util.StringTokenizer;

public class StringTokanizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is a good   language";

		StringTokenizer st = new StringTokenizer(s, " ");

		String sreverse = " ";
		while (st.hasMoreTokens()) {
			sreverse = st.nextToken() + " " + sreverse;
			//System.out.println(sreverse);
		}
		System.out.println(sreverse);
		
		//reverses();
	}

	
	/*public static void reverses()
	{
		String s="I love My country";
		
		String rev = "";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens())
		{
			rev = st.nextToken()+""+rev;
		
		}
		System.out.println(rev);
		
	}*/
}
//o/p:language good a is java  

