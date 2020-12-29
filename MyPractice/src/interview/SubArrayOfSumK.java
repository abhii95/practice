package interview;

import java.util.HashMap;

public class SubArrayOfSumK {

	// If difference between two Cumulative sums is equal to 0 then there exists a
	// subArray between them whose sum is zero
	// If a cumulative sum is equal to desired number or difference between c sum
	// and desired number gives already exist number then there is sub Array whose
	// sum is equal to desired sum

	// prefix sum

	public static void main(String[] args) {

		int[] arr = { 10, 2, -2, -20, 10 };
		;// { 3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1 };

		HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

		int cumulativeSum = 0;
		int subArrayCount = 0;
		int desiredNo = -10;

		frequencyMap.put(0, 1);

		for (int i = 0; i < arr.length; i++) {

			cumulativeSum = cumulativeSum + arr[i];

			frequencyMap.put(cumulativeSum, frequencyMap.getOrDefault(cumulativeSum, 0) + 1);

			if (frequencyMap.containsKey(cumulativeSum - desiredNo)) {

				subArrayCount = subArrayCount + frequencyMap.get(cumulativeSum - desiredNo);
			}

		}

		System.out.println(subArrayCount);
	}
}
