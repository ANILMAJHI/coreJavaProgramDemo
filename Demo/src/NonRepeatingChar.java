
public class NonRepeatingChar {

	public static void main(String[] args) {
		
		String str="hellow covid19 world";
		
		for(int i=0;i<str.length();i++)
		{
			boolean b=true;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					b=false;
					break;
				}
			}
			if(b)
			{
				System.out.println("non repeating character:"+str.charAt(i));
			}
		}
		

	}

}
