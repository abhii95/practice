package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Sorts {

	static int[] arr = { 2, 1, 6, 2, 3, 1 };

	public static void main(String[] args) {

		int[] arr2 = { 2, 1, 6, 2, 3, 1 };

		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				if (o1 > o2)
					return 1;
				else if (o1 < o2)
					return 1;
				else
					return 0;
			}

		};

		// Arrays.sort(arr2, comp);

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}
