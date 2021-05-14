import java.util.Scanner;

public class SymbolicDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter check details");

		String check = sc.next();

		if (check.equalsIgnoreCase("{[()]}") || check.equalsIgnoreCase("[()]") || check.equalsIgnoreCase("()")
				|| check.equalsIgnoreCase("[]") || check.equalsIgnoreCase("{}")) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}
		main(args);
	}

}
