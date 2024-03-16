import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		

		int[] l = { -21, -1, -2, -4, -5, 0, -5 };

		String str = "tHis is java";
		
		int count=1;
		//char ch[]=str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
			{
				count++;
				
			}
			
		}
		//System.out.println("word = "+(count)+" "+" space = "+(count-1));

		for (int i = 0; i < l.length; i++) {

			for (int j = i + 1; j < l.length; j++) {
				if (l[i] == l[j]) {
				//	System.out.println("Arrays duplicate no is: " + l[i]);
				}
			}
		}
		int large = l[0];
		for (int i = 0; i < l.length; i++) {

			if (large < l[i]) {
				large = l[i];
			}

		}
		System.out.println("larage no is: " + large);

		for (int i = str.length() - 1; i >= 0; i--) {
			//System.out.println(str.charAt(i));

		}

		int temp;
		for (int i = 0; i < l.length / 2; i++) {

			temp = l[i];
			l[i] = l[l.length - 1 - i];
			l[l.length - 1 - i] = temp;
		}
		//System.out.println("Arrays reverse"+Arrays.toString(l));
	}
}
