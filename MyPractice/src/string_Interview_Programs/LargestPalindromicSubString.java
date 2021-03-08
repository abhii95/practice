package string_Interview_Programs;

class LargestPalindromicSubString {
	public static void main(String[] args) {

		String str = "labammalayalamm";

		System.out.print(largestPalindrome(str));
	}

	private static String largestPalindrome(String str) {

		String longestPalindrome = "";
		int i = 0;
		int j = 1;

		while (i < j && j <= str.length()) {

			String str2 = str.substring(i, j);
			StringBuilder sbr = new StringBuilder(str2);

			if (str2.equals(sbr.reverse().toString())) {

				if (longestPalindrome.length() < str2.length())
					longestPalindrome = str2;

			}

			j++;

			if (j > str.length()) {
				i++;
				j = i + 1;
			}
		}

		return longestPalindrome;
	}
}