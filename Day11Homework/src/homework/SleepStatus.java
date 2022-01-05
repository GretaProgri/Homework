package homework;

public class SleepStatus {

	public static void main(String[] args) {
		boolean result = sleepIn(false, false);
		System.out.println(result);
	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		boolean result = false;
		{
			if (isWeekday == isVacation) {
				result = true;
			}
			return result;

		}

	}

}
