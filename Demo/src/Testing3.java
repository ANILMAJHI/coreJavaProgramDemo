import java.util.Arrays;

public class Testing3 {

	// TODO Auto-generated method stub
	public static void reverseString(int[] num) {
		int sum = 0;
		int actual = 0;
		int misnol=0;
		int n = num.length + 1;
		sum = (n * (n + 1)) / 2;
		
		for (int no : num) {

			actual = actual + no;
		}
		
		misnol=sum-actual;
		System.out.println(misnol);
	}

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 5, 6 };
		reverseString(num);
		// reverseString("this is 12 java33");

	}

}
