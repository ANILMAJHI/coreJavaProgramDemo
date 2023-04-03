
public class Swap2No {

	public static void main(String[] args) {
		int a=34,b=54;
		System.out.println("before swap:");
		System.out.println("a value="+a+".."+"b value="+b);
		
		
		//a=10, b=20
		a=a+b;	//30
		b=a-b; //30-20=10=b
		a=a-b;
		
		System.out.println("after swap:");
		System.out.println("a="+a+"..."+"b="+b);
		
	}
}
