package interview;

public class SubArrayOfLongestLengthOfSumK {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 1, 1, 1, 3, 4, 5, 0, 0, 0, 0, 6, 7, 8, 9, 10 };
		int desiredSum = 15;
		longArray(arr, desiredSum);
		// -> 0-7

	}

	// Resizing window Technique if all numbers are positive
	private static void longArray(int[] arr, int desiredSum) {

		int leftpointer = 0;
		int rightpointer = 0;
		int currentSum = arr[0];
		int noOfKsumSubArraysCount = 0;
		int sIndex = 0;
		int eIndex = 0;
		int len = 0;

		for (;;) {

			if (currentSum == desiredSum) {
				noOfKsumSubArraysCount++;
				if (rightpointer - leftpointer >= len) {
					sIndex = leftpointer;
					eIndex = rightpointer;
					len = eIndex - sIndex;
				}
				System.out.printf("subArray %d found between indexes %d and %d\n", noOfKsumSubArraysCount, leftpointer,
						rightpointer);

			} else if (currentSum > desiredSum) {

				currentSum = currentSum - arr[leftpointer];
				leftpointer++;
				continue;
			}

			rightpointer++;
			if (rightpointer < arr.length)
				currentSum = currentSum + arr[rightpointer];
			else
				break;

		}

		System.out.printf(
				"\nTotal no of subArrays of sum %d are %d \n\nLong SubArray of length %d -> StartIndex: %d & EndIndex: %d",
				desiredSum, noOfKsumSubArraysCount, len, sIndex, eIndex);
	}

}
