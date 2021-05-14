import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordSearcher {

	public static void main(String[] args) {

		String str="s d r dl r o dl o d f g m z q e p b m c";
		//String str="My name is anil majhhi";
		
		List l=Arrays.asList(str.split(" "));
		Set<String> s=new HashSet(l);
		for(String ss:s)
		{
			System.out.print(ss+"....."+Collections.frequency(l, ss));
		}
		
	}

}
