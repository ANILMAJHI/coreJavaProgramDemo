import java.util.Arrays;

public class demo {

	public static void main(String[] args) {

		arrayReverse(new int[] {3,2,5,6,1,7}); //6
	}

	static void arrayReverse(int num[])
	{
		for (int i = 0; i < num.length/2; i++) {
			
			int temp=num[i];
			num[i]=num[num.length-1-i];
			num[num.length-1-i]=temp;
			//sSystem.out.println(num[i]);
		}
		System.out.println(Arrays.toString(num));
		
	}
}
