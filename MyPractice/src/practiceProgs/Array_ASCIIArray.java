package practiceProgs;

public class Array_ASCIIArray {

	// This method gives count of characters in a string

	public static int[] generateASCIIArrayFromString(String str) {

		// Create array to keep the count of individual
		// characters and initialize the array as 0

		// A-65 TO Z-90
		// a-97 TO Z-122

		int[] asciiArray = new int[256];

		for (int i = 0; i < str.length(); i++)
			asciiArray[str.charAt(i)]++;

		/*
		 * char[] charArray = str.toCharArray(); for (char ch : charArray)
		 * asciiArray[(int) ch]++;
		 */

		return asciiArray;

	}

}