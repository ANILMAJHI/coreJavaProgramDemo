import java.util.concurrent.ConcurrentHashMap;

public class FindFirstDuplicate {
	
	public static void main(String[] args) {
		
		
		String str="hlo jevaa";
		
		boolean flage= true;
		
		char[]ch=str.toCharArray();
		
		outerLoop:
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j])
				{
					System.out.println("first duplicate char: "+ch[i]);
					flage=false;
					break outerLoop;
				}
			}
			
		}
		if(flage) {
			System.out.println("duplicate char not found...");
		}
	}
}
