package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ArrayElementRepeatedElementNumberOfTimes {

	// Check whether there is an element in an Array which repeated exactly element
	// number of time. If there are multiple elements of such kind return the
	// largest element among those.
	// { 3, 8, 2, 3, 3, 2 };-> 3 repeated 3 times and 2 repeated 2 times. As 3 > 2
	// Output ::>> 3

	public static void main(String[] args) {

		int[] A = { 3, 8, 2, 3, 3, 2 };
		;// {3,1,4,1,5};//{7,1,8,2};// { 3, 8, 2, 3, 3, 2 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

		for (int index = 0; index < A.length; index++) {

			int num = A[index];
			if (frequencyMap.containsKey(num))
				frequencyMap.put(num, frequencyMap.get(num) + 1);
			else
				frequencyMap.put(num, 1);
		}

		Set<Map.Entry<Integer, Integer>> entries = frequencyMap.entrySet();

		int maxNum = 0;

		for (Entry<Integer, Integer> entry : entries) {

			int keyCount = entry.getKey();
			int valueCount = entry.getValue();

			if (keyCount == valueCount && keyCount > maxNum) {
				maxNum = keyCount;
			}
		}

		return maxNum;

	}

}
