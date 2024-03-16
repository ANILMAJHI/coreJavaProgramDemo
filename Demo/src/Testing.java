import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Testing {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		m.put(1, "aio");
		m.put(2, "bule");

		m.put(4, "sain");
		m.put(42, "sain");
		m.put(53, "gra");
		m.put(13, "all");
		m.put(34, "dur");
		Map<Integer, String> kv=m.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(s1,s2)->s1, LinkedHashMap::new));
		System.out.println(kv);
		
		String s="java";
		String s1="java";
		String s2=new String("java");
		String s3=new String("java");
		/*System.out.println(s.equals(s1));
		
		 * System.out.println(s.equals(s2));
		 * System.out.println(s.hashCode()==s3.hashCode());
		 * System.out.println(s2.hashCode()==s3.hashCode()); //should be false
		 */	}

}