import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no?");
		int num=scan.nextInt();
		
		//int num = 4;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			//System.out.println(fact);
		}
		System.out.println(fact);
	}

}
