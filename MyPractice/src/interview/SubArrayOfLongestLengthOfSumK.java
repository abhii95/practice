package interview;

public class SubArrayOfLongestLengthOfSumK {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 6, 7, 8, 9, 10 };
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

		while (rightpointer < arr.length) {

			if (currentSum == desiredSum) {
				noOfKsumSubArraysCount++;
				if (len < rightpointer - leftpointer) {
					sIndex = leftpointer;
					eIndex = rightpointer;
					len = eIndex - sIndex;
				}
				rightpointer++;

			} else if (currentSum > desiredSum && leftpointer < rightpointer) {
				leftpointer++;
				currentSum = currentSum - arr[leftpointer];
			}

			if (currentSum < desiredSum) {
				rightpointer++;
				currentSum = currentSum + arr[rightpointer];
			}

		}

		System.out.printf("Total no of subArrays of sum %d is %d \nLong SubArray -> StartIndex: %d & EndIndex: %d",
				desiredSum, noOfKsumSubArraysCount, sIndex, eIndex);
	}

}
