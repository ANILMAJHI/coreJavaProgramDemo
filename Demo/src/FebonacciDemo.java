
public class FebonacciDemo {

	public static void main(String[] args) {

		int n1=1,n2=2;
		
		for(int i=3;i<31;i++) 	
		{
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
