package homework;

public class MonkeyStatus {
	public static void main(String[] args) {
		boolean result = monkeyTrouble(true, true);
		System.out.println(result);

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean result = false;
		{
			if (aSmile == bSmile) {
				result = true;
			}
			return result;
		}

	}

}

