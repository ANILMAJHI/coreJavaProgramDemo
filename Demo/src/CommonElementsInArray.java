
public class CommonElementsInArray {
	public static void main(String[] args) throws Exception {
		int num1[] = { 33, 44, 55, 66, 32, 32 };
		int num2[] = { 33, 21, 21, 92, 44 };
		
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				
				if (num1[i] == num2[j]) {
					System.out.println(num1[i]);
				}
			}
		}
	}
}
