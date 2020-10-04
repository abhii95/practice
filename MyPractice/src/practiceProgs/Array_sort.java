package practiceProgs;

public class Array_sort {

	/*
	 * input : {2, 1, 7, 5, 4}
	 * 
	 */

	static int[] arr(int[] arr) {

		int i = 0;
		int j = 1;
		int len = arr.length;

		while (i != len - 1) {

			if (arr[i] > arr[j]) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

			if (j == len - 1) {
				i++;
				j = i;
			}

			j++;
		}

		return arr;

	}

	public static void main(String[] args) {

		int[] arr = { 2, 1, 7, 5, 4 };

		int[] srtdArr = arr(arr);

		for (int k = 0; k < srtdArr.length; k++) {
			System.out.print(srtdArr[k] + " ");
		}

	}

}
