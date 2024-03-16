import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Anil Kumar Majhi good boy";
		// System.out.println(str);
		findduplicatecharInString(str);
	}

	static void findduplicatecharInString(String str) {
		
		String[] split=str.split(" ");
		for (int i = 0; i < split.length/2; i++) {
			
			String temp=split[i];
			split[i]=split[split.length-1-i];
			split[split.length-1-i]=temp;
			//System.out.println(temp);
		}
		for(String name:split) {
		System.out.print(" "+name);
		}
	}
}
