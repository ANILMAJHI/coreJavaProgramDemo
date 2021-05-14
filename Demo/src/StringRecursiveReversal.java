public class StringRecursiveReversal 
{
	 static String reverse(String str) 
	 {
		if ((str == null) || (str.length() <= 1)) 
		{
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String a[]) 
	{
		//StringRecursiveReversal srr = new StringRecursiveReversal();
		System.out.println("Result: " + reverse("Anil Kumar Majhi"));//ihjaM ramuK linA // //ihjaM ramuK linA

	}
}
