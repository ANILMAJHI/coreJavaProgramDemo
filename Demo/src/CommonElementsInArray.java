import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		
		//static void arrayUnion(int num1[] , int num2[] ) {
		//Set<Integer> s=new HashSet<>();
		List<Integer> s= new ArrayList<>();
		for (int i = 0; i < num1.length; i++) {
			s.add(num1[i]);	
		}
		
		for (int i = 0; i < num2.length; i++) {
			s.add(num2[i]);	
		}
		System.out.println(s);
		}
		
	//}
}
