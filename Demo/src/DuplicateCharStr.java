import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCharStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "India is my country";// output country my is India
		String str = "java toto j ";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.print(", "+str.charAt(i));
				}
			}
		}
		
	}

}
