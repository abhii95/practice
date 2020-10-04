package practiceProgs;

public class Array_longSubArrayOfSumS {

	static int[] longSubArray(int[] arr, int desiredSum) {

		int i = 0;
		int j = 0;
		int sum = arr[i];

		int subArraylen = 0;
		int currentlen = 0;
		int stIndex = 0;

		/*
		 * Input : arr[] = { 10, 5, 2, 7, 1, 9 }, k = 15
		 */

		for (;;) {

			if (sum == desiredSum) {

				currentlen = j - i + 1;

				if (currentlen > subArraylen) {
					subArraylen = currentlen;
					stIndex = i;
				}
			}

			j = j + 1;
			if (j >= arr.length)
				break;
			sum = sum + arr[j];

			if (sum > desiredSum) {

				i = i + 1;
				j = i;
				sum = arr[i];
			}

		}

		int[] narr = new int[subArraylen];

		for (int l = 0; l < subArraylen; l++) {

			narr[l] = arr[stIndex];
			stIndex++;
		}

		return narr;

	}

	public static void main(String[] args) {

		int[] arr = { -10, 5, 5, -3, 13, 5, 0, 3, 7, 1, 9, 1, 3 };

		printArray(longSubArray(arr, 15));

	}

	static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
