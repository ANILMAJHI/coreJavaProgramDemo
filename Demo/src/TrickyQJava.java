
public class TrickyQJava {

	public static void main(String[] args) {

		Integer s1 = 10;
		Integer s2 = 10;
		Integer s3 = 500;
		Integer s4 = 500;

		if (s1 == s2) {
			System.out.println("s1==s2");
		} else {
			System.out.println("s1 not s2");
		} // Java uses a cache for the values from -128 to 127. This means that if you
			// create Integer objects with values in this range, they will reference the
			// same objects
		if (s3 == s4) {
			System.out.println("s3==s4");
		} else {
			System.out.println("s3 not s4");
		}
	}
}
