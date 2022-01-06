package homework;

public class DoubleTotal {

	public static void main(String[] args) {

		int  myTotal = sumDouble(2, 3);
		System.out.println(myTotal);
	}

	public static int sumDouble(int valueOne, int valueTwo) {

		int myTotal = valueOne + valueTwo;
		if (valueOne == valueTwo) {
			myTotal = myTotal * 2;

		}
		return myTotal;
	}

}
