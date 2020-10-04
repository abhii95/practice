package practiceProgs;

public class Array_square_sort {

	/*
	 * { -7,-3,-1,0,1,4,6,8} -> { 0, 1, 4, 9, 16, 25, 36}
	 */

	static int[] arr(int[] sortedArr) {

		int len = sortedArr.length;
		int left = 0, right = len - 1;
		int[] result = new int[len];

		for (int i = len - 1; i >= 0; i--) {

			if (sortedArr[right] > Math.abs(sortedArr[left])) {
				result[i] = sortedArr[right] * sortedArr[right];
				right--;
			} else // if (Math.abs(sortedArr[left]) > sortedArr[right]) {
			{
				result[i] = sortedArr[left] * sortedArr[left];
				left++;
			} /*
				 * else { result[i] = sortedArr[right] * sortedArr[right]; i--; result[i] =
				 * sortedArr[left] * sortedArr[left]; right--; left++; }
				 */

		}

		/*
		 * for (int k = 0; k < len; k++) { if (sortedArr[k] < 0) i = k; }
		 * 
		 * j = i + 1;
		 * 
		 * while (count < len) {
		 * 
		 * if (sortedArr[j] < Math.abs(sortedArr[i])) {
		 * 
		 * sqrdSorted[count] = sortedArr[j] * sortedArr[j]; j++;
		 * 
		 * } else if (sortedArr[j] > Math.abs(sortedArr[i])) {
		 * 
		 * sqrdSorted[count] = sortedArr[i] * sortedArr[i]; i--; } else {
		 * sqrdSorted[count] = sortedArr[j] * sortedArr[j]; count++; sqrdSorted[count] =
		 * sortedArr[i] * sortedArr[i]; j++; i--; } count++; }
		 */

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { -7, -3, -1, 0, 1, 4, 6, 8 };

		printArray(arr);
		printArray(arr(arr));

	}

	static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
