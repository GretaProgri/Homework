package homework;

public class Subtraction {
	public static void main(String[] args) {

		int result = difference21(19);
		System.out.println(result);

	}

	public static int difference21(int number) {

		if (number < 21) {
			return (number - 21);
		} else {
			return (number - 21) * 2;
		}

	}
}
