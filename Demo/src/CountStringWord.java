import java.util.HashMap;

public class CountStringWord {

	public static void main(String[] args) {
		
		String str = "This is the the count string word is count";
		String[] split = str.split(" ");
		
		HashMap<String, Integer> ha = new HashMap<String, Integer>();
		
		for (int i = 0; i < split.length; i++) {
			
			if (ha.containsKey(split[i])) {
				
				int count=ha.get(split[i]);
				ha.put(split[i], count + 1);
				
			} else {
				ha.put(split[i], 1);
			}
		}
		System.out.println(ha);

	}

}
