package interview;
public class SmallestNumberWhichEqualToNum {

	// get Smallest Number whose sum of digits is equal to Given Number
	public static void main(String[] args) {

		int num = 49;

		System.out.println(solution(num));
	}

	public static int solution(int A) {

		int thatNumber = 0;
		for (int num = 0; num <= 599999; num++) {
			int retivedSum = getSumOfDigitsInNum(num);
			if (A == retivedSum) {
				thatNumber = num;
				break;
			}
		}

		return thatNumber;

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
