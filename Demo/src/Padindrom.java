
public class Padindrom {

	public static void main(String[] args) {

		int i, sum = 0, temp;
		int num = 191;
		
		temp = num;
		while (num > 0) {
			i = num % 10;
			sum = (sum * 10) +i;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println(temp+": this is palindrom");
		else
			System.out.println(temp+" it is NOT a palindrom");
	}
}