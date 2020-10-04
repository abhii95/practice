package practiceProgs;

import java.util.HashSet;

public class RemoveDuplicates {

	// Remove duplicates from String
	public static String remove(String str) {

		StringBuilder sbr = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (sbr.toString().indexOf(str.charAt(i)) == -1)
				sbr.append(ch);
		}

		return sbr.toString();

	}

	// Remove duplicates from character Array
	public static char[] remove(char[] array) {

		String str = String.valueOf(array);

		return remove(str).toCharArray();

	}

	// Remove duplicates from Integer Array
	public static Object[] remove(int[] array) {

		// Arrays.sort(array);
		int length = array.length;

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 1; i < length; i++) {

			if (!set.contains(array[i]))
				set.add(array[i]);

		}

		return set.toArray();

	}

	public static void main(String[] args) {

		String str = "Malayalam";

		int[] arr = { 1, 1, 2, 3, 4, 4, 4, 0, 0, 4, 5 };

		System.out.println(remove(str));

		Object[] sarr = remove(arr);

		for (int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}
	}

}
