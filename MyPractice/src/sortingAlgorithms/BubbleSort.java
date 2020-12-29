package sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 15, 16, 6, 8, 5, 3, 6, 7, 6, 7, 8 };

		for (int i = 0; i < arr.length; i++) {

			boolean isNotSwapped = true;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					isNotSwapped = false;
				}
			}

			if (isNotSwapped)
				break;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
