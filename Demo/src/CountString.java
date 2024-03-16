import java.util.HashMap;
import java.util.Map;

public class CountString {
	// COUNT EACH CHARECTER IN A STRING
	static void countCharecter(String inputString) {
		
		// Creating a HashMap containing char as a key and occurrences as a
		// value
		
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		// Converting given string to char array
		char[] chArray = inputString.toCharArray();
		
		// checking each char of strArray
		for (char ch : chArray) {

			if (charCountMap.containsKey(ch)) {
				
				// If char is present in charCountMap, incrementing it's count
				// by 1
				
				int count=charCountMap.get(ch);
				charCountMap.put(ch,count + 1);
				//charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(ch, 1);
			}
		}
		// Printing the charCountMap
		System.out.println(charCountMap);
	}
	public static void main(String[] args) {
		// count each chrecter in a String
		countCharecter("I love my countryi");
	}
}