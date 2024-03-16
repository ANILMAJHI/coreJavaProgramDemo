public class RemoveConsecutiveDuplicates {
	public static void countString(String str) {
		
		StringBuffer sb=new StringBuffer();
		char results=0;
		char []ch=str.toCharArray();
		for(char c:ch) {
			
			if(c!=results) {
				sb.append(c);
				
			}
			results=c;
		}
		System.out.println(sb);
		
	}

	public static void main(String[] args) {
		countString("Striinng");
	}

}