public class BubbleSort {

	public static void main(String[] args) {

		// create an int array we want to sort using bubble sort algorithm
		int intArray[] = new int[] {8,2,6,1,5,3,2,4,0,9 };	//9 8 6 5 4 3 2 2 1 0 

		// print array before sorting using bubble sort algorithm
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		// sort an array using bubble sort algorithm
		bubbleSort(intArray);
		System.out.println("");
		// print array after sorting using bubble sort algorithm
		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
	private static void bubbleSort(int[] intArray) {
		int n = intArray.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (intArray[j - 1] < intArray[j]) {
					// swap the elements!
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
	}
}                                                                                                                             