package practiceProgs;

public class Array_sum_given_SubArrayOfLengthN {

	static int array(int[] arr, int desiredSum, int subArrLength) {

		int start = 0;
		int end = subArrLength - 1;
		int current_sum = 0;

		// find the sum of 1st sub array

		for (int i = 0; i < subArrLength; i++)
			current_sum = current_sum + arr[i];

		for (;;) {

			if (current_sum == desiredSum)
				break;
			else {
				end++;
				if (end > arr.length - 1)
					break;
				current_sum = current_sum - arr[start] + arr[end];
				start++;
			}
		}

		return end;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 0, 4, 2, 10, 2, 3, 1, 0, 20 };
		int desriredSum = 18;
		int subArrayLength = 4;

		int endIndex = array(arr, desriredSum, subArrayLength);

		int len = subArrayLength;
		while (len > 0) {
			System.out.print(arr[endIndex - len-- + 1] + " ");
		}

	}

}
