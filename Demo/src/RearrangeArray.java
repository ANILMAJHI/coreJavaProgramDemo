
public class RearrangeArray {

	public static void main(String[] args) {

		 int[] arr = {3, 5, 1, 2, 6, 8, 9, 7};
		 int left=0;
		 int right=arr.length-1;
		 while(left<right)
		 {
			 while(arr[left]%2!=0 && left<right)
			 {
				 left++;
			 }
			 while(arr[right]%2==0 && left<right)
			 {
				 right--;
			 }
			 if(left<right)
			 {
				 int temp=arr[left];
				 arr[left]=arr[right];
				 arr[right]=temp;
			 }
		 }
		 System.out.println("Rearranging Array is:");
		 for(int num:arr)
		 {
			 System.out.print(num+" ");
		 }
	}

}
