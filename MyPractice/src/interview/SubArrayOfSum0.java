package interview;

import java.util.HashSet;

public class SubArrayOfSum0 {

	public int noOfSubArrayOfSum0(int[] arr) {

		int cumulativeSum = 0;
		HashSet<Integer> freq = new HashSet<Integer>();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			freq.add(cumulativeSum);
			cumulativeSum = cumulativeSum + arr[i];

			if (freq.contains(cumulativeSum))
				count++;
		}

		return count;

	}

	public static void main(String[] args) {
		
		

	}

}
