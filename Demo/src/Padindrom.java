
public class Padindrom {

	public static void main(String[] args) {

		int i, sum = 0, temp;
		int num = 1991;
		
		temp = num;
		while (num > 0) {
			i = num % 10;
			sum = (sum * 10) +i;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("this is palindrom");
		else
			System.out.println("it is not a palindrom");
	}
}