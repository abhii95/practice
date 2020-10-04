package practiceProgs;

public class Array_sum_max_SubArrayOfLengthN {

	static int array(int[] arr, int subArrLength) {

		int start = 0;
		int end = subArrLength - 1;
		int current_sum = 0;
		int max_sum = Integer.MIN_VALUE;

		// find the sum of 1st sub array

		for (int i = 0; i < subArrLength; i++)
			current_sum = current_sum + arr[i];

		for (;;) {

			if (current_sum > max_sum)
				max_sum = current_sum;

			end++;
			if (end > arr.length - 1)
				break;
			current_sum = current_sum - arr[start] + arr[end];
		}

		return end - 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 2, 10, 1, 11, 3, 1, 0, 20 };
		int subArrayLength = 4;

		int endIndex = array(arr, subArrayLength);

		int len = subArrayLength;
		while (len > 0) {
			System.out.print(arr[endIndex - len-- + 1] + " ");
		}

	}

}
