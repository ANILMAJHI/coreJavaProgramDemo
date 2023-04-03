
public class SwapingNO {

	public static void main(String[] args) {
		int i=4, j=5, temp;
		System.out.println("before swaping:"+"i:"+ i +" "+"j:"+ j);
		/*
		 * temp=i; i=j; j=temp;
		 */
		i= i+j;
		j=i-j;
		i=i-j;
		System.out.println("after swaping:"+"i:"+ i +" "+"j:"+ j);
		
	}
}
