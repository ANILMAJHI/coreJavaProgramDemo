
public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withoutloop(1);

	}

	static void withoutloop(int i)
	{
		if(i<=100)
		{
			System.out.println(i);
			withoutloop(i=i+1);
		}
	}
}
