public class ArmstrongNumber {

	public static void main(String[] aigs) {

		int sum = 0, temp, i;
		int num = 153;
		temp = num;
		while (num > 0) {
			i = num % 10;
			
			sum = sum + (i * i * i);
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println(temp+": ArmstrongNumber");
		} else {
			System.out.println(temp+":not ArmstrongNumber");
		}

	}
}
