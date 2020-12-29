package string_Interview_Programs;

public class StringsAnagramsOrNot {

	public static void main(String[] args) {

		String str1 = "geeksforgeeks@@!&";
		String str2 = "forg@@!&eeksgeeks";

		if (anagramsOrNot(str1, str2))
			System.out.printf("%s and %s are Anagrams", str1, str2);
		else
			System.out.printf("%s and %s are not Anagrams", str1, str2);

	}

	private static boolean anagramsOrNot(String str1, String str2) {

		boolean isAnagram = true;

		if (str1.length() == str2.length()) {

			int[] asciiArray = new int[256];

			for (int i = 0; i < str1.length(); i++) {
				asciiArray[str1.charAt(i)]++;
				asciiArray[str2.charAt(i)]--;
			}

			for (int i = 0; i < asciiArray.length; i++) {
				if (asciiArray[i] != 0)
					isAnagram = false;
			}

		} else
			isAnagram = false;

		return isAnagram;

	}

	/*
	 * private int[] asciiArray(String str) {
	 * 
	 * int[] asciiArray = new int[256];
	 * 
	 * for (int i = 0; i < str.length(); i++) {
	 * 
	 * asciiArray[str.charAt(i)]++; }
	 * 
	 * return asciiArray; }
	 */

}
