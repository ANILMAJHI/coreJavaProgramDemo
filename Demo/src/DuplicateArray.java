class DuplicateArray {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 7, 11,11, 12 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] == num[j])
					System.out.println("The duplicate number in this array: "+num[i]);

			}
		}

	}
}