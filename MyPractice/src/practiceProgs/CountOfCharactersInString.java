package practiceProgs;

import java.util.HashSet;

public class CountOfCharactersInString {

	public static void printCountOfEachCharacterInString(String str) {

		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// OutputStreamWriter(System.out));

		int[] count = Array_ASCIIArray.generateASCIIArrayFromString(str);

		/*
		 * Traversing through each and every character in string and using that
		 * character as input to count array to get count
		 */

		HashSet<Character> hs = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!(hs.contains(ch))) {

				hs.add(ch);
				System.out.println(ch + "->" + count[str.charAt(i)]);
			}

		}

	}

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		printCountOfEachCharacterInString("Malayalam");
		long endTime = System.currentTimeMillis();

		System.out.println("Total Time :" + (endTime - startTime));
	}

}
