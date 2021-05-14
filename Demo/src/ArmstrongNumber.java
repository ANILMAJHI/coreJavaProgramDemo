public class ArmstrongNumber {

	public static void main(String[] aigs) {

		int sum = 0, temp, i;
		int num = 153;
		temp = num;
		while (num > 0) {
			i = num % 10;
			num = num / 10;
			sum = sum + (i * i * i);

		}
		if (temp == sum) {
			System.out.println("ArmstrongNumber");
		} else {
			System.out.println("not ArmstrongNumber");
		}

	}
}
