public class ArrayRevers {
	  public static void reverse(int[] num) 
	  {
		  for (int i = 0; i < num.length; i++)
		  {	  
			  int temp; 
			  temp = num[i]; 
			  num[i] = num[num.length -1 - i]; 
			  num[num.length- 1 - i] = temp; 
			  System.out.print(", ["+i+"] = " + num[i]); 
		 //System.out.print(i + num[i]); 
		  }
	  }

	public static void main(String[] args) {
		//int[] numbers = { 1, 2, 9,3, 4, 5, 6, 7 };
		//reverse(numbers);
		reverse(new int[]{ 1, 2, 9,3, 4, 5, 6, 7 });
	}
/*
	*//** * reverse the given array in place * @param input *//*
	public static void reverse(int[] input) {
		System.out.println("original array : " + Arrays.toString(input)); // handling
*/
	}

