package practiceProgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VowelsInEachWordOfString {

	public static void main(String[] args) {

		String str = "Adam and Eve      are right   below the Apple tree ";
		countVowelsInString2(str);
	}

	static void printNoOfVowelsInEachWordOfSentence(String str) {

		String[] strArray = str.split("\\s+");
		for (String subStr : strArray) {
			System.out.println(subStr + "(" + countVowelsInString(subStr) + ")");
		}
	}

	public static void countVowelsInString2(String str) {

		String word = "";
		int wordVowelCount = 0;
		int vowelCount = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.toLowerCase().charAt(i);
			if (ch == ' ' && wordVowelCount > 0) {
				System.out.printf("Vowels count in %s : %d \n", word, wordVowelCount);
				vowelCount = vowelCount + wordVowelCount;
				word = "";
				wordVowelCount = 0;
			} else {
				word = word + ch;
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					wordVowelCount++;
			}
		}

		System.out.printf("Vowels count given String is : %d", vowelCount);
	}

	public static int countVowelsInString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		return count;
	}

	public static void printEachVowelCountInString(String str) {

		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < str.length(); i++) {

			int ch = (int) str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (hmap.containsKey(ch)) {
					int val = hmap.get(ch);
					val++;
					hmap.put(ch, val);
				}

				else
					hmap.put(ch, 1);
			}
		}

		Set<Map.Entry<Integer, Integer>> entries = hmap.entrySet();

		for (Entry<Integer, Integer> entry : entries) {

			int ch = (int) entry.getKey();
			int val = (int) entry.getValue();

			System.out.println((char) ch + " " + val);

		}
	}

}
