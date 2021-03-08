package interview;

public class SubArrayOfMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 3, -2, 6, 7, -10, -10, 4, 5, 9, -3, 4, 7, -28, 2, 9, 3, 2, 11 };
		int[] arr2 = subArrayOfMaxSum(arr);
		System.out.println("Max sum: " + arr2[2]);
		System.out.printf("SubArray StartIndex: %d EndIndex: %d ", arr[0], arr[1]);
	}

	// kadanaes Algorithm
	private static int[] subArrayOfMaxSum(int[] arr) {

		int length = arr.length;
		int startIndex = 0;
		int newStartIndex = 0;
		int endIndex = 0;

		int currentsum = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < length; i++) {

			if (currentsum > maxSum) {
				maxSum = currentsum;
				endIndex = i - 1;
				startIndex = newStartIndex;
			}

			// Elements Decision
			if (currentsum > 0) {
				currentsum = currentsum + arr[i];
			} else {
				currentsum = arr[i];
				newStartIndex = i;
			}

		}

		int[] arr2 = { startIndex, endIndex, maxSum };
		return arr2;

	}

}
