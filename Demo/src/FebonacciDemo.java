
public class FebonacciDemo {

	public static void main(String[] args) {

		int n1=0,n2=1;
		
		for(int i=3;i<11;i++) 	
		{
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
