import java.util.Iterator;

public class firstNonRepeatedCharFirst {

	public static void main(String[] args) {
		
		String str="helloworld";
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			if(str.indexOf(c)==str.lastIndexOf(c))
			{
				System.out.println("first NonRepeatedCharFirst : "+c);
			}
		}

	}

}
