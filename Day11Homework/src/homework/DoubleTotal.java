package homework;

public class DoubleTotal {

	public static void main(String[] args) {

		int result = sumDouble(2, 3);
		System.out.println(result);
	}

	public static int sumDouble(int valueOne, int valueTwo) {

		int result = valueOne + valueTwo;
		if (valueOne == valueTwo) {
			result = result * 2;

		}
		return result;
	}

}