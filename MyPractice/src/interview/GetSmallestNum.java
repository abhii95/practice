package interview;

public class GetSmallestNum {

	public static void main(String[] args) {

		int num = 50;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {

			if (getSumOfDigitsInNum(i) == num) {
				System.out.println(i);
				break;
			}

		}

	}

	private static int getSumOfDigitsInNum(int num) {

		int sum = 0;
		while (num > 0) {

			sum = sum + (num % 10);
			num = num / 10;
		}
		return sum;
	}
}
