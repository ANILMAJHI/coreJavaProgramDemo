import java.util.Arrays;

public class TrickyCode {

	public static void main(String[] args) {

		//System.out.println('c' + 'o' + 'd' + 'e');

		String s1 = null;
		Object o1=null;

		if (s1==o1) {
			System.out.println("true");
			
		}else {
			//System.out.println("false");
		}

	
		//System.out.println(s1.equals("java"));
		//System.out.println("java".equals(s1));


		String str = 1+2+"ONE"+1+2+"TWO";
		String ss1=1+2+" ";
		String ss2=1+2+"ONE"+"TWO"+1+2;
		//System.out.println(ss1);
		//System.out.println(ss2);
		 //System.out.println(str);
		 
		String s2 = new String("coding");
		String s3 = new String("CODING");
		//System.out.println(s2 = s3);
		//System.out.println(s2 == s3);
		
		String s4 = "coding";
		StringBuffer s5 = new StringBuffer(s4);
		System.out.println(s4.equals(s5));


	}

}