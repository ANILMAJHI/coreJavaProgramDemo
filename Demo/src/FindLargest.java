
public class FindLargest {
	public static void main(String[] args) {

		int[] number = { -69, -33, -63, -66, -26,0,11 };
		int large = 0;
		for (int i = 0; i < number.length; i++) {
			//if (number[i] < 0) {
				if (large == 0 || number[i] > large) {
					large = number[i];
					System.out.println(large);
				}
			}

	//	}
		System.out.println(large);
	}

}
